/*
FUNCIONALIDAD: dado un numero entero, leido desde el teclado, visualiza los n primeros
multiplos delm  numero introducido. El numero de multiplos a visualizar sera introducido
tambien desde el teclado
OBJETIVO: introduccion a la programacion y esquema de accion de accion repetitivo 
a traves de la sentencia while
FECHA DE CREACION: 8/10/21
AUTOR: Alex Sánchez
 */
package visualizador_multiplos;
/*
ALGORITMO VISUALIZACION DE MULTIPLOS{
    lectura datos;
    tratamiento;
Algoritmo lectura datos{
    Lectura numero de multiplos a visualizar;
        Mensaje 
        Lectura
    Lectura numero del cual quiere realizar los multiplos;
        Mensaje
        Lectura
Algoritmo tratamiento{
    Mensaje para introducir;
    Mientras (no se hayan visualizado todos los multiplos a visualizar){
        obtener el siguiente multiplo del num introducido;
        visualizar multiplo obtenido;
        incrementar el numero de multiplos visuzalizados;
}
*/

public class Visualizador_multiplos {

    public static void main(String[] args) {
        //Declaracion de variables
        //Declaracion de variables tipo int del numero y numero de multiplos
        int num_mult, num;
        //Declaracion de variables de tipo int para multiplos visualizados
        int contador = 0;
        //
        int multiplo;
        System.out.println("Introduce el numero de multiplos que deseas: ");
        num_mult = LT.readInt();
        System.out.println("Introduce el numero: ");
        num = LT.readInt();
        
        //Tratamiento
        while (contador < num_mult){
            //Obtener el siguiente multiplo del numero introducido
            multiplo = (contador+1)*num;
            //Visualizar multiplo
            System.out.println("\n"+multiplo);
            //Incrementar numero de multiplo visualizado
            contador++;
        }
        
    }
    
}
