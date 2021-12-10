package gamificacion_04;

/*
FUNCIONALIDAD: Tras la introduccion por teclado de una secuencia de caracteres
acabada en punto, contar las palabras que acaban en vocal
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
    Imprimir por pantalla el numero de palabras que acaban en vocal
}
 */

public class programa_03 {
    //declaracion de variables
    final char FIN = '.';
    final char ESPACIO = ' ';
    char character;
    
    //metodo main
    public static void main (String []args) throws Exception{
        new programa_03().metodoPrincipal();
    }
    //metodo principal
    private void metodoPrincipal() throws Exception{
        //declaracion de variables
        int cantidad = 0, cantidadFinal = 0;
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres finalizada en . : ");
        character = LT.readChar();
        //llamar al subprograma buscarPalabra
        buscarPalabra();
        while (character != FIN){
            cantidad = vocal();
            cantidadFinal = cantidad + cantidadFinal;
            buscarPalabra();
            
        }
        System.out.println("El numero de palabras acabada en vocal es: " + cantidadFinal);
    }
    private void buscarPalabra() {
        while (character==ESPACIO) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    private void saltarPalabra() {
        //mientras el caracter leido sea alfabético se lee el sieguiente
        //caracter de la secuencia
        while ((character!=FIN)&&(character!=ESPACIO)) {
            //lectura caracter
            character=LT.readChar();
        }
    }
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