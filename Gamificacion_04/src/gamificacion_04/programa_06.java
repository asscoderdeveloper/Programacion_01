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


public class programa_06 {
    //declaracion de variables
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args) throws Exception{
        new programa_06().metodoPrincipal();
    }
    public void metodoPrincipal () throws Exception{
        //variables
        int x = 0;
        //mensaje de lectura
        System.out.println("Introduce un mensaje acabado en . :");
        character = LT.readChar();
        //llamar a la funcion buscar palabra
        buscarPalabra();        
        //algoritmo
        while(character != FIN){
            transformer();
            System.out.print(" ");
            saltarPalabra();
            buscarPalabra();
        }
        
    }
    
    private void buscarPalabra() {
        while (character==SPACE) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    private void saltarPalabra() {
        //mientras el caracter leido sea alfabético se lee el sieguiente
        //caracter de la secuencia
        while ((character!=FIN)&&(character!=SPACE)) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //encargado de transformar de minuscula a mayuscula
    private void transformer(){
        //variables 
        while ((character != FIN) && (character != SPACE)){
            if((int)character > 92){
                System.out.print((char)(character-32));
            }
            else{
                System.out.print((char)(character+32));
                
            }
            character = LT.readChar();
        }
    }
}
