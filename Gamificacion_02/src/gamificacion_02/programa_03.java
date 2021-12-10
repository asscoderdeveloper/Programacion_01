/*
FUNCIONALIDAD: tras una secuencia de caracteres introducida por 
teclado, visualizar el numero de vocales 
OBJETIVO: Aprender a programar
FECHA DE CREACION: 16/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_02;

/*ALGORITMO PROGRAMA 03
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Leer caracter a caracter de la string e imprimir 
el numero de vocales
}
Algoritmo visualizacion{
    Imprimir el numero de vocales
}
 */
public class programa_03 {
    public static void main (String [] args) throws Exception{
        //declaracion de variables
        String str, vocales = "aeiou";
        int i, j, num_char, num_voc = 0;
        //Lectura de variables
        System.out.println("Introduce una cadena de caracteres acabada en punto: ");
        str = LT.readLine();
        //algoritmo
        num_char = str.length();
        for (i = 0; i < (num_char); i++ ){
            switch (str.charAt(i)){
                case 'a':
                case 'A':
                    num_voc++;
                    break;
                case 'e':
                case 'E':
                    num_voc++;
                    break;
                case 'i':
                case 'I':
                    num_voc++;
                    break;
                case 'o':
                case 'O':
                    num_voc++;
                    break;
                case 'u':
                case 'U':
                    num_voc++;
                    break;
            }
        }
        System.out.println("El numero de vocales es: " + num_voc);
    }
}
