/*
FUNCIONALIDAD: tras una secuencia de caracteres introducida por 
teclado identificar la posicion de todas las vocales e identificar
en que posicion se encuentran
OBJETIVO: Aprender a programar
FECHA DE CREACION: 16/10/21
AUTOR: Alex Sánchez

 */
package gamificacion_02;

/*ALGORITMO PROGRAMA 05
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Leer caracter a caracter de la string e identificar 
la posicion de las vocales }
Algoritmo visualizacion{
    Imprimir las vocales y sus posiciones
}
 */
public class programa_05 {
    public static void main (String [] args) throws Exception{
        //declaracion de variable tipo string para la cadena de caracteres
        String str, vocales = "aeiou";
        //declaracion de variables de tipo int;
        int i, numChar, numVoc = 0, vocal = 0; 
        //mensaje para la lectura de la variable
        System.out.println("Introduce una cadena de caracteres acabada en '.': ");
        str = LT.readLine();
        //algoritmo
        numChar = str.length();
        for (i = 0; (i < numChar); i++){
            switch (str.charAt(i)){
                case 'a':
                case 'A':
                    vocal++;
                    System.out.println("La vocal encontrada ha sido: " + str.charAt(i)
        + " en la posicion: " + (i));
                    break;
                case 'e':
                case 'E':
                    vocal++;
                    System.out.println("La vocal encontrada ha sido: " + str.charAt(i)
        + " en la posicion: " + (i));
                    break;
                case 'i':
                case 'I':
                    vocal++;
                    System.out.println("La vocal encontrada ha sido: " + str.charAt(i)
        + " en la posicion: " + (i));
                    break;
                case 'o':
                case 'O':
                    vocal++;
                    System.out.println("La vocal encontrada ha sido: " + str.charAt(i)
        + " en la posicion: " + (i));
                    break;
                case 'u':
                case 'U':
                    vocal++;
                    System.out.println("La vocal encontrada ha sido: " + str.charAt(i)
        + " en la posicion: " + (i));
                    break;
            }                
            }
        if (vocal == 0){
            System.out.println("No hay ninguna vocal en la secuencia. ");
        }
        }
        
    }

