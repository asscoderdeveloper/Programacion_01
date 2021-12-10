/*
FUNCIONALIDAD:Tras introducir un numero por teclado crear un subprograma que
determine si este es primo o no
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 11
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que determine si el numero es primo o no

Visualizacion{
    Imprimir si es o no primo
}
 */
public class programa_11 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_11().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //declaracion de variables
        int num;
        boolean x;
        //mensaje de lectura
        System.out.println("Introduce un numero: ");
        num = LT.readInt();
        //llamar a la funcion
        x = entero(num);
        //imprimir resultado
        if (x){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
    }
    private boolean entero(int dato){
        boolean y = false;
        
        for (int i = 2; i<dato; i++){
            if ((dato%i) == 0){
            y = true;
        }
        }
        return y;
    }
}
