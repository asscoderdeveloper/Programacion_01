package gamificacion_10;

public class programa_05 {
    //objetos palabra
    Palabra palabra = new Palabra();//palabra del mensaje
    Palabra palabra2 = new Palabra();//palabra del fichero
    Palabra palabra3 = new Palabra();//palabra de x

    //metodo main
    public static void main (String []args)throws Exception{
        new programa_05().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //DECLARACIONES
        //fichero de lectura
        PalabraFicherosLectura fichero;
        //fichero escritura
        PalabraFicherosEscritura fichero2;
        //ACCIONES
        //instanciacion del fichero de lectura
        fichero = new PalabraFicherosLectura("programa5_1.txt");
        //instanciacion del fichero de escritura
        fichero2 = new PalabraFicherosEscritura("programa5_2.txt");
        //mensaje
        System.out.println("Introduce una palabra acabada en '.' :");
        while(Palabra.hayPalabras()){
            palabra.lectura();
        }
        //declaracion e instanciacion de palabra formada por x
        char [] x = new char[palabra.getNumeroCaracteres()];
        while(fichero.hayPalabras()){
            //lectura
            palabra2 = fichero.lectura();
            //escribir en el  fichero
            if((palabra.getNumeroCaracteres())==(palabra2.getNumeroCaracteres())){
                if(comparador()){
                   for(int indice = 0; indice<palabra.getNumeroCaracteres();indice++){                      
                        fichero2.escrituraX();
                   }
                   
                   fichero2.escrituraSeparador();
                }
            }
            else{
                fichero2.escritura(palabra2);
                fichero2.escrituraSeparador();
            }
        }
        //cerrar ficheros
        fichero.cerrarEnlaceFichero();
        fichero2.cerrarEnlaceFichero();
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
