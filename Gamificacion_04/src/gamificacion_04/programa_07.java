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
package gamificacion_04;

public class programa_07 {
    //variables
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args) throws Exception{
        new programa_07().metodoPrincipal();
    }
    //metodo principal
    public void metodoPrincipal() throws Exception{
        //variables
        boolean x = false, y = false;
        int count = 0, finalCount = 0;
        //mensaje de lectura
        System.out.println("Introduce un mensaje acabado en '.' : ");
        character = LT.readChar();
        //llamar a la funcion buscar palabra
        buscarPalabra();
        //llamar a la funcion contador
        //x = contador();
        //algoritmo
        while(character != FIN){
                count += revisor();
                buscarPalabra();
        }
        System.out.println("El numero de palabras que contienen dos vocales "
                + "y tres consonantes es de: " + count);
        
    }
    //funcion encargada de buscar palabras cuando char = ' '
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
    //funcion encargada de revisar si la palabra tiene dos vocales y tres consonantes
    private int revisor(){
        int vocal = 0, consonante = 0, aux = 0, confirmadas = 0;
        while((character != FIN) && (character != SPACE)){
            aux++;
            switch(character){
                case 'a':
                    vocal++;
                    break;
                case 'e':
                    vocal++;
                    break;
                case 'i':
                    vocal++;
                    break;
                case 'o':
                    vocal++;
                    break;
                case 'u':
                    vocal++;
                    break;                   
            }
            
            consonante = -1*(vocal - aux);
            character = LT.readChar();
            
        }
        if((vocal == 2) && (consonante == 3)){
            confirmadas++;
        }
        
        return confirmadas;
    }
}
