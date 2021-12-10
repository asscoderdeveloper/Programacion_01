/* 
Tras una secuencia de caracteres introducida por teclado contar las palabras que
tienen un numero para de caracteres
*/
package gamificacion_09;

public class programa_02 {
    public static void main (String [] args) throws Exception{
        //declaracion de la variable palabra
        Palabra palabra =  new Palabra();
        //mensaje para la lectura de caracteres
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        //bucle de tratamiento
        
        while (Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //tratamiento y visualizacion
            if(palabra.numeroParDeCaracteres()){
                System.out.println(palabra.toString());
            }
        }
        
        
    }
}
