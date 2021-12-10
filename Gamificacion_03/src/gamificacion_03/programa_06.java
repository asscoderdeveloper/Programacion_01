/*
FUNCIONALIDAD:Tras introducir tres numeros por teclado crear subprograma
que diga si entre ellos hay dos numeros o más iguales
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 05
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la comparacion 
entre los tres numeros

Visualizacion{
    Imprimir si hay dos o mas numeros iguales
}
 */
public class programa_06 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_06().metodoPrincipal();
    }
    //metodo principal
    public void metodoPrincipal() throws Exception{
        //declaracion de variables
        int num1, num2, num3;
        //variable tipo booleana 
        boolean iguales;
        //mensaje que permita introducirlas
        System.out.println("Introduce tres numeros: ");
        num1 = LT.readInt();
        num2 = LT.readInt();
        num3 = LT.readInt();
        //llamar a la funcion comprobador
        iguales = comprobador(num1, num2, num3);
        //algoritmo
        if (iguales){
            System.out.println("Si que hay dos o mas numeros iguales ");
        }
        else{
            System.out.println("Mo hay dos o mas numeros iguales ");

        }
    }
    private boolean comprobador (int dato1,int dato2,int dato3){
        //variable boleana
        boolean iguales = false;
        if ((dato1 == dato2) || (dato1 == dato3) || (dato2 == dato3) ){
            iguales = true;
        }
        return iguales;
    }
}
