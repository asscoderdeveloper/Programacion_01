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
public class programa_04 {
    int []num3 = new int [10];
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_04().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int []num1 = {23,32,54,65,44,3,54,65,93,12};
        int []num2 = new int [10];
        //llamada a la funcion que permite inicializar los valores
        inicializacion(num2);
        //llamada a la funcion que suma los valores de la array 1 y 2 
        suma(num1,num2);
        //llamada a la funcion encargada de visualizar los valores de las array
        visualizar(num1, num2, num3);
    }
    private void inicializacion(int []dato){
        for(int indice = 0; indice<dato.length;indice++){
            System.out.println("Introduce el valor de la componente " + indice + " de la array 2: ");
            dato[indice] = LT.readInt();
        }
    }
    private void suma(int []dato1, int []dato2){
        for(int indice = 0; indice<dato1.length;indice++){
            num3[indice] = (dato1[indice] + dato2[indice]);
        }
    }
    private void visualizar(int [] dato1, int [] dato2, int []dato3){
        for (int indice = 0; indice<dato1.length; indice++){
            System.out.println("El valor de la array 1"
                    + "\n"
                    + "El componente " + (indice+1)+" es: "+ dato1[indice]);
        }
        for (int indice = 0; indice<dato2.length; indice++){
            System.out.println("El valor de la array 2"
                    + "\n"
                    + "El componente " + (indice+1)+ " es: "+ dato2[indice]);
        }
        for (int indice = 0; indice<dato3.length; indice++){
            System.out.println("El valor de la array 3"
                    + "\n"
                    + "El componente " + (indice+1)+ " es: "+ dato3[indice]);
        }
    }
}
