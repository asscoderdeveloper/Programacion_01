package gamificacion_05;
/*
FUNCIONALIDAD: Dar valores a una array de 100 componentes, mostrar la suma
de todos los valores y realizar al media
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
public class programa_03 {
    //declaracion main
    public static void main(String [] args) throws Exception{
        //metodo principal
        new programa_03().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variable array de 100 componentes
        int [] numeros = new int [100];
        //funcion encargada de dar valores al array
        inicializacion(numeros);
        //funcion encargada de sumar todos los numeros de la array y hacer la
        //media aritmetica
        mediaAritmetica(numeros);
    }
    private void inicializacion(int []dato){
        for(int indice = 0; indice<dato.length;indice++){
            dato[indice] = indice+1;
        }
    }
    private void mediaAritmetica(int []dato){
        float suma = 0;
        for(int indice = 0; indice<dato.length;indice++){
            suma += dato[indice];
        }
        System.out.println("El valor de la suma es: " + suma + "\n"
                + "El valor de la media aritmetica es: " + suma/2);
    }
}
