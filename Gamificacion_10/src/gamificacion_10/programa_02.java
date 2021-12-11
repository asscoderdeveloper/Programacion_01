package gamificacion_10;

public class programa_02 {
    //metodo main
    public static void main (String []args)throws Exception{
        new programa_02().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //declaracion de fichero de lectura
        PalabraFicherosLectura fichero;
        //declaracion de ficheros de escritura;
        PalabraFicherosEscritura fichero2, fichero3;
        //declaracion del objeto palabra e instanciacion
        Palabra palabra = new Palabra();
        
        //ACCIONES
        //instanciacion del fichero de lectura
        fichero = new PalabraFicherosLectura("programa2_1.txt");
        //instanciacion de los ficheros de escritura
        fichero2 = new PalabraFicherosEscritura("programa2_NoPalindromos.txt");
        fichero3 = new PalabraFicherosEscritura("programa2_Palindromos.txt");
        
        while(fichero.hayPalabras()){
            //lectura
            palabra = fichero.lectura();
            if(palabra.palindromo()){
                //escribir en fichero3
                fichero3.escritura(palabra);
                //espaciacion
                fichero3.escrituraSeparador();
            }
            else{
                //escribir en el fichero2
                fichero2.escritura(palabra);
                //espaciacion
                fichero2.escrituraSeparador();
            }
            
        }
        //cerrar ficheros
        fichero.cerrarEnlaceFichero();
        fichero2.cerrarEnlaceFichero();
        fichero3.cerrarEnlaceFichero();
    }
}
