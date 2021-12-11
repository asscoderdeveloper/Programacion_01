/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificacion_10;
public class programa_01 {
    //metodo main
    public static void main (String []args)throws Exception{
        new programa_01().metodoPrincipal();
    }
    //metodo principal
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //declaracion de objeto palabraficherolectura
        PalabraFicherosLectura fichero;
        //declaracion de objeto palabraficheroescritura
        PalabraFicherosEscritura fichero2;
        //declaracion de objeto palabra para almacenar los objetos palabra leídos
        //en el fichero
        Palabra palabra = new Palabra();
        
        //ACCIONES
        //instanciación del fichero de lectura 
        fichero = new PalabraFicherosLectura("programa1_1.txt");
        //instanciación del fichero de escritura
        fichero2 = new PalabraFicherosEscritura("programa1_2.txt");
        while(fichero.hayPalabras()){
            //lectura del obejto palabra
            palabra = fichero.lectura();
            //grabación de la palabra en el fichero 2
            fichero2.escritura(palabra);
            fichero2.escrituraSeparador();
        }
        fichero.cerrarEnlaceFichero();
        fichero2.cerrarEnlaceFichero();
    }
}
