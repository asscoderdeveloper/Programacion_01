package gamificacion_05;

/*
FUNCIONALIDAD: Declarar una array de 100 componentes que sean los 100 primeros 
numeros primos
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

public class programa_10 {
    //variables globales
    int nums[] = new int [10];
    //declaracion metodo main
    public static void main (String []args) throws Exception{
        //declaracion metodo principal
        new programa_10().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables

        int eleccion;
        //llamar a la funcion que se encargua de inicializar la variable
        inicializador(nums);
        //llamar a la funcion menu
        eleccion = menu();
        //llamar a la funcion encargada de realizar las sumas
        sumador(eleccion);
    }
    //programa encargado de inicializar la variable
    private void inicializador(int dato []){
        //algoritmo
        for (int indice = 0; indice<dato.length;indice++){
            System.out.println("Introduce 10 numeros a sumar: ");
            dato[indice] = LT.readInt();
        }
    }
    //programa que visualiza un menu por pantalla y devuelve la elección
    private int menu(){
        //variables
        int eleccion = 0;
        //menu
        System.out.println("¿Que tipo de suma desea realizar?"
                + "\n"
                + "1-Suma (sumar todos los numeros introducidos por teclado)"
                + "\n"
                + "2-Suma par (sumar todos los numeros pares introducidos por teclado)"
                + "\n"
                + "3-Suma impar (sumar todos los numeros impares introducidos por teclado)");
        eleccion = LT.readInt();
        return eleccion;
    }
    private void sumador(int dato){
        //variables
        int suma = 0;
        //algoritmo
        //algoritmo para la suma
        switch(dato){
            case 1:
                for(int indice = 0; indice<nums.length;indice++){
                    suma += nums[indice];
                }
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                for (int indice = 0; indice<nums.length;indice++){
                    if((nums[indice])%2==0){
                        suma += nums[indice];
                    }
                }
                System.out.println("El resultado de la suma par es: " + suma);
                break;
            case 3:
                for (int indice = 0; indice<nums.length;indice++){
                    if((nums[indice])%2!=0){
                        suma += nums[indice];
                    }
                }
                System.out.println("El valor de la suma inpar es: " + suma);
        }
    }
}
