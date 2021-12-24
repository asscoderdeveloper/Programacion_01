//programa encaragado de codificar un fichero seleccionado
package claseonline_21_12_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class programa_02 {
    //DECLARACION DE ATRIBUTOS
    //atributos de atributos tipo string para representar los nombres de los ficheros
    private String nombreFichero1, nombreFichero2;
    //declaracion de atributos enteros para representar el desplazamiento
    private int desplazamiento = 5; //5 por defecto
    
    //metodo main
    public static void main (String []args)throws Exception{
        new programa_02().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //declaracion de variable boolean para gestionar la salida
        boolean fin = false;
        //BUCLE MENU
        while(!fin){
            //visualizacion menu
            menu();
            //lectura opcion elegida
            int opcion = LT.readInt();
            //gestion
            switch (opcion){
                case 1:
                    codificacionDecodificacion(opcion);
                    break;
                case 2:
                    codificacionDecodificacion(opcion);
                    break;
                default: fin = true;
            }
        }
        //borrado de la pantalla
        clean();

    }
    //METODO ENCARGADO DE BORRAR LA PANTALLA
    private void clean(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    //METODO ENCARGADO DE VISUALIZAR EL MENU
    private void menu(){
        //visualizacion del menu
        System.out.println("                  MENU"
                + "\n(1)Codificacion"
                + "\n(2)Decodificacion"
                + "\n(3)Exit"
                + "\n");
        System.out.print("[] opcion --> ");
    }
    
    //METODO ENCARGADO DE LA CODIFICACION O DECODIFICACION DE UN FICHERO DEPENDIENDO
    //DE LA ENTRADA
    private void codificacionDecodificacion(int operacion)throws Exception{
        //declaracion de variable que representa el fin del fichero
        final int END = -1;
        //declaracion de un objeto BufferedReader para posibilitar la lectura
        BufferedReader fichero1;
        //declaracion de un objeto BufferedWriter para posibilitar la escritura
        BufferedWriter fichero2;
        //declaracion de un objeto CodificacionAlfabetica
        CodificacionAlfabetica codificacion;
        //declaracion de una variable entera para representar el código del caracter
        //leido desde el fichero
        int codigo;
        
        //ACCIONES
        //solicitud de nombres de ficheros
        solicitudNombreFicheros(operacion);
        //establecimiento de los enlaces
        fichero1 = new BufferedReader(new FileReader(nombreFichero1));
        //
        fichero2 = new BufferedWriter(new FileWriter(nombreFichero2));
        //instanciacion objeto codificacion alfabetica
        codificacion = new CodificacionAlfabetica(desplazamiento);
        //lectura del primer caracter del fichero
        codigo = fichero1.read();
        //bucle de lectura desde el fichero de entrada y de escritura desde el 
        //fichero de salida
        while(codigo!=END){
            char caracter = (char)codigo;
            //codificar/decodificar caracter
            switch(operacion){
                case 1: caracter = codificacion.codificar((char)codigo);break;
                case 2: caracter = codificacion.deCodificar((char)codigo);break;
            }
            //escritura en el fichero de salida
            fichero2.write(caracter);
            //lectura del siguiente caracter
            codigo = fichero1.read();
            
        }
        //cierre de los enlaces
        fichero1.close();
        fichero2.close();
    }
    
    //METODO ENCARGADO DE SOLICITAR LOS NOMBRES DE LOS FICHEROS
    private void solicitudNombreFicheros(int operacion)throws Exception{
        clean();
        switch(operacion){
            case 1: System.out.println("Nombre del fichero a codificar: ");
                    nombreFichero1 = LT.readLine();
                    System.out.println("Nombre del fichero codificado: ");
                    nombreFichero2 = LT.readLine();
                    break;
            case 2: System.out.println("Nombre del fichero a decodificar: ");
                    nombreFichero1 = LT.readLine();
                    System.out.println("Nombre del fichero decodificado: ");
                    nombreFichero2 = LT.readLine();
                    break;
        }
    }
}
