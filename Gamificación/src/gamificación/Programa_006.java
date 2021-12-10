/*
FUNCIONALIDAD: Tras la introduccion de un numero a traves del teclado comprobar
si es o no es multiplo de 5
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*ALGORITMO PROGRAMA 006
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Si el modulo del numero introducido es igual a 0, es mulitplo
    Else, no es multiplo
}
Algoritmo visualizacion{
    Imprimir si el numero es multiplo o no
}
 */
public class Programa_006 {
    //Declaracion main
    public static void main (String [] args) throws Exception{
        //Declaracion de variables
        int num;
        //Mensaje pidiendo las variables
        System.out.println("Introduce un numero: ");
        //Lectura
        num = LT.readInt();
        //Tratamiento
        if ((num%5)==0){
            System.out.println("El numero introducido es multiplo de 5");
        }
        else{
            System.out.println("El numero introducido no es multiplo de 5");
        }
    }
}
