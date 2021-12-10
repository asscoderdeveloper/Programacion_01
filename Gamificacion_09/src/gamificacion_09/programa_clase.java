
package gamificacion_09;

public class programa_clase {
    public static void main (String []args)throws Exception{
        Palabra palabra = new Palabra();
        while(Palabra.hayPalabras()){
            palabra.lectura();
            if((palabra.numeroConsonates()%2!=0)&&(palabra.numeroVocales()%2==0)){
                System.out.println(palabra.toString());
            }
        }
    }
}
