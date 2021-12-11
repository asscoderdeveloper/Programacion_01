package gamificacion_10;

public class programa_03 {
  //metodo main
    public static void main (String []args)throws Exception{
        new programa_03().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //objetos ficheros de lectura
        PalabraFicherosLectura fichero, fichero2;
        //objeto fichero de escritura
        PalabraFicherosEscritura fichero3;
        //objeto palabra que almacena las palabras leidas en el fichero correspondiente
        Palabra palabra = new Palabra();
        
        //ACCIONES
        //instanciacion ficheros de lectura
        fichero = new PalabraFicherosLectura("programa3_1.txt");
        fichero2 = new PalabraFicherosLectura("programa3_2.txt");
        //instanciacion fichero escritura
        fichero3 = new PalabraFicherosEscritura("programa3_3.txt");
        
        while(fichero.hayPalabras()){
            //lectura
            palabra = fichero.lectura();
            //escribir palabra en fichero 3
            fichero3.escritura(palabra);
            fichero3.nuevaLinea();
        }
        while(fichero2.hayPalabras()){
            //lectura
            palabra = fichero2.lectura();
            //escribir palabra en fichero 3
            fichero3.escritura(palabra);
            fichero3.nuevaLinea();
        }
        //cerrar ficheros
        fichero.cerrarEnlaceFichero();
        fichero2.cerrarEnlaceFichero();
        fichero3.cerrarEnlaceFichero();
    }
}
