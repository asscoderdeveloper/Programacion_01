
package gamificacion_09;

public class programa_12 {
    //metodo main
    public static void main(String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        Palabra palabra2 = new Palabra();
        char ultimoCaracter = ' ';
        //algoritmo
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        while(Palabra.hayPalabras()){
            //lectura 
            palabra.lectura();
            //algoritmo
            if(ultimoCaracter==palabra.getPrimerCaracter()){
                System.out.print(palabra2.toString());
                System.out.println(" "+palabra.toString());
            }
            //copiar palabra a palabra2
            Palabra.copiar(palabra, palabra2);
            ultimoCaracter = palabra2.getUltimoCaracter();
        }
    }
}
