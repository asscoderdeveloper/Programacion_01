package gamificacion_10;

public class programaClase {
    //metodo main
    public static void main (String []args)throws Exception{

        new programaClase().metodoPrincipal();
        
    }
    private void metodoPrincipal()throws Exception{

        //VARIABLES
        PalabraFicherosLectura fichero;
        PalabraFicherosEscritura fichero2, fichero3;
        Palabra palabra = new Palabra();
        String nombreFicheroIntroducido;
        System.out.println("Introduce el nombre del fichero");
        nombreFicheroIntroducido = LT.readLine();
        //ACCIONES
        //instanciacion de variables
        fichero =new PalabraFicherosLectura(nombreFicheroIntroducido);
        fichero2 = new PalabraFicherosEscritura("salida1.txt");
        fichero3 = new PalabraFicherosEscritura("salida2.txt");
        //algoritmo
            while(fichero.hayPalabras()){
                //lectura
                palabra = fichero.lectura();
                //algoritmo
                if(palabra.getNumeroCaracteres()<7){
                    fichero2.escritura(palabra);
                    fichero2.escrituraSeparador();
                }
                else{
                    fichero3.escritura(palabra);
                    fichero3.escrituraSeparador();                    
                }
            }
            fichero.cerrarEnlaceFichero();
            fichero2.cerrarEnlaceFichero();
            fichero3.cerrarEnlaceFichero();
        }
    }

