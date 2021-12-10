package gamificacion_06;

/* Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualiza todas aquellas palabras que tengan más de 5 caracteres y menos de 15 caracteres */

public class programa_12 {
    // variables
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_12().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int contador = 0;
        boolean x = false;
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres finalizada en . : ");
        character = LT.readChar();
        //llamar a la funcion encargada de buscar palabras
        buscarPalabra();
        //algoritmo
        while(character != FIN){
            x = buscador();
            if(x){
                contador++;
            }
            buscarPalabra();
        }
        System.out.println("El numero de palabras que contienen entre 5 y 15 caracteres es de: " + contador);
    }
    //funcion encargada de buscar palabras
    private void buscarPalabra() {
        while (character==SPACE) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    private boolean buscador(){
        //variables
        int contador = 0;
        boolean x = false;
        //algoritmo
        while((character != FIN)&&(character != SPACE)){
            contador++;    
            character = LT.readChar();
        }
        if((5<=contador)&&(contador<=15)){
            x=true;
        }
        return x;
    }
}
