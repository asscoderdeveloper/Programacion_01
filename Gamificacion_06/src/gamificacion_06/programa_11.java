package gamificacion_06;

/* Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualiza todas aquellas palabras que tengan las 5 vocales */

public class programa_11 {
    //variables 
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_11().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int contador = 0;
        boolean x = false;
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres acabada en .");
        character = LT.readChar();
        //llamar a la funcion buscar palabra
        buscarPalabra();
        //algoritmo
        while(character != FIN){
            x = buscador();
            if(x){
                contador++;
            }
            buscarPalabra();
        }
        System.out.println("El numero de palabras con 5 vocales es: "+ contador);
            
        
    }     
    //funcion encargada de buscar palabras
    private void buscarPalabra() {
        while (character==SPACE) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //funcion encargada de saltar los espacion 
    private void saltarPalabra() {
        //mientras el caracter leido sea alfabético se lee el sieguiente
        //caracter de la secuencia
        while ((character!=FIN)&&(character!=SPACE)) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //funcion encargada de buscar las vocales
    private boolean buscador(){
        boolean x = false;
        int contador = 0;
        int contadorGeneral = 0;
        while((character != SPACE)&&(character != FIN)){
            switch(character){
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
            }
            character = LT.readChar();
        }
        if(contador == 5){
            x = true;
            System.out.println(x);
        }
        return x;
    }
}
