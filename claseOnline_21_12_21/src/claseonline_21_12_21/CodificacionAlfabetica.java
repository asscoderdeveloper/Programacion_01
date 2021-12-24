//CLASE ENCARGADA DE CODIFICAR Y DECODIFICAR 
//  FUNDAMENTADA EN LA UTILIZACION DE DOS ARRAYS DE CARACTERES PARA EL SUMINISTRO DE INFO.
package claseonline_21_12_21;

import static java.lang.Math.abs;

public class CodificacionAlfabetica {
    //DECLARACION DE ATRIBUTOS
    //numero de caracteres que forma el abecedario, atributo de clase
    private static final int NUM_CHAR = 27;
    //declaracion de un atributo de clase alfabeto
    private static final char [] ALFABETO = "abcdefghijklmnñopqrstuvwxyz".toCharArray();
    //declaracion de un atributo de clase de tipo entero para representar el desplazamiento
    //del alfabeto codificado
    private int desplazamiento;
    
    //METODOS
    //METODO CONSTRUCTOR
    public CodificacionAlfabetica(int dato){
        desplazamiento = dato;
    }
    //METODOS FUNCIONALES
    //METODO codificar LLEVA A TERMINO LA OBTENCION DEL CARACTER CODIFICADO 
    //DEL CARACTER DADO POR PARAMETRO
    public char codificar(char caracter){
        if(valido(caracter)){ //valido verifica si es posible su codificacion            
            return ALFABETO[(posicion(caracter)+desplazamiento)%NUM_CHAR];
        }
        else{
            return caracter; //si no es codificable te devuelve el mismo caracter
        }
    }
    
    //METODO deCodificar OBTIENE LA POSICION EN EL ARRAY ALFABETO DE UN CARACTER
    //DADO POR PARAMETRO
    public char deCodificar (char caracter){
        if(valido(caracter)){
            int valor = posicion(caracter)-desplazamiento;
            if(valor<0){
                valor = NUM_CHAR - abs(valor);
            }
            return ALFABETO[valor%NUM_CHAR];
        }
        else{
            return caracter; //si no es codificable te devuelve el mismo caracter
        }
    }
    
    //METODO posicion OBTIENE LA POSICION EN EL ARRAY ALFABETO DE UN CARACTER DADO POR PARAMETRO
    public int posicion(char caracter){
        int indice;
        //busqueda del caracter dado dentro del array ALFABETO
        for(indice = 0; caracter != ALFABETO[indice];indice++){}
        //devolucion de la posicion del caracter
        return indice;
    }
    
    //METODO valido VERIFICA SI UN CARACTER DADO PUEDE O NO SER CODIFICADO
    public boolean valido(char caracter){
        //verificamos si el caracter se encuentra dentro del array ALFABETO
        for(int indice = 0; indice<ALFABETO.length;indice++){
            if(caracter == ALFABETO[indice]){
                return true;
            }
        }
        return false;
    }
}
