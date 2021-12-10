/*
FUNCIONALIDAD: tras introducir el valor de n por teclado 
realizar el sumatorio
OBJETIVO: Aprender a programar
FECHA DE CREACION: 19/10/21
AUTOR: Alex Sánchez
 */
package problemas_19_10_21;

/*ALGORITMO SUMATORIO2
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Leer el numero que sera el valor de n y realizar un bucle for
para resolver el sumatorio
}
Algoritmo visualizacion{
    Imprimir el valor del sumatorio
}
 */
public class sumatorio2 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        //declaracion de variables
        int n, i;
        double resultadoSumatorio = 0;
        //mensaje de lectura
        System.out.println("Introduce el valor de n: ");
        n = LT.readInt() ;
        //algoritmo
        for (i = 1; i <= n; i++){
            resultadoSumatorio = resultadoSumatorio + ((3*(double)i)/((double)i*((double)i+1)));
        }
        System.out.println("Este es el valor del sumatorio: "+ resultadoSumatorio);
    }
}
