package gamificacion_06;

/* Realizar un programa que vaya solicitando números enteros mientras que no se introduzca el
cero y rellene dos vectores, uno con los números pares, y otro con los números impares. El
máximo número de números a introducir será de 25. Al final, se debe mostrar por pantalla, por
separado, tanto los números pares como los impares. */

public class programa_08 {
    //metodo main
    public static void main (String []args) throws Exception{
        //metodo principal
        new programa_08().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int pares[] = new int [25];
        int impares[] = new int [25];
        int general[] = new int [25];
        //funcion encargada de inicializar las variables
        inicializador(pares, impares, general);
        //funcion encargada de visualizar pares e impares
        visualizar(pares, impares);
    }
    private void inicializador(int dato[], int dato2[], int dato3[]){
        //variables
        
        //algoritmo
        for(int indice = 0; indice<dato.length; indice++){
            System.out.println("Introduce valores: ");
            dato3[indice] = LT.readInt();
            if(dato3[indice]==0){
                break;
            }
            if((dato3[indice])%2==0){
                dato[indice] = dato3[indice];
            }
            else{
                dato2[indice] = dato3[indice];
            }
        }
    }
    private void visualizar(int dato[], int dato2[]){
        for(int indice = 0; indice<dato.length;indice++){
            if(dato[indice]!=0){
                System.out.println("\n"
                        + "Estos son los numeros pares: "+dato[indice]);
            }
        }
        System.out.println("\n");
        for(int indice = 0; indice<dato.length;indice++){
            if(dato2[indice]!=0){
                System.out.println("\n"
                        + "Estos son los numeros impares: "+dato2[indice]);
            }
        }
    }
}
