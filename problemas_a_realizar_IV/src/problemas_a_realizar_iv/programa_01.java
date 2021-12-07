package problemas_a_realizar_iv;

import java.io.FileReader;
import java.io.FileWriter;

public class programa_01 {
    //metodo main
    public static void main (String []args)throws Exception{
        //DECLARACIONES
        //declaracion constante entera para representar el código de final de fichero
        final int FINAL_FICHERO = -1;
        //declaracion objeto FileReader para lectura con fichero de texto
        FileReader fichero;
        FileWriter fichero2;
        //declaración de una variable entera para almacenar, de uno en uno, los códigos
        //de caracteres contenidos en el fichero problema1In.txt
        int codigo;
        
        //ACCIONES
        //instanciación objeto FileReader fichero para establecer enlace con el fichero 
        //físico fichero1.txt
        fichero=new FileReader("problema1In.txt");
        //
        fichero2 = new FileWriter("problema1Out.txt");
        //letura primer codigo de caracter del fichero
        codigo = fichero.read();
        //bucle de lectura desde el fichero y visualización 
        while (codigo!=FINAL_FICHERO){
            //grabacion al fichero2
            fichero2.write((char)codigo);
            //leer el siguiente caracter
            codigo = fichero.read();
        }
        //<cerrar el fichero
        fichero.close();
        fichero2.close(); 
    }
}
