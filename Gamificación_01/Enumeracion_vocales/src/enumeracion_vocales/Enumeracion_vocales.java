/*
FUNCIONALIDAD: dado un caracter leido desde el teclado, visualiza el literal
que posibilita la enumeracion de las vocales siempre y cuando el caracter leido 
se corresponda con un carcter vocal. En caso, que el caracter leido no se corresponda
con un caracter vocal se visualizará el mensaje: "NO ES UNA VOCAL"
OBJETIVO: introduccion a la programacion y esquema de accion de accion condicional
a traves de la sentencia switch
FECHA DE CREACION: 8/10/21
AUTOR: Alex Sánchez
 */
package enumeracion_vocales;

/*
ALGORITMO ENUMERACION VOCALES{
    Lectura caracter;
    Tratamiento;
}
Algoritmo lectura caracter{
    Mensaje usuario para introducir el caracter
    Lectura del caracter
}
Algoritmo tratamiento{
    Si (caracter leido){
    es "a", "A" entonces visualizar mensaje "Primera vocal"
    es "e", "E" entonces visualizar mensaje "Segunda vocal"
    es "i", "I" entonces visualizar mensaje "Tercera vocal"
    es "o", "O" entonces visualizar mensaje "Cuarta vocal"
    es "u", "U" entonces visualizar mensaje "Quinta vocal"
    es no un caracter vocal entonces visualizar mensaje "no es un caracter vocal"
}
 */
public class Enumeracion_vocales {

    
    public static void main(String[] args) {
        //Declaracion de variables
        char caracter;
        //Pedir y leer caracter
        System.out.println("Introduce un caracter: "
                + "\n");
        caracter = LT.readChar();
        //Tratamiento
        switch (caracter){
            case 'A' :
            case 'a' :
                System.out.println("Primera vocal");
                break;
            case 'E' :
            case 'e' : 
                System.out.println("Segunda vocal");
                break;
            case 'I' :
            case 'i' : 
                System.out.println("Tercera vocal");
                break;
            case 'O' :
            case 'o' : 
                System.out.println("Cuarta vocal");
                break;
            case 'U' :
            case 'u' : 
                System.out.println("Quinta vocal");
                break;
            default : 
                System.out.println("Caracter introducido no es una vocal");
                    
        }
    }
    
}
