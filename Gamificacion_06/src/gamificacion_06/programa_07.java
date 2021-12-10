package gamificacion_06;

/* Realizar un programa que pida el valor de 10 números enteros distintos. Si se da el caso de
introducir un número repetido, el programa advertirá al usuario, y solicitará nuevamente el
número hasta que sea diferente de todos los anteriores. A continuación, el programa
visualizará los 10 números por pantalla. */

public class programa_07 {
        //variables
        int nums [] = new int [10];
        int contador = 0;       
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_07().metodoPrincipal();
    }
    private void metodoPrincipal(){
        //variables
        
        //llamar a la funcion encargada de incializar la variables
        inicializador();
        //funcion encargada de visualizar el resultado de la matriz
        visualizador();
    }
    //inicializador
    private void inicializador(){
        //variables 

        //algoritmo
        for(int indice = 0; indice<nums.length; indice++){
            System.out.println("Introduce el valor de la componente " + (indice+1) + ":");
            nums[indice] = LT.readInt();
            contador++;
            for (int x = 0; x<indice;x++){
                if(nums[indice]==nums[x]){
                    System.out.println("Numero invalido, introduce un numero de nuevo: ");
                    nums[indice] = LT.readInt();
            }  
            }
        }
    }
    private void visualizador(){
        System.out.println("El array final es: ");
        for(int indice = 0; indice<nums.length;indice++){
            System.out.println(nums[indice]);
        }
    }
    
}