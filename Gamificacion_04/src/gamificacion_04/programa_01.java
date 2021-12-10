package gamificacion_04;

/*
FUNCIONALIDAD: Tras la introduccion por teclado de una secuencia de caracteres
acabada en punto, contar las palabras que tienen un numero de caracteres impares
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
    Imprimir por pantalla el numero de palabras inpares
}
 */
public class programa_01 {
    //declaracion de variables
    final char FINALSECUENCIA = '.';
    final char ESPACIO = ' ';
    char character;
    int inpares = 0;

    public static void main (String [] args) throws Exception{
        new programa_01().metodoPrincipal();
    }
    
    public void metodoPrincipal() throws Exception{
        //declaracion de variables inicializadas para poder devolver un resultado
        int inpares = 0;
        //mensaje para la introducción
        System.out.println("Introduce una secuencia de caracteres finalizada en '.': ");
        character = LT.readChar();
        //llamar al programa para que proceda a la busqueda de palabras
        buscarPalabra();
        //tratamiento recorrido
        while ((character != FINALSECUENCIA)){
            if (((contador())%2)!=0){ 
                //incrementar el numero de inpares
                inpares++;
            }
            
            //buscar la siguiente palabra
            buscarPalabra();
        }
        //visualizar resultado
        System.out.println("El numero de palabras introducidas inpares es de: "+inpares);
    }
    
    //método procedimiento buscarPalabra lleva a cabo la búsqueda, a través
    //de la lectura de caracteres de la secuencia, de una palabra, es decir,
    //del primer caracter de una palabra.    
    private void buscarPalabra(){
        while (character == ESPACIO){
            //leer caracter
            character = LT.readChar();
        }
    }
    
    //funcion para contar el numero de caracteres de una palabra
    private int contador(){
        //declaracion de una variable para contabilizar el numero de letras
        int numChar = 0; 
        //contabilizar el resto de letras de la palabra
        while ((character != ESPACIO) && (character != FINALSECUENCIA)){
            //incrementacion del numero de caracteres
            numChar++;
            //lectura del siguiente caracter 
            character = LT.readChar();
        }
        //devolucion
        return numChar;
    }
}
