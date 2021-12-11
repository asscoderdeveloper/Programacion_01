package gamificacion_10;

public class programa_04 {
    //objetos palabra
    Palabra palabra = new Palabra();
    Palabra palabra2 = new Palabra();
    //metodo main
    public static void main (String []args)throws Exception{
        new programa_04().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        int contador=0;
        //fichero de lectura
        PalabraFicherosLectura fichero;
        //ACCIONES
        //instanciacion del fichero de lectura
        fichero = new PalabraFicherosLectura("programa4.txt");
        //mensaje
        System.out.println("Introduce una palabra acabada en '.' :");
        while(Palabra.hayPalabras()){
            palabra.lectura();
        }
        while(fichero.hayPalabras()){
            //lectura
            palabra2 = fichero.lectura();
            if((palabra.getNumeroCaracteres())==(palabra2.getNumeroCaracteres())){
                if(comparador()){
                    contador++;
                }
            }
        }
      System.out.println("La palabra se encuentra repetida dentro del fichero " + contador + " veces");
    }
    private boolean comparador(){
        int contador = 0;
        for (int indice = 0; indice<palabra.getNumeroCaracteres();indice++){
            if(palabra.arrayCaracteres()[indice]==palabra2.arrayCaracteres()[indice]){
                contador++;
            }
        }
        return (contador == (palabra.arrayCaracteres()).length);
    }
}
