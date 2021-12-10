/*
FUNCIONALIDAD: Se introduce el numero de sumas a realizar y luego los
numeros enteros a sumar
OBJETIVO: Aprender a programar
FECHA DE CREACION: 16/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_02;
/*ALGORITMO PROGRAMA 01
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Se introduce el numero de sumas a realizar = num_de_sumas,
los numeros a sumar y después se hace un bucle while que acabe al tener la variable i 
el mismo valor que num_de_sumas
}
Algoritmo visualizacion{
    Imprimir el resultado de la suma
}
 */

public class programa_01 {
    //declaracion del metodo main
    public static void main (String [] args) throws Exception{
    //declaracion de variables de tipo entero para almacenar
    int num_de_sumas, num, i = 0, suma = 0;
    //lectura de variables
    System.out.println("Introduce el numero de sumas a realizar: ");
    num_de_sumas = LT.readInt();
    //algoritmo
    while (i < num_de_sumas){
        System.out.println("Introduce el numero a sumar: ");
        num = LT.readInt();
        suma = suma + num;
        i++;
    }
    //impresion del resultado
    System.out.println("Este es el resultado de la suma: " + suma );
    }
}
