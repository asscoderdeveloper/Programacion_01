package gamificacion_06;
//funcionalidad --> tras la introducción por teclado de una secuencia de caracteres
// visualizar la secuencia invertida

public class programa_01 {
    //variable 
    int contador = 0;
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_01().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        char chars [] = new char [100];
        
        //funcion que inicialice la variable nums
        inicializador(chars);
        //funcion encargada de invertir el orden del array
        inversor(chars);
    }
    //funcion encargada de inicializar la variable
    private void inicializador(char dato []){
        for (int indice = 0; indice<dato.length;indice++){
            System.out.println("Introduce una secuencia de caracteres");
            dato[indice] = LT.readChar();   
            contador++;
        }
    }
    //funcion encargada de invertir el orden del array
    private void inversor(char dato[]){
        System.out.print("La secuencia invertida es: ");
        for (int indice = 0; indice<contador; indice++){
            System.out.print(dato[indice]);
        }
    }
}
