package problemas_a_realizar_iv;

import java.io.FileReader;

public class programa_03 {
    //metodo main
    public static void main (String []args)throws Exception{
        //declaraciones
        final int FINAL_FICHERO = -1;
        //declaracion objeto file reader
        FileReader fichero;
        //declaracion de variable entera para alamcenar
        int codigo;
        char primeraVocal = 'k';
        
        //ACCIONES
        //instanciacion objeto FileReader
        fichero = new FileReader("problema3.txt");
        //lectura
        codigo = fichero.read();
        //bucle de lectura desde el fichero y visualizacion
        while(codigo!=FINAL_FICHERO){
            if((codigo == 'a')||(codigo == 'e')||(codigo == 'i')||(codigo == 'o')||(codigo == 'u')
                    &&(primeraVocal!='a')&&(primeraVocal!='e')&&(primeraVocal!='i')&&(primeraVocal!='o')
                    &&(primeraVocal!='u')){
                primeraVocal = (char)codigo;
            }
            //leer siguiente caracter
            codigo = fichero.read();
        }
        //cerrar el fichero
        fichero.close();
        if(primeraVocal == 'k'){
            System.out.println("No existe ninguna vocal dentro del fichero");
        }
        else{
            System.out.println("La primera vocal del fichero es: "+primeraVocal);
        }
    }
}
