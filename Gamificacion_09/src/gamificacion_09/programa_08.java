package gamificacion_09;

public class programa_08 {
    //metodo main
    public static void main (String []args)throws Exception{
        //declaracion de variables
        Palabra palabra = new Palabra();
        //mensaje de lectura
        System.out.println("Introduce una secuencia de caracteres acaba en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            if(palabra.peso()>750){
                System.out.println(palabra.toString());
            }
        }
    }
}
