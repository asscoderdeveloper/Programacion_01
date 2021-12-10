/*
Tras introducir una secuencia de caracteres por teclado, visualizar las palabras 
con un numero par de caracteres vocales 
 */
package gamificacion_09;

public class programa_03 {
    public static void main (String []args) throws Exception{

        //declaracion de la variable palabra
        Palabra palabra = new Palabra();
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        //algoritmo
        while(palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            if(palabra.numeroParVocales()){
                System.out.println(palabra.toString());
            }
        }
    }
}
