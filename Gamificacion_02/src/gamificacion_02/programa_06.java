/*
FUNCIONALIDAD: tras una secuencia de caracteres introducida por 
teclado transformar los caracteres mayusc. en minusculas y las
minusculas en mayusculas
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
cuales estan en mayusculas y cuales estan en minusculas.
Despues cambiarlos}
Algoritmo visualizacion{
    Imprimir de nuevo el mensaje introducido
}
 */
public class programa_06 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        //declaracion de variables
        String str;
        int i, numChar, asciiCode;
        char trans;
        //lectura de variables
        System.out.println("Introduce una cadena de caracteres acabada en '.': ");
        str = LT.readLine();
        //algoritmo
        numChar = str.length();
        for (i=0; i < numChar ; i++){
            if (Character.isUpperCase(str.charAt(i))){
                asciiCode = str.charAt(i) + 32;
                trans = (char)asciiCode;
                System.out.print(trans);
            }
            if (str.charAt(i) == 32){
                System.out.print(" ");
            }
            else{
                asciiCode = str.charAt(i) - 32;
                trans = (char)asciiCode;
                System.out.print(trans);
            }

        }
    }
}
