package gamificacion_09;

public class programa_10 {
    //metodo main
    public static void main(String []args) throws Exception{
        //variables
        Palabra palabra = new Palabra();
        //mensaje
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //
            if((palabra.palindromo())&&(palabra.todoVocales())){
                System.out.println(palabra.toString());
            }
        }
    }
}
