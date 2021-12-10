package gamificacion_06;

/* Realizar un programa que dado un array de 10 componentes enteras inicializado en
declaración lleve a cabo la visualización, por cada componente del array, de tantos caracteres
‘*’ como represente el contenido de la componente */

public class programa_05 {
    //metodo main
    public static void main(String [] args) throws Exception{
        //metodo principal
        new programa_05().metodoPrincipal();
    }
    private void metodoPrincipal(){
        //variables
        int nums[]={1,2,3,4,5,6,7,8,9,10};
        //funcion encargada de hacer el dibujo
        draw(nums);
    }
    private void draw(int dato[]){
        for(int indice = 0; indice<dato.length;indice++){
            for(int x = 0; x<dato[indice];x++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
