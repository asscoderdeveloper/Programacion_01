/*
FUNCIONALIDAD: Dada la lectura de dos numeros enteros por teclado realizar operaciones 
aritméticas
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*
ALGORITMO PROGRAMA 005
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Sumar los dos numeros
    Restar los dos numeros
    Multiplicar los dos numeros
    Dividir los dos numeros 
    Calcular el resto de la division
}
Algoritmo visualizacion{
    Imprimir por pantalla los resultados obtenidos
}
 */
public class Programa_005 {
    //Declaracion main
    public static void main(String [] args) {
        //Declaracion de variables de dos numeros enteros
        int num1, num2, suma, resta, producto, division, resto;
        //Mensaje para pedir los numeros
        System.out.println("Introduce dos numeros enteros: ");
        //Lectura de los numeros
        num1 = LT.readInt();
        num2 = LT.readInt();
        //Tratamiento
        suma = num1+num2;
        resta = num1 -num2;
        producto = num1*num2;
        division = num1/num2;
        resto = num1%num2;
        //Visualizacion por pantalla
        System.out.println("La suma " + num1 + " + " + num2 + " es igual a: "+ suma
        + "\n"
        + "La resta " + num1 + " - " + num2 + " es igual a: "+ resta
        + "\n"
        + "El producto " + num1 + " * " + num2 + " es igual a: "+ producto
        + "\n"
        + "La division " + num1 + " / " + num2 + " es igual a: "+ division
        + "\n"
        + "El resto de la division " + num1 + " / " + num2 + " es igual a: "+ resto);
    }
}
