package gamificacion_10;

public class programaClase2 {
    //metodo main
    public static void main (String[]args)throws Exception{
        //metodo principal
        new programaClase2().metodoPrincipal();
    }
    Palabra palabra = new Palabra();
    Palabra palabraLeida = new Palabra();
    private void metodoPrincipal()throws Exception{
        //VARIABLES
        PalabraFicherosLectura fichero;
        int contador = 0;
        int contadorDeVueltas = 0;
        int [] posiciones = new int [10];
        //instanciacion
        fichero = new PalabraFicherosLectura("palabras.txt");
        //ALGORTIMO
        System.out.println("Introduce diez palabras acabadas en '.' :");
        while(Palabra.hayPalabras()){
            palabra.lectura();
            while(fichero.hayPalabras()){
                //lectura
                palabraLeida = fichero.lectura();
                System.out.println(palabra + " " + palabraLeida  );
                if((palabra.getNumeroCaracteres())==(palabraLeida.getNumeroCaracteres())){
                    if(comparador()){
                        contador++;
                    }
                }
                posiciones[contadorDeVueltas] = contador;
            }
            contadorDeVueltas++;
        }
        //visualizacion
        for(int indice = 0; indice<10; indice++){
            System.out.println("La palabra "+(indice+1)+" esta repetida " + posiciones[indice]);
        }
    }
    private boolean comparador(){
        int contador = 0;
        for (int indice = 0; indice<palabra.getNumeroCaracteres();indice++){
            if(palabra.arrayCaracteres()[indice]==palabraLeida.arrayCaracteres()[indice]){
                contador++;
            }
        }
        return (contador == (palabra.arrayCaracteres()).length);
    }
}
