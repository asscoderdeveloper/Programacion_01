/*
FUNCIONALIDAD: tras una secuencia de caracteres introducida por 
teclado identificar la posicion de la primera vocal y decir en que
posicion se encuentra
OBJETIVO: Aprender a programar
FECHA DE CREACION: 16/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_02;

/*ALGORITMO PROGRAMA 04
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
    Leer caracter a caracter de la string e identificar 
la posicion de la primera vocal primera vocal }
Algoritmo visualizacion{
    Imprimir la primera vocal y la posicion en la que se encuentra
}
 */
public class programa_04 {
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
        for (i = 0; ((i < numChar) && (vocal <1)); i++){
            switch (str.charAt(i)){
                case 'a':
                case 'A':
                    vocal++;
                    break;
                case 'e':
                case 'E':
                    vocal++;
                    break;
                case 'i':
                case 'I':
                    vocal++;
                    break;
                case 'o':
                case 'O':
                    vocal++;
                    break;
                case 'u':
                case 'U':
                    vocal++;
                    break;
            }
        }
        if (vocal == 0){
            System.out.println("En la secuencia no hay vocales ");
        }
        else{
        System.out.println("La primera vocal encontrada ha sido: " + str.charAt(i-1)
        + " en la posicion: " + (i));
        }
    }
}
