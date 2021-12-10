/*
FUNCIONALIDAD: Tras la introduccion por teclado de tres numeros enteros, crear 
un subprograma que devuelva el mayor 
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 04
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la comparacion 
entre los tres numeros

Visualizacion{
    Imprimir por pantalla el valor del numero mas grande
}
 */
public class programa_05 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_05().metodoPrincipal();
    }
    //metodo principal
    public void metodoPrincipal() throws Exception{
        //declaracion de variables de tipo entero
        int num1, num2, num3, mayor = 0;
        //mensaje que permita introducir los valores de los numeros
        System.out.println("Introduce tres numeros: ");
        num1 = LT.readInt();
        num2 = LT.readInt();
        num3 = LT.readInt();
        //llamada a la funcion comparador
        mayor = comparador(num1, num2);
        if (num3 > (mayor)){
            System.out.println("El numero mas grande es: "+ num3);
        }
        else{
            System.out.println("El numero mas grande es: "+mayor);
        }
    }
    //metodo comparador
    private int comparador (int dato1, int dato2){
        //declaracion de variables
        int mayor;
        if (dato1 > dato2){
            mayor = dato1;
        }
        else{
            mayor = dato2;
        }
        return mayor;
    }
}
