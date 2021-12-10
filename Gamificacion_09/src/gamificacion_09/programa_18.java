package gamificacion_09;

public class programa_18 {
    //metodo main
    public static void main (String []args)throws Exception{
        //declaracion variables
        Palabra palabra = new Palabra();
        int contador = 0;
        //mensaje
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            contador++;
            //algoritmo
            if(contador%2==0){
                System.out.println(palabra.toString());
            }
        }
    }
}
