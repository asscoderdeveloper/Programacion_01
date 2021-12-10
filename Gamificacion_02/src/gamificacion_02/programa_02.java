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
los numeros a sumar y después se hace un bucle for que acabe al tener la variable i 
el mismo valor que num_de_sumas
}
Algoritmo visualizacion{
    Imprimir el resultado de la suma
}
 */
public class programa_02 {
    //declaracion metodo main
    public static void main (String [] args) throws Exception{
        //declaracion de variables
        int num_de_sumas, num, i, suma = 0;
        //lectura de variables
        System.out.println("Introduce el numero de sumas a realizar: ");
        num_de_sumas = LT.readInt();
        //algoritmo
        for (i = 0; i<num_de_sumas; i++){
            System.out.println("Introduce el numero a sumar: ");
            num = LT.readInt();
            suma = suma + num;
        }
        //impresion del resultado de la suma
        System.out.println("El resultado de la suma es: "+ suma);
    }
}
