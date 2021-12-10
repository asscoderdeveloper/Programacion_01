/*
FUNCIONALIDAD: Tras la introducción de dos numeros enteros por teclado realizar
su suma a través de un subprograma
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 01
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la suma de los enteros
Algoritmo visualizacion{
    Imprimir el resultado de la suma
}
 */
public class programa_01_v2 {
    private static void main (String [] args) throws Exception{
        new programa_01().metodoPrincipal();
    }
    
    //metodo principal
    public void metodoPrincipal() throws Exception{
        //Declaracion de variables
        int num1 =  10, num2 = 20;
        //declaracion de la variable entera para almacenar el resultado de al suma
        int resSuma;
        
        //algoritmo
        //llamada al subprograma metodo funcion sumador que devolvera la suma
        //de los parametros dados, es decir, de num1 y num2
        resSuma = sumador (num1, num2);
        
        
    }
    
    //metodo sumador
    private int sumador(int dato1, int dato2){      
        //devolucion del resultado
        return dato1 + dato2;
    }
}
