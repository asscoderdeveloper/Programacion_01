package gamificacion_05;

/*
FUNCIONALIDAD: Declarar una array de 5 componentes e invertirla
OBJETIVO: Intorducción a los arrays
FECHA: 30/10/21
AUTOR: Alex Sánchez
 */

/*ALGORITMO PROGRAMA 01
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la lectura de caracteres, llamar a otro
subprograma para que cuente las palabras

Visualizacion{
    Imprimir por pantalla el numero de palabras inpares
}
 */

import java.util.Arrays;

public class programa_08 {
    //variables
    int a [] = {10,20,30,40,50}  ;
    int b [] = new int [5];
    //metoodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_08().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        
        //funcion encargada de invertir a e imprimirla
        inversor();
    }
    private void inversor(){
        int aux = 4, aux2;
        for(int indice = 0; indice<a.length;indice++){
            aux2 = a[aux];
            b[indice] = aux2;
            aux--;
            System.out.println("La array inversa es: " + b[indice]);
        }
    }
}
