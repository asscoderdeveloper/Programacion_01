package gamificacion_05;

/*
FUNCIONALIDAD: Dar valores a una array de 5 componentes y mostrar los valores
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

public class programa_01 {
    //declaracion main
    public static void main(String [] args) throws Exception{
        //metodo principal
        new programa_01().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //declaracion de variables
        int [] numeros = new int[5]; //array de 5 componentes entera
        //inicializacion de las valores de la variables
        inicializacion(numeros);
        //visualizacion de los componentes del array
        visualizacion(numeros);
    }
    private void inicializacion(int [] dato){
        for(int indice = 0; indice<dato.length; indice++){
            //mensaje para introducir valores
            System.out.println("Introduce el valor para la componente "
                    + "" + (indice + 1) + " :" );
            dato[indice] = LT.readInt();
        }
    }
    private void visualizacion(int dato[]){
        for(int indice = 0; indice<dato.length; indice++){
            System.out.println("El valor de la componente " + (indice+1)+ " es: " + dato[indice]);
        }
    } 
}
