/*
FUNCIONALIDAD:Tras introducir un caracter por teclado
y comprobar si este es = 'a'
OBJETIVO: Intorducción a los subprogramas
FECHA: 26/10/21
AUTOR: Alex Sánchez
 */
package gamificacion_03;

/*ALGORITMO PROGRAMA 08
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
    Imprimir si es o no == 'a'
}
 */
public class programa_08 {
    //declaracion main
    public static void main (String [] args) throws Exception{
        new programa_08().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //declaracion de variables
        char caracter;
        boolean x;
        //mensaje para introducir la variable
        System.out.println("Introduce un caracter: ");
        caracter = LT.readChar();
        //llamar a la funcion "a"
        x = a(caracter);
        //algoritmo
        if (x){
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }
        
    }
    private boolean a(char dato1){
        boolean y = false;
        if (dato1 == 'a'){
            y = true;
        }
        return y;
    }
}
