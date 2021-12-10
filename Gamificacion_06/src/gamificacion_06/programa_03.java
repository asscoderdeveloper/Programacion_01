package gamificacion_06;

//Realizar un programa que, dados dos arrays de 10 componentes enteras inicializados en la
//declaración, verifiquen si son iguales o no

public class programa_03 {
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_03().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int nums2[] = {1,2,3,4,5,6,7,8,9,10};
        //llamada a la funcion que compare si las dos variables son iguales
        comparador(nums, nums2);
    }
    private void comparador(int dato[], int dato2[]){
        //variables
        int contador = 0;
        //algoritmo
        for(int indice = 0; indice<dato.length;indice++){
            if((dato[indice]) == (dato2[indice])){
                contador++;
            }
        }
        if(contador == 10){
                System.out.println("Las dos arrays son iguales");
            }
            else{
                System.out.println("Las dos arrays no son iguales");
            }
    }
}
