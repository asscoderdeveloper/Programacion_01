/*
FUNCIONALIDAD:Tras introducir un numero entero por teclado crear un subprograma que
devuelve el numero primo mas pequeño mayor que este numero
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 12
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que busque numeros primos

Visualizacion{
    Imprimir el numero primo
}
 */

public class programa_12 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_12().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //declarar variables
        int num, i = 0, contador = 0;
        boolean x = false, comprobacion = false;
        //mensaje para introducir la variable
        System.out.println("Introduce un numero: ");
        num = LT.readInt();
        num++;
        //algoritmo
        while (i == 0){
            contador++;
            x = primo(num);
            if ((x) && (num !=9)){
                System.out.println(num);
                i++;
            }
            num++;
            
        }
        
        
    }
    //esta funcion me devuelve si el num es primo o no
    private boolean primo(int dato){
        boolean y = false;
        int primo = 0;
        
        for (int i = 2; i<dato; i++){
            if ((dato%i) == 0){
            y = true;
            }
        }
        return !y;
    }
} 