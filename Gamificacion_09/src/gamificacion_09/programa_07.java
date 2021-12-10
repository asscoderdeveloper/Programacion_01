package gamificacion_09;

public class programa_07 {
    //metodo main
    public static void main (String []args) throws Exception{
        //declaracion de variables
        Palabra palabra = new Palabra();
        
        //mensaje para la lectura
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo 
            if(palabra.vocalesEO()){
                System.out.println(palabra.toString());
            }
        }
    }
}
