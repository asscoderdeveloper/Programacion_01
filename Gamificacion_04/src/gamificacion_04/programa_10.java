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

public class programa_10 {
    //variables
    char FIN = '.', SPACE = ' ', character;
    //metodo main
    public static void main(String [] args) throws Exception{
        //metodo principal
        new programa_10().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //variables
        int mayor = 0;
        //mensaje de lectura
        System.out.println("Introduce un mensaje acabado en '.' : ");
        character = LT.readChar();
        //llamar funcion buscar palabra
        buscarPalabra();
        //algoritmo
        while(character != FIN){
            mayor += codigo();
            buscarPalabra();
        }
        System.out.println("El numero de palabras con codigo mayor a 1000 "
                + "es de: " + mayor);
        
    }
    //funcion encargada de buscar palabras cuando char = ' '
    private void buscarPalabra() {
        while (character==SPACE) {
            //lectura caracter
            character=LT.readChar();
        }
    }
    //funcion encargada contar la cantidad de palabras que su codigo suma mas
    // de 1000 
    private int codigo(){
        //variables
        int confirmadas = 0, transform, aux = 0;
        //algoritmo
        while((character!= FIN) && (character != SPACE)){
            transform = (int)character;
            aux += transform;
            character = LT.readChar();
        }
        if(aux>=1000){
            confirmadas++;
        }
        return confirmadas;
    }
}
