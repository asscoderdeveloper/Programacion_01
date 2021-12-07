package problemas_a_realizar_iv;

import java.io.FileReader;

public class programa_02 {
    //metodo main
    public static void main (String []args)throws Exception{
        //DECLARACIONES
        //constante para representar el final del fichero
        final int FINAL_FICHERO = -1;
        FileReader fichero;
        int codigo;
        int contador = 0; 
        //ACCIONES
        //instanciacion de un objeto FileReader para establecer enlace 
        fichero = new FileReader("problema2.txt");
        //lectura
        codigo = fichero.read();
        //bucle de lectura desde el fichero y visualización
        while(codigo != FINAL_FICHERO){
            if((codigo == 'a')||(codigo == 'e')||(codigo == 'i')||(codigo == 'o')||(codigo == 'u')){
                contador++;
            }
            //lectura del siguiente caracter
            codigo = fichero.read();
        }
        //cerrar el fichero
        fichero.close();
        System.out.println("El numero de vocales que hay dentro del fichero es de: "+contador);
    }
}
