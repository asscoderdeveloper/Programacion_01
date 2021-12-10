/*
FUNCIONALIDAD: tras introducir un numero entero por teclado
realizar su factorial
OBJETIVO: Aprender a programar
FECHA DE CREACION: 19/10/21
AUTOR: Alex Sánchez
 */
package problemas_19_10_21;

/*ALGORITMO FACTORIAL
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Leer el numero y a traves de un for multiplicar por num-1
}
Algoritmo visualizacion{
    Imprimir el valor del factorial
}
 */
public class factorial {
    //declaracion main
    public static void main (String [] args ) throws Exception{
        //declaracion de variable de tipo entero
        int num, i, resultado = 1;
        //mensaje de lectura
        System.out.println("Introduce un numero para realizar su factorial: ");
        num = LT.readInt();
        //algoritmo
        for (i = 1; i <= num; i++){
            resultado = resultado*i;
        }
            
       
        //Impresion
        System.out.println("Este es el valor del factorial: "+ resultado);
    }
}
