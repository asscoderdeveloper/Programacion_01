/*
FUNCIONALIDAD: Asignacion a una variable el contenido de una constante
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*
ALGORITMO PROGRAMA 001
    Declaracion de las variables
    Asignacion de valor a las variables
    Asignacion del valor de una variable a otra
 */
public class Programa_001 {
    //delaracion main
    public static void main(String [] argumentos) throws Exception{
        //Declaracion de variables
        int variable;
        final int CONSTANTE = 10;
        //Asignacion del contenido de constante a variable
        variable = CONSTANTE;
        //Visuzalizacion por pantalla
        System.out.println("El valor de variable es: " + variable);
        
    }
}
