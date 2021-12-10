package gamificacion_09;

public class programa_09 {
    //metodo main
    public static void main(String []args) throws Exception{
        //variables
        Palabra palabra = new Palabra();
        
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //
            if(palabra.palindromo()){
                System.out.println(palabra.toString());
            }
        }
    }
}
