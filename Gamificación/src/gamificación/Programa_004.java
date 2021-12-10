/*
FUNCIONALIDAD: Programa que dado el numero introducido por teclado diga si esta
entre el rango de [-1.0 ... 1.0]
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*
ALGORITMO PROGRAMA 004
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Si el numero pertenece al rango, mensaje por pantalla diciendo que pertenece
    Else, mensaje por pantalla diciendo que no pertenece
}
Algoritmo visualizacion{
    Imprimir por pantalla si pertenece o no al rango
}
 */
public class Programa_004 {
    //Declaracion main
    public static void main (String [] args){
        //Declaracion de variable de tipo double
        double num;
        //Mensaje por pantalla para recibir el numero
        System.out.println("Introduce un numero: ");
        //Lectura del numero
        num = LT.readDouble();
        //Tratamiento
        if (-1.0 < num){
            if (num < 1.0){
                System.out.println("El numero pertenece al rango [-1.0 ... 1.0]");
            }
            else{
                System.out.println("El numero no pertence al rago [-1.0 ... 1-0]");
        }
        }
        else{
            System.out.println("El numero no pertence al rago [-1.0 ... 1-0]");
        }
    }
}
