package gamificacion_04;

/*
FUNCIONALIDAD: Tras la introduccion por teclado de una secuencia de caracteres
acabada en punto, contar las palabras que contengan un caracter vocal
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
    Imprimir por pantalla el numero de palabras que contengan un caracter vocal
}
 */

public class programa_05 {
    //declaracion de variables
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_05().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //variables
        boolean x, z = false;
        int contador = 0;
        //mensaje de lectura
        System.out.println("Introduce un mensaje acabado en . : ");
        character = LT.readChar();
        //llamamos a la funcion buscarPalabra
        buscarPalabra();
        //llamar a la funcion encontrar
        x = encontrar();
        //algoritmo
        while(character != FIN){
            if (x){
                contador++;
            }
            saltarPalabra();
            buscarPalabra();
        }
        
        System.out.println("El numero de palabras que contienen una vocal es de: " + contador);
        
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
    
    //subprograma encargado de leer la palabra y encontrar una vocal
    private boolean encontrar(){
        //declaracion de variables
        boolean y = false;
        //algoritmo
        while((character != FIN) && (character != SPACE)){
            switch (character){
                case 'a':
                    y = true;
                    break;
                case 'e':
                    y = true;
                    break;
                case 'i':
                    y = true;
                    break;
                case 'o':
                    y = true;
                    break;
                case 'u':
                    y = true;
                    break;                   
            }   
            character = LT.readChar();

        }
        //leer el siguiente caracter
        
        return y;
    }
}
