/*
FUNCIONALIDAD: Tras la introducción de dos numeros enteros por teclado realizar
su suma a través de un subprograma
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 02
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
public class programa_02 {
    private static void main (String [] args) throws Exception{
        new programa_02().metodoPrincipal();
    }
    
    //metodo principal
    public void metodoPrincipal() throws Exception{
        //Declaracion de variables
        int num1 =  10, num2 = 20;
        //declaracion de la variable entera para almacenar el resultado de al suma
        int resSuma;
        
        //algoritmo
        //llamada al subprograma metodo funcion sumador
        sumador(num1, num2);
        
        
    }
    
    //metodo sumador
    public void sumador(int dato1, int dato2) {
        //declaraciones
        int resultado;
        //algoritmo
        resultado = dato1 + dato2;
        //visualizar
        System.out.println("La suma es: " + resultado);
    }
    
}
