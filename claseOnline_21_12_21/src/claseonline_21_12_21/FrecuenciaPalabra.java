//Clase frecuencia palabras
package claseonline_21_12_21;

public class FrecuenciaPalabra {
    //DECLARACION DE ATRIBUTOS
    //atributo de clase constante que representa el numero maximo de palabras
    private static final int NUM_MAX_PAL  = 500;
    //atributo de objeto array de NUM_MAX_PAL componentes de objetos palabra
    private Palabra [] palabras  = new Palabra[NUM_MAX_PAL+1];
    //atributo de longitud NUM_MAX_PAL que guarda las frecuencias de las palabras
    private int []frecuencias = new int [NUM_MAX_PAL+1];
    //atributo de objeto que guarda el numero de palabras diferentes
    private int numPal;
    
    //METODOS
    //METODO CONSTRUCTOR
    public FrecuenciaPalabra(){
        //inicializacion
        numPal = 0;
    }
    
    //METODOS FUNCIONALES
    //METODO actualizacion TIENE COMO OBJETIVO ACTUALIZAR EL ARRAY DE frecuencias
    //DE UN OBJETO frecuenciasPalabras DADO UN OBJETO  Palabra POR PARAMETRO
    public void actualizacion(Palabra palabra){
        //ACCIONES
        int indice;
        //
        palabras[numPal] = new Palabra();
        Palabra.copiar(palabra,palabras[numPal]);
        //buscar componente del array pañabras donde se encuentra la palabra dada por parametro
        for(indice = 0;((indice<(numPal+1))&&
                (!palabra.iguales(palabra,palabras[indice])));indice++){}
        if(indice<numPal){
            frecuencias[indice]++;
        }
        else{
            frecuencias[numPal]=1;
            numPal++;
        }
    }
        //MÉTODO toString QUE LLEVA A CABO LA CONVERSIÓN DE UN OBJETO FrecuenciaPalabras
    //a String con fines de visualización 
    public String toString() {
        //DECLARACIONES
        String tmp="\n";
        //Asignación al String local tmp por concatenación la información
        //relativa al objeto FrecuenciaPalabras
        for (int indice=0;indice<numPal;indice++) {
            //concatencación al String local tmp de la palabra indice-ésima y de su
            //frecuencia de aparición
            tmp=tmp+"Frecuencia palabra "+palabras[indice].toString()+": "
                    +frecuencias[indice]+".\n";
            
        }
        //devolver String local tmp resultante
        return tmp;
    }
    
    //MÉTODO toString QUE LLEVA A CABO LA CONVERSIÓN A String DE LA FRECUENCIA
    //DE APARICIÓN DE UNA PALABRA DADA CORRESPONDIENTE A UN OBJETO FrecuenciaPalabras
    public String toString(Palabra palabra) {
        //DECLARACIONES
        //declaración variable entera que represente la posición que ocupa en
        //el array de palabras la palabra dada
        int posicion;
        
        //ACCIONES
        //buscar la posición de la palabra dada en el array palabras
        for (posicion=0;!palabra.iguales(palabra,palabras[posicion]);posicion++) {}
        //devolución en String de la información frecuencia palabra dada del objeto
        //FrecuenciasCaracteres 
        return "Frecuencia palabra "+palabras[posicion].toString()+": "
                    +frecuencias[posicion]+".";
    }
    
    //MÉTODO obtenerFrecuencia LLAVA A CABO LA OBTENCIÓN DE LA FRECUENCIA DE APARICIÓN
    //DE UNA PALABRA DADA CORRESPONDIENTE A UN OBJETO FrecuenciaPalabras
    public int obtenerFrecuencia(Palabra palabra) {
        //DECLARACIONES
        //declaración variable entera que represente la posición que ocupa en
        //el array de palabras la palabra dada
        int posicion;
        
        //ACCIONES
        //buscar la posición del caracter dado en el array caracteres
        for (posicion=0;!palabra.iguales(palabra,palabras[posicion]);posicion++) {}   
        //devolución frecuencia del caracter dado
        return frecuencias[posicion];
    }
    
    
        
    //MÉTODO getPalabras QUE LLEVA A CABO LA OBTENCIÓN DE LAS PALABRAS OBJETO
    //DE LA GESTIÓN DE SUS APARICIONES
    public Palabra [] getPalabras() {
        return palabras;
    }
    
    //MÉTODO getNumeroPalabras QUE LLEVA A CABO LA OBTENCIÓN DEL NÚMERO DE PALABRAS
    //OBJETO DE LA GESTIÓN DE SUS APARICIONES
    public int getNumeroPalabras() {
        return numPal;
    }
}

