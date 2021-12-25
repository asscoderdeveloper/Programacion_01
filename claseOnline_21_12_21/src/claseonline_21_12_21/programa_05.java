//TRAS LA INTRODUCCION DE UNA SECUENCIA DE CARACTERES POR TECLADO VISUALIZAR
//LA FRECUENCIA DE LAS PALABRAS
package claseonline_21_12_21;

public class programa_05 {
    //MAIN
    public static void main(String []args)throws Exception{
        new programa_05().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //declaracion del objeto FrecuenciaPalabras para gestionar la frecuencia 
        //de las palabras contenidas en la secuencia de entrada
        FrecuenciaPalabra frecuencia = new FrecuenciaPalabra();
        //declaracion del objeto Palabra para almacenar, de una en una, las palabras 
        //leidas desde la secuencia de entrada
        Palabra palabra = new Palabra();
        
        //ACCIONES
        //mensaje
        System.out.println("Introduce una secuencia de caracteres: ");
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //tratamiento de la frecuencia de la palabra leida
            frecuencia.actualizacion(palabra);
        }
        System.out.println(frecuencia.toString());
    }
}
