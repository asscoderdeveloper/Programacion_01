package gamificacion_09;

public class programa_11 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        int contadorPalabras[] = new int [20];
        //mensaje
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            contadorPalabras[palabra.numeroCaracteres()]++;
        }
        //visualizacion
        for(int indice = 0; indice<=19; indice++){
                System.out.println("Palabras de " + (indice+1) + " caracteres: " + contadorPalabras[indice]);
            }
    }
}
