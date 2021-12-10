package gamificacion_09;

public class programa_20 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        char [] inicialFinal = new char [2];
        //mensaje
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            inicialFinal = palabra.inicialFinal();
            //visualizar
            for(int indice = 0; indice<palabra.numeroCaracteres();indice++){
                System.out.print(inicialFinal[indice]);
            }
            System.out.println("");
        }
    }
}
