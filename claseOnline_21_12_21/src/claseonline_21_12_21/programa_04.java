//GESTIONAR LA FRECUENCIA DE LOS CARACTERES ALMACENADOS EN UN FICHERO DE TEXTO Y
//IMPRIMIRLAS EN UN FICHERO LLAMADO frecuencias.txt
package claseonline_21_12_21;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class programa_04 {
    //metodo main
    public static void main(String []args)throws Exception{
        new programa_04().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //fichero lectura
        BufferedReader fichero1;
        //fichero escritura
        BufferedWriter fichero2;
        //declaracion integer que representa el final del fichero
        final int END = -1;
        //declracion objeto frecuencia caracteres para gestionar la frecuencia de caracteres
        FrecuenciaCaracteres frecuencia = new FrecuenciaCaracteres();
        //
        int codigo;
        
        //ACCIONES
        //instanciacion de los ficheros
        fichero1 =new BufferedReader(new FileReader("texto.txt"));
        fichero2 = new BufferedWriter(new FileWriter("frecuencias.txt"));  
        //lectura del primer caracter del fichero
        codigo = fichero1.read();
        //bucle
        while(codigo!=END){
            //aactualizacion
            frecuencia.actualizacion((char)codigo);
            //lectura 
            codigo = fichero1.read();
        }
        
        //obtencion de los caracteres de objeto
        char caracteres [] = frecuencia.getCaracteres();
        for(int indice = 0; indice<caracteres.length;indice++){
            fichero2.write(frecuencia.toString((caracteres[indice])));
            //sato de linea
            fichero2.newLine();
        }
        //cierre de los enlaces
        fichero1.close();
        fichero2.close();
    }
}
