package gamificacion_04;
/*
FUNCIONALIDAD: Tras la introduccion por teclado de una secuencia de caracteres
acabada en punto, contar las palabras que contengan dos vocales y tres consonantes
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
subprograma para que cuente las palabras con 2 vocales y 3 consonantes

Visualizacion{
    Imprimir por pantalla el numero de palabras que acaban en consonante
}
 */
public class programa_08 {
    //variables 
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args)throws Exception{
        //metodo principal
        new programa_08().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int parejas = 0;
        //mensaje de lectura
        System.out.println("Introduce un mensaje acabado en '.' : ");
        character = LT.readChar();
        //algoritmo
        parejas = parejas();
        while(character != FIN){
            parejas += parejas();
            buscarPalabra();
        }
        System.out.println("El numero de parejas es: "+parejas);
    }
    //subprograma encargado de buscar palabras
    private void buscarPalabra(){
        while (character == SPACE){
            character = LT.readChar();
        }
    }
    
    //subprograma encargado de saltar palabras
    private void saltarPalabra() {
        //mientras el caracter leido sea alfabético se lee el sieguiente
        //caracter de la secuencia
        while ((character!=FIN)&&(character!=SPACE)) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //subprograma encargado de buscar parejas
    private int parejas(){
        //variables
        int parejas = 0;
        char a = 'a', b = 'b', aux, aux2;
        boolean x = false;
        //algoritmo
        while((character!=SPACE) && (character!=FIN) && (x == false)){
             aux = character; 
             character = LT.readChar();
             aux2 = character;
             if((aux == a) && (character == b)){
                 parejas++;
             }
             x = true;
        }
        return parejas;
    }
}
