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
entre los dos numeros

Visualizacion{
    Imprimir por pantalla el valor del numero mas grande
}
 */
public class programa_04 {
    
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_04().metodoPrincipal();
    }
    //metood principal
    public void metodoPrincipal( ) throws Exception{
        //declaracion de variables de tipo entero
        int num1, num2, num3;
        int mayor = 0;
        //mensaje que permita introducir los valores de los numeros
        System.out.println("Introduce el valor de tres numeros: ");
        num1 = LT.readInt();
        num2 = LT.readInt();
        num3 = LT.readInt();
        //llamada de la funcion comparador
        mayor = comparador(num1, num2, num3);
        System.out.println("El numero mas grande es: " + mayor);
        
    }
    //metodo comparador
    private int comparador (int dato1, int dato2,int dato3){
        //declaracion de variables
        int mayor = 0;
        if (dato1 > dato2){
            if (dato2 > dato3){
                mayor = dato1;
            }    
        }
        else{
            if (dato2 < dato3){
                mayor = dato3;
            }
        }
            
    return mayor;
}
}