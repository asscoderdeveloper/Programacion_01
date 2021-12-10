package gamificacion_05;
/*
FUNCIONALIDAD: Dar valores a una array de 10 componentes y realizar la media 
aritmetica
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
    Imprimir por pantalla la media
}
 */
public class programa_02 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_02().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int [] numeros = {12,23,32,43,52,542,23,43,54,23}; //array con 10 comp. enteros
        //visualizacion del resultado de la media
        System.out.println("El valor de la media es: " + mediaAritmetica(numeros));
    }
    private double mediaAritmetica(int [] dato){
        float suma = 0;
        
        for(int indice = 0 ; indice<dato.length; indice++){
            
            suma +=dato[indice];
        }
        System.out.println(suma);
        return suma/dato.length;
    }
}
