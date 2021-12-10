/*
FUNCIONALIDAD:Tras introducir un caracter por teclado
y comprobar si este es una vocal
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 09
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la comparacion

Visualizacion{
    Imprimir si es o no una vocal
}
 */
public class programa_09 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_09().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //declaracion de variables
        char caracter;
        boolean y = false;
        //mensaje para introducir variable
        System.out.println("Introduce un caracter: ");
        caracter = LT.readChar();
        //llamar a la funcion "lectura"
        y = lectura(caracter);
        //algortimo
        if (y){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
        
    }
    private boolean lectura (char dato){
        //declaracion de variable boolean
        boolean x = false;
        //algoritmo
        switch (dato){
            case 'a' :
                x = true;
            case 'e' :
                x = true;
            case 'i' :
                x = true;
            case 'o' :
                x = true;
            case 'u' :
                x = true;
        }
        return x;
    }
}
