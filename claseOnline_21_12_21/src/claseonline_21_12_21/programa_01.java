//programa encargado de buscar 10 palabras introducidas por teclado dentro de un fichero
//y decir cuantas veces estan repetidas cada una de ellas
package claseonline_21_12_21;

public class programa_01 {
    //metodo main
    public static void main(String []args)throws Exception{
        new programa_01().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACION DE VARIABLES
        PalabraFicherosLectura fichero;
        Palabra palabra = new Palabra(); // UTILIZADA EN DOS OCASIONES, 1º PARA LEER LAS PALABRAS INTRODUCIDAS
                                         // 2º PARA LEER LAS PALABRAS DENTRO DEL FICHERO
        final int NUM_PALABRAS = 10;
        Palabra [] palabras = new Palabra[NUM_PALABRAS];
        int [] numeroApariciones = new int [10];
        String nombreFichero;
        //ACCIONES
        //leer y escoger el fichero a leer
        System.out.println("Introduce el nombre del fichero: ");
        nombreFichero = LT.readLine();
        fichero = new PalabraFicherosLectura(nombreFichero);
        //instanciacion del array de palabras
        for(int indice = 0; indice<palabras.length;indice++){
            palabras[indice] = new Palabra();
        }
        //instanciacion a 0 del array de apariciones
        for(int indice = 0; indice<numeroApariciones.length; indice++){
            numeroApariciones[indice]=0;
        }
        //lectura de las 10 palabras introducidas por teclado
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' :");
        for(int indice = 0; indice<palabras.length; indice++){
            if(Palabra.hayPalabras()){
                //lectura
                palabra.lectura();
                //copiar
                Palabra.copiar(palabra, palabras[indice]);
            }
        }
        //comparacion de las palabras leídas con las del fichero
        //verifica si hay palabras dentro del fichero
        while(fichero.hayPalabras()){
            //lectura de la palabra
            palabra = fichero.lectura();
            //comparacion
            for(int indice = 0; indice<palabras.length;indice++){
                if(Palabra.iguales(palabra, palabras[indice])){
                    numeroApariciones[indice]++;
                }
            }
        }
        //cerrar fichero
        fichero.cerrarEnlaceFichero();
        //VISUALIZACION
        System.out.println("\n Numero de apariciones de las palabras introducidas por teclado");
        for(int indice = 0; indice<palabras.length;indice++){
            System.out.println(palabras[indice]+": "+numeroApariciones[indice]+" apariciones");
        }
    }
}
