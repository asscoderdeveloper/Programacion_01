package gamificacion_06;

/* Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualiza todas aquellas palabras que empiecen en “ion” */

public class programa_15 {
    //variables 
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_15().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        boolean x = false;
        int contador = 0;
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres finalizada en . : ");
        character = LT.readChar();
        //llamar a la funcion encargada de buscar palabras
        buscarPalabra();
        //algoritmo
        while((character != FIN)&&(character != SPACE)){
            x = buscador();
            if(x){
                contador++;
            }
            buscarPalabra();
        }
        
        System.out.println("El numero de palabras que empiezan en ion es: " + contador);
        
    }
    //funcion encargada de buscar palabras
    private void buscarPalabra() {
        while (character==SPACE) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //funcion encargada de ver si la palabra acaba en ion
    private boolean buscador(){
        //variables
        boolean x = false;
        char lastChar;
        //algoritmo
        while((character != SPACE)&&(character != FIN)){
            lastChar = character;
            character = LT.readChar();
            if((lastChar == 'i')&&(character == 'o')){
                lastChar = character;
                character = LT.readChar();
                if((lastChar=='o')&&(character == 'n')){
                    lastChar = character;
                    character = LT.readChar();
                    if((character != FIN)&&(character != SPACE)){
                        x = true;
                    }
                }
            }
        }
        return x;
    }
}
