/*
FUNCIONALIDAD: Lectura de un numero introducido por teclado y visualizacion por
pantalla si este es positivo o negativo
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*
ALGORITMO PROGRAMA 003
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Si el numero es mayor que 0, positivo
    Else, negativo
}
Algoritmo visualizacion{
    Imprimir por pantalla si el numero es positivo o negativo
}
 */
public class Programa_003 {
    //Declaracion main
    public static void main (String [] args) throws Exception{
        //Declaracion de variables de tipo entero para almacenar 
        int num; 
        //Mensaje por pantalla preguntando el num
        System.out.println("Introduce un numero entero: ");
        //Lectura del numero
        num = LT.readInt();
        //Tratamiento
        if (num < 0 ){
            System.out.println("El numero introducido es negativo");
        }
        else{
            System.out.println("El numero es positivo");
        }
        
    }
}
