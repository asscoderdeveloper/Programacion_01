/*
FUNCIONALIDAD: Tras la introduccion de la nota de un examen declarar si esta
pertenece a una matricula de honor, sobresaliente, notable, aprobado o suspenso
OBJETIVO: Aprender a programar
FECHA DE CREACION: 08/10/21
AUTOR: Alex Sánchez
 */
package gamificación;

/*
/*ALGORITMO PROGRAMA 007
    Lectura de variable
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida la variable
    Leer la variable
}
Algoritmo tratamiento{
    Si el numero es 10 matrícula de honor
    Si el numero es 9 Sobresaliente
    Si el numero pertenece al rango 7 ... 9 Notable
    Si el numero pertenece al rango 5 ... 7 Aprobado
    Si el numero pertenece al rango 0 ... 5 Suspenso
}
Algoritmo visualizacion{
    Imprimir a que rango pertenece la nota
}
*/

public class Programa_007 {
    //Declaracion main
    public static void main (String [] args) throws Exception{
        //Declaracion de la variable de tipo entera
        int nota;
        //Mensaje que permita introducir la variable
        System.out.println("Introduce la nota: ");
        //Lectura
        nota = LT.readInt();
        //Tratamiento
        switch (nota){
            case 10:
                System.out.println("Matricula de Honor");
                break;
            case 9: 
                System.out.println("Sobresaliente");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 6:
                System.out.println("Aprobado");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 4:
                System.out.println("Suspendido");
                break;
            case 3:
            System.out.println("Suspendido");
                break;
            case 2:
                System.out.println("Suspendido");
                break;
            case 1:
                System.out.println("Suspendido");
                break;
            case 0:
                System.out.println("Suspendido");
                break;
    
        }
    }
}
