package problemas_a_realizar_iv;

import java.io.FileReader;

public class programa_04 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        //declaracion de constante entera para representar el codigo de final de fichero
        final int FINAL_FICHERO = -1;
        //declaracion de objeto file reader para la lectura de un fichero de texto
        FileReader fichero;
        //
        int codigo, contador = 0;
        char help;
        
        //ACCIONES
        //instanciacion de un objeto file reader fichero para establecer enlace
        //con el físico problema4.txt
        fichero = new FileReader("problema4.txt");
        //lectura del primer caracter
        codigo = fichero.read();
        //bucle de lectura desde el fichero y visualizacion
        while(codigo != FINAL_FICHERO){
            help = (char)codigo;
            if(help == 'l'){
                codigo = fichero.read();
                help = (char)codigo;
                if(help == 'a'){
                    contador++;
                }
            }
            //lectura
            codigo = fichero.read();
        }
        //cerrar fichero;
        fichero.close();
        System.out.println("El numero de parejas es de: "+contador);
    }
}
