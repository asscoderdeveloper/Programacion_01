package gamificacion_09;

public class programa_14 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        Palabra palabra2 = new Palabra();
        int numeroVocalesPalabra2 = 0;
        //mensaje
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            if(palabra.numeroVocales() ==  palabra2.numeroVocales()){
                System.out.print(palabra2.toString());
                System.out.println(" "+palabra.toString());
            }
            //copiar palabra
            Palabra.copiar(palabra,palabra2);
            numeroVocalesPalabra2 = palabra2.numeroVocales();
        }
    }
}
