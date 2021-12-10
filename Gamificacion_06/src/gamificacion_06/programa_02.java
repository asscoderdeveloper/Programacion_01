package gamificacion_06;

//tras la introduccion por teclado de 10 numeros mostrar el maximo y el minimo
//acompañados por el orden de introducción, además visualizar el valor de la media
//de los numeros introducidos

public class programa_02 {
    //metodo main
    public static void main(String [] args) throws Exception{
        //metodo principal
        new programa_02().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int nums[] = new int [10];
        //llamada a la funcion encargada de incializar la variable
        inicializador(nums);
        //llamada a la funcion encargada de calcular el maximo
        max(nums);
        //llamada a la funcion encargada de calcular el minimo
        min(nums);
    }
    //inicializador y media 
    private void inicializador(int dato[]){
        //variables 
        float suma = 0;
        for(int indice = 0; indice<dato.length; indice++){
            System.out.println("Introduce el valor de la componente " + (indice+1) + ":");
            dato[indice] = LT.readInt();
            suma+=dato[indice];
        }
        System.out.println("El valor de la media de todos los numeros introducidos es: "
                + suma/10);
    }
    //máximo
    private void max(int dato []){
        //variables
        int max = 0, posicion = 0;
        //algoritmo
        for(int indice = 0; indice<dato.length; indice++){
            if(dato[indice]>max){
                max = dato[indice];
                for(int x = 0; x<dato.length;x++){
                    if((dato[indice]) == (dato[x])){
                        posicion = x+1;
                    }
            }
            }   
        }
        System.out.println("El numero mas grande introducido es: "+ max + ""
                + " en la posicion: " + posicion);
    }
    //mínimo
    private void min(int dato []){
        //variables
        int min = 0, posicion = 0;
        //algoritmo
        for(int indice = 0; indice<dato.length; indice++){
            if(dato[indice]<min){
                min = dato[indice];
                for(int x = 0; x<dato.length;x++){
                    if((dato[indice]) == (dato[x])){
                        posicion = x+1;
                    }
            }
            }   
        }
        System.out.println("El numero mas grande introducido es: "+ min + ""
                + " en la posicion: " + posicion);
    }
}
