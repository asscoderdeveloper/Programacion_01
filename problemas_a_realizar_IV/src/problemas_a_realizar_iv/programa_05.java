package problemas_a_realizar_iv;

import java.io.FileReader;

public class programa_05 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        final int FINAL_FICHERO = -1;
        final char SPACE = ' ';
        //
        FileReader fichero;
        // 
        int codigo, numVocales = 0, numConsonantes = 0, numEspacios = 0;
        
        //ACCIONES
        fichero = new FileReader("problema5.txt");
        //lectura
        codigo = fichero.read();
        //bucle de lectura
        while(codigo != FINAL_FICHERO){
            if((codigo == 'a')||(codigo == 'e')||(codigo == 'i')||(codigo == 'o')||(codigo == 'u')){
                numVocales++;
            }
            else{
                if(codigo == SPACE){
                    numEspacios++;
                }
                else{
                    numConsonantes++;
                }
            }
            //leer siguiente caracter
            codigo = fichero.read();
        }
        //cerrar el fichero
        fichero.close();
        System.out.println("La cantidad de vocales es de: "+numVocales+""
                + "\n"
                + "La cantidad de consonantes es de: "+(numConsonantes-1)+""
                + "\n"
                + "La cantidad de espacios es de: "+numEspacios);
    }
}
