package gamificacion_06;

/* Realizar un programa que cree un array de números enteros cuya dimensión (número de
componentes) será introducida por teclado a petición del programa. Después llevar a término
la asignación de valores a cada una de las componentes del array introduciéndolos por teclado.
Por último visualizar el contenido del array indicando tanto el número de componente como
el contenido o valor de dicha componente */

public class programa_10 {
    //metodo main
    public static void main(String []args) throws Exception{
        //metodo principal
        new programa_10().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        int nums [] = new int [100];
        //funcion encargadad de inicializar la variable
        inicializador(nums);
        //funcion encargada de visualizar el resultado
        visualizador(nums);
    }
    private void inicializador(int dato[]){
        //variables
        int num;
        //mensaje de lectura
        System.out.println("Introduce la dimension del array: ");
        num = LT.readInt();
        for(int indice = 0; indice<num; indice++){
            System.out.println("Introduce el valor de la componente " + (indice+1) + ": ");
            dato[indice] = LT.readInt();
        }
    }
    private void visualizador(int dato[]){
        for(int indice = 0; indice<dato.length;indice++){
            if((dato[indice])!=0){
                System.out.println("El valor de la componente " + (indice+1) + ""
                        + " es: " + dato[indice]);
            }
        }
    }
}
