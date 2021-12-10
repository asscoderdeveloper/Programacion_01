/*

 */
package gamificacion_09;

public class programa_05 {
    public static void main (String []args) throws Exception{

        //declaracion de la variable palabra
        Palabra palabra = new Palabra();
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        //algoritmo
        while(palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            if(palabra.numeroVocales()>palabra.numeroConsonates()){
                System.out.println(palabra.toString());
            }
        }
    }
}