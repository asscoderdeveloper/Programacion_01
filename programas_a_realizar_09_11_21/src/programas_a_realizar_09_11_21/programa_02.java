package programas_a_realizar_09_11_21;

/* Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualiza la primera palabra que tenga el mismo número de vocales que consonantes. En caso,
que no haya ninguna palabra que verifique la condición del problema se visualizará el mensaje
correspondiente */

public class programa_02 {
    //variables 
    char FIN = '.', SPACE = ' ';
    int espacio = 0; // guarda la posicion de los espacios
    int aux = 0;    // guarda la posicion del espacio anterior
    char [] character = new char [500];
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_02().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        
        //llamar a la funcion encargada de incializar la variable
        inicializador();
       
    }
    private void inicializador(){
        //variables

        //algoritmo
        System.out.println("Introduce una secuencia de caracteres acabada en . :");
        for(int indice = 0; indice<character.length;indice++){
            character[indice] = LT.readChar(); 
            if(character[indice] == FIN){
                break;
            }
            if(character[indice] == SPACE){
                aux = espacio;
                espacio =  indice;
            }
        }
        //llamar a la funcion encargada de comprobar si la palabra tiene 
            // las cinco vocales

            buscador();
    }
    private void buscador(){
        //variables                       auxiliar es para almacenar el valor de vocales
        int consonantes = 0, vocales = 0, auxiliar = 0;
        //algoritmo
        for(int indice = aux; indice<espacio;indice++){
            auxiliar = vocales;
            switch (character[indice]){
                case 'a':
                    vocales++;
                    break;
                case 'e':
                    vocales++;
                    break;
                case 'i':
                    vocales++;
                    break;
                case 'o':
                    vocales++;
                    break;
                case 'u':
                    vocales++;
                    break;
            }
            
            if(auxiliar == vocales){
                consonantes++;
            }
        }
        if(vocales == consonantes){
            System.out.println("La primera palabra en tener el mismo numero de vocales"
                    + " y consonantes es: ");
            for(int indice = aux; indice<espacio;aux++){
                System.out.print(character[aux]);
            }
        }
    }
}
