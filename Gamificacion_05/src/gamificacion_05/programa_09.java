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
public class programa_09 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        //metodoPrincipal
        new programa_09().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int []primos = new int [100];
        //variable para contar el numero de primos obtenidos
        int contador = 0, aux = 0, num = 1;
        //inicializacion para que el primer valor de la variable sea 1
        //incrementar el contador de primos
        //bucle de tratamiento
        for(int indice = 0; indice<primos.length;indice++){
            if(esPrimo(num)){
                primos[indice] = num;
                System.out.println("El valor de la array es: " + primos[indice] );
            }
            else{
                indice--;
            }
            num++;
        }
        
    }
    private boolean esPrimo(int dato){
        //variables
 
        //algoritmo
        for (int i = 2; i<dato; i++){

            if((dato%i)==0){

                return false; //Si no lo es, devuelve false
            } 
        }
        return true;//Si lo es, devuelve true
    }
    
}
