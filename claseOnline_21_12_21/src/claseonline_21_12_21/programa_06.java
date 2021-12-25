//DADA UNA SECUENCIA DE CARACTERES LEIDA DESDE UN FICHERO DE TEXTO, GRABAR EN OTRO
//FICHERO DE TEXTO SU FRECUENCIA DE PALABRAS
package claseonline_21_12_21;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class programa_06 {
    //main
    public static void main (String []args)throws Exception{
        new programa_06().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //declaracion de un objeto PalabrasFicheroLectura para poder leer las palabras del fichero
        PalabraFicherosLectura fichero;
        //declaracion de un objeto BufferedWriter para poder escribir dentro de un fichero
        BufferedWriter fichero2;
        //declracion de un onjeto frecuencia
        FrecuenciaPalabra frecuencia = new FrecuenciaPalabra();
        //declracion de un objeto palabra
        Palabra palabra = new Palabra();
        
        //ACCIONES
        //instanciacion de los ficheros
        fichero = new PalabraFicherosLectura("texto.txt");
        fichero2 = new BufferedWriter(new FileWriter("frecuencias.txt"));
        
        //BUCLE DE LECTURA Y TRATAMIENTO
        while(fichero.hayPalabras()){
            //lectura
            palabra = fichero.lectura();
            //actualizacion
            frecuencia.actualizacion(palabra);
        }
        System.out.println(frecuencia.toString());
        
        //GRABACION DENTRO DEL FICHERO
        Palabra [] palabras = frecuencia.getPalabras();
        for(int indice = 0; indice<frecuencia.getNumeroPalabras();indice++){
            fichero2.write(frecuencia.toString((palabras[indice ])));
            //salto de linea
            fichero2.newLine();
        }
        //cierre de los enlaces
        fichero.cerrarEnlaceFichero();
        fichero2.close(); 
    }
}
