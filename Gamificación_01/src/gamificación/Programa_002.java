/*
FUNCIONALIDAD: Asignacion a una variable de tipo int 
el contenido de una variable de tipo char a traves del codigo UNICODE
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*
ALGORITMO PROGRAMA 002
    Declaracion de variables
    Asignacion de valor de las variables
    Asignacion de valor de una variable a otra
    Visualizacion por pantalla

 */
public class Programa_002 {
    //Declaracion main
    public static void main(String [] args) throws Exception{
        //Declaracion de variables
        char caracter = 'b';
        int codigo;
        //Asignacion a la variable codigo el valor de caracter
        codigo = caracter;
        //Visualizacion por pantalla
        System.out.println("El codigo UNICODE del caracter: " +caracter + " es "+codigo);
    }
}
