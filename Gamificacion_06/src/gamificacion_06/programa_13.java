package gamificacion_06;

/* Dada una secuencia de caracteres introducida por teclado y acabada con el carácter ‘.’,
visualiza todas aquellas palabras que tengan las consonantes ‘b’, ‘p’ y ‘m’. */

public class programa_13 {
    //variables 
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_13().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int contador = 0;
        boolean x = false;
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres finalizada en . : ");
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
        
        System.out.println("El numero de palabras que contienen los caracteres"
                + " b, p o m es de: "+contador);
        
    }
    //funcion encargada de buscar palabras
    private void buscarPalabra() {
        while (character==SPACE) {
            //lectura caracter
            character=LT.readChar();
        }
    }
     //subprograma encargado de saltar palabras
    private void saltarPalabra() {
        //mientras el caracter leido sea alfabético se lee el sieguiente
        //caracter de la secuencia
        while ((character!=FIN)||(character!=SPACE)) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //funcion encargada de buscar las letras b p m
    private boolean buscador(){
        //variables
        boolean x = false;
        int contador = 0;
        //algoritmo
        while((character != FIN)&&(character != SPACE)){
            switch(character){
                case 'b':
                    x = true;
                    break;
                case 'p':
                    x = true;
                    break;
                case 'm':
                    x = true;
                    break;
            }
            character = LT.readChar();
        }
        return x;
    }
}
