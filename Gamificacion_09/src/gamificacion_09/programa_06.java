/*

 */
package gamificacion_09;

public class programa_06 {
    public static void main (String []args) throws Exception{
        //declaracion del objeto palabra
        Palabra palabra = new Palabra();
        //algoritmo
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        while(palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            if(palabra.vocalA()){
            System.out.println(palabra.toString());
            }
        }
        
    }
}
