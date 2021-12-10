package gamificacion_06;

/*  dados dos arrays de 10 componentes enteras, inicializados en la
declaración, cree un tercer array asignándole como valor la resta, componente a componente,
de los dos primeros arrays. Posteriormente llevar a cabo la visualización siguiendo el siguiente
formato:
RESTA DE DOS ARRAYS
Valor 2 array 1 - Valor 2 array 2 = resultado resta array 3 */

public class programa_04 {
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_04().metodoPrincipal();
    }
    private void metodoPrincipal(){
        //variables
        int x[]={10,10,10,10,10,10,10,10,10,10,};
        int y[]={10,10,10,10,10,10,10,10,10,10,};
        int z[]=new int [10];
        //funcion encargada de restar las dos arrays y almacenarlas en la tercera
        resta(x,y,z);
    }
    private void resta(int dato1[], int dato2[], int dato3[]){
        //algoritmo
        System.out.println("RESTA DE DOS ARRAYS: ");
        for(int indice = 0; indice<dato1.length; indice++){
            dato3[indice] = dato1[indice]-dato2[indice];
            System.out.println(dato1[indice] + " - " + dato2[indice] + " = " + dato3[indice]);
        }
    }
}
