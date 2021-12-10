/*
FUNCIONALIDAD: tras una secuencia de caracteres introducida por 
teclado imprimir tantas veces una letra por posicion que ocupe
OBJETIVO: Aprender a programar
FECHA DE CREACION: 16/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_02;

/*ALGORITMO PROGRAMA 06
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Leer caracter a caracter de la string e identificar 
la posicion en la que estan, luego multiplicar cada caracter 
por su posicion
Despues cambiarlos}
Algoritmo visualizacion{
    Imprimir de nuevo el mensaje introducido
}
 */
public class programa_07 {
    public static void main (String [] args) throws Exception{
        //delcaracion de variables
        String str;
        int i, j, numChar;
        //lectura de variables
        System.out.println("Introduce un cadena de caracteres acabada en '.': ");
        str = LT.readLine();
        //algoritmo 
        numChar = str.length();
        for (i = 0; i < numChar; i++){
            if (Character.isLowerCase(str.charAt(i))){  
                for (j = 0; j <= i; j++){
                    System.out.print(str.charAt(i));
                }
            }
            if (str.charAt(i) == 32){
                System.out.print(" ");
            }
        }
    }
}
