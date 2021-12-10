package gamificacion_05;

/*
FUNCIONALIDAD: Dar valores a una array de 100 componentes, realizar una quiniela
y mostrar los aciertos
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

public class programa_06 {
    //metodo main
    public static void main(String [] args) throws Exception{
        //metodo principal
        new programa_06().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int []resultados = {1,2,0,1,1,1,2,0,0,1,0,2,1,0,2};
        int []quiniela =new int [15];
        //funcion encargada de inicializar la variable quiniela
        inicializacion(quiniela);
        //funcion encargada de comparar los resultados y la quiniela 
        comparador(resultados, quiniela);
    }
    private void inicializacion(int []dato){
        for(int indice = 0; indice<dato.length;indice++){
            System.out.println("Introduce el resultado del partido " + (indice+1)+ ": "
                    + "\n"
                    + "0 --> Victoria"
                    + "\n"
                    + "1 --> Empate"
                    + "\n"
                    + "2 --> Derrota");
            dato[indice] = LT.readInt();
        }
    }
    private void comparador(int []dato1, int [] dato2){
        //variables
        int aciertos=0;
        //algoritmo
        for(int indice = 0; indice<dato1.length;indice++){
            if(dato1[indice] == dato2[indice]){
                aciertos++;
            }
        }
        System.out.println("El numero de aciertos es de: "+aciertos);
    }
}
