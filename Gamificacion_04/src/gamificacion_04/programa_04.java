package gamificacion_04;

/*
FUNCIONALIDAD: Tras la introduccion por teclado de una secuencia de caracteres
acabada en punto, contar las palabras que acaban en consonante
OBJETIVO: Intorducción a los subprogramas
FECHA: 30/10/21
AUTOR: Alex Sánchez
 */

/*ALGORITMO PROGRAMA 01
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la lectura de caracteres, llamar a otro
subprograma para que cuente las palabras

Visualizacion{
    Imprimir por pantalla el numero de palabras que acaban en consonante
}
 */

public class programa_04 {
    //declaracion de variables
    final char FIN = '.';
    final char ESPACIO = ' ';
    char character;
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_04().metodoPrincipal();
    }
    private void metodoPrincipal() throws Exception{
        //variables
        int contadorPalabras = 0;
            //variables para el recuento de palabras que acaban en vocal
           int cantidad, cantidadFinal = 0;
        //mensaje de lectura
        System.out.println("Introduce un mensaje acabado en . : ");
        character = LT.readChar();
        //llamada del subprograma buscarPalabra
        buscarPalabra();
        
        //algoritmo
        while (character != FIN){
            contadorPalabras++;
            cantidad = vocal();
            cantidadFinal = cantidadFinal + cantidad;
            saltarPalabra();
            buscarPalabra();
        }
        System.out.println("El numero de palabras acabadas en consonante es de: " + -(cantidadFinal - contadorPalabras));
    }
    
    //subprograma buscar palabra
    private void buscarPalabra() {
        while (character==ESPACIO) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    
    //subprograma saltar palabra
    private void saltarPalabra() {
        //mientras el caracter leido sea alfabético se lee el sieguiente
        //caracter de la secuencia
        while ((character!=FIN)&&(character!=ESPACIO)) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    
    //subprograma encargado de la lectura del ultimo caracter de la palabra
    private int vocal(){
        //declaracion de variables
        char aux = character;
        int contador = 0;
        //algoritmo
        while((character != FIN) && (character != ESPACIO)){
            aux = character;
            character = LT.readChar();
        }
        switch (aux){
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
        return contador;
    }
}
