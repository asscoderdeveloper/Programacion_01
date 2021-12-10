/*
FUNCIONALIDAD:Tras introducir dos numeros enteros por teclado crear un subprograma
que determine si el primer numero introducido es divisor del segundo
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 10
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que determine si el primer numero es divisor 
del segundo

Visualizacion{
    Imprimir si es o no divisor
}
 */
public class programa_10 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_10().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //declaracion de variables
        int num1, num2;
        boolean x;
        //mensaje para la lectura de variables
        System.out.println("Introduce dos numeros enteros: ");
        num1 = LT.readInt();
        num2 = LT.readInt();
        //llamar a la funcion divisor
        x = divisor(num1, num2);
        //algoritmo
        if (x){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");

        }
    }
    private boolean divisor(int dato1, int dato2){
        boolean y = false;
        if ((dato1/dato2)==0){
            y = true;
        }
        return y;   
    }
}
