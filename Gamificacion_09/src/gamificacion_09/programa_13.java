package gamificacion_09;

public class programa_13 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        Palabra palabra2 = new Palabra();
        int numeroCaracteresPalabra2 = 0;
        //mensaje
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            if((numeroCaracteresPalabra2+1==(palabra.numeroCaracteres()))){
                System.out.print(palabra2.toString());
                System.out.println(" "+palabra.toString());
            }
            //copiar palabra
            Palabra.copiar(palabra,palabra2);
            numeroCaracteresPalabra2 = palabra2.numeroCaracteres();
        }
    }
}
