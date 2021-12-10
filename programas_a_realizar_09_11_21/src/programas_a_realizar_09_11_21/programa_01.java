package programas_a_realizar_09_11_21;

/* Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualiza la primera palabra que tenga las cinco vocales. En caso, que no haya ninguna palabra
que verifique la condición del problema se visualizará el mensaje correspondiente */

public class programa_01 {
    //variables 
    char FIN = '.', SPACE = ' ';
    int espacio = 0; // guarda la posicion de los espacios
    int aux = 0;          // guarda la posicion del espacio anterior
    char [] character = new char [500];
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_01().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        
        //algortimo
        //llamar a la funcion encargada de incializar la variable character
    }
    private void inicializador(){
        //variables
        
        //inicializa la variable
        System.out.println("Introduce una cadena de caracteres acabada en . :");
        for(int indice = 0; indice<character.length; indice++){
            character[indice] = LT.readChar();
        }
        
    }
}
   
    