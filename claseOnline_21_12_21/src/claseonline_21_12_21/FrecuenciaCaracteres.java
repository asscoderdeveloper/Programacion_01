//CLASE FRECUENCIA CARACTERES
package claseonline_21_12_21;

public class FrecuenciaCaracteres {
    //DECLARACION DE ATRIBUTOS
    private static final char[] caracteres = {'a','b','c','d','e','f','g','h','i','j',
                                             'k','l','m','n','ñ','o','p','q','r','s',
                                             't','u','v','w','x','y','z',' '};
    private int [] frecuencias = new int [caracteres.length];
    
    //METODOS
    //COSNTRUCTOR
    public FrecuenciaCaracteres(){
        //inicializacion del array frecuencias
        for(int indice = 0; indice<caracteres.length;indice++){
            frecuencias[indice]=0;
        }
    }
    //METODOS FUNCIONALES
    
    //METODO actualizacion TIENE COMO OBJETIVO ACTUALIZAR EL ARRAY DE frecuencias
    // DE UN OBJETO frecuenciasCaracteres DADO UN CARACTER PASADO POR PARAMETRO
    public void actualizacion(char caracter){
        //DECLARACIONES
        //declaracion de una variable tipo integer que guarada la posicion del caracter
        //dentro del array caracteres
        int posicion;
        if(valido(caracter)){ // si el caracter esta dentro del array de caracteres
            //localizar la  posicion en la que se encuentra
            for(posicion = 0; caracter!=caracteres[posicion];posicion++){}
            frecuencias[posicion]++;
        }
    }
    
    //METODO toString QUE LLEVA A CABO LA CONVERSION DE UN OBJETO frecuenciaCaracteres
    //A String CON FINES DE VISUALIZACION
    public String toString(){
        //declaraciones
        String tmp = "\n";
        for(int indice = 0; indice<caracteres.length;indice++){
            tmp+="Frecuencia caracter " + caracteres[indice] + ": " + frecuencias[indice]+
                    ".\n";
        }
        //devolver el String resultante
        return tmp;
    }
    
    //METODO toString QUE LLEVA A CABO LA CONVERSION A String DE La FRECUENCIA DE
    //APARICION DE UN CARACTER DADO CORRESPONDIENTE A UN OBJETO frecuenciaCaracteres
    public String toString(char caracter){
        //DECLARACIONES
        int posicion;
        //acciones
        if(valido(caracter)){
            //buscar la posicion del caracter dado en el array
            for(posicion = 0; caracter!=caracteres[posicion]; posicion++){}
            
            return "Frecuencia caracter " + caracteres[posicion]+": " + frecuencias[posicion]+
                    ".\n";
        }
        return "";
    }
    
    //METODO toStringApariciones LLEVA A CABO LA OBTEENICON DE LA FRECUENCIA DE APARICION
    //DE UN CARACTER DADO CORRESPONDIENTE A UN OBJETO frecuneciaCaracteres
    public String toStringApariciones(){
        //DECLARACIONES
        String tmp="\n";
        //Asignación al String local tmp por concatenación la información
        //relativa al objeto frecuenciaCaracteres de los caracteres que hayan aparecido
        for (int indice=0;indice<caracteres.length;indice++) {
            if (frecuencias[indice]!=0) {
                //concatencación al String local tmp del caracter indice-ésimp y de su
                //frecuencia de aparición
                tmp=tmp+"Frecuencia caracter "+caracteres[indice]+": "+frecuencias[indice]+
                        ".\n";                
            }   
        }
        //devolver String local tmp resultante
        return tmp;
    }
    
    //METODO obtenerFrecuencia LLEVA A CABO LA OBTENCION DE LA FRECUENCIA DE APARICION
    //DE UN CARACTER DADO CORRESPONDIENTE A UN OBJETO frecuenciaCaracteres
    public int obtenerFrecuencia(char caracter){
        //DECLARACIONES
        int posicion;
        if(valido(caracter)){
            for(posicion = 0; posicion<caracteres.length;posicion++){}
            return frecuencias[posicion];
        }
        return -1;//frecuencia inexistente
    }
    
    //METODO valido QUE TIENE COMO OBJETIVO EL VERIFICAR SI UN CARACTER DADO
    //ES UN CARACTER VALIDO PARA GESTIONAR SU FRECUENCIA
    private boolean valido (char caracter){
        int indice;
        for(indice = 0; ((indice<caracteres.length)&&(caracter!=caracteres[indice]));indice++){}
        return(indice<caracteres.length);
    }
    
    //MÉTODO getCaracteres QUE LLEVA A CABO LA OBTENCIÓN DE LOS CARACTERES OBJETO
    //DE LA GESTIÓN DE SUS APARICIONES
    public char [] getCaracteres() {
        return caracteres;
    }
}
