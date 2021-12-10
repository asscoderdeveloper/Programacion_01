/*
FUNCIONALIDAD:Tras introducir un numero por teclado devolver su valor
absoluto utilizando un subprograma
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 07
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice el valor absoluto

Visualizacion{
    Imprimir devolver el valor absoluto
}
 */
public class programa_07 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_07().metodoPrincipal();
    }
    public void metodoPrincipal () throws Exception{
        //declaracion de variables
        int num,res;
        //mensaje que permita introducir el valor de num
        System.out.println("Introduce un numero: ");
        num = LT.readInt();
        //llamar a la funcion valor valor_absoluto
        res = valor_absoluto(num);
        //imprimir resultado 
        System.out.println("El valor absoluto es: " + res);
    }
    private int valor_absoluto(int dato){
        //declaracion
        int resultado = 0;
        if (dato < 0){
           resultado = -1 * dato;
        }
        else{
            resultado = dato;
        }
        return resultado;
    }
}
