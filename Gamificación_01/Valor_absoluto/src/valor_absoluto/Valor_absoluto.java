/*
FUNCIONALIDAD: dado un numero entero, leido desde el teclado, visualiza
el valor absoluto correspondiente a dicho numero.
OBJETIVO: introduccion a la programacion y esquema de accion secuiencial
a traves de la sentencia if.
FECHA DE CREACION: 8/10/21
AUTOR: Alex Sánchez
 */
package valor_absoluto;

/*
Algoritmo valor absoluto{
    Lectura del numero;
    Tratamiento;
    Visualizar;
}
 Algoritmo lectura del numero{
    Mensaje para introducir el numero
    Lectura valor del numero
}
Algoritmo tratamiento{
    Si numero leido es menor que 0, entonces 
    valor absoluto = -NUMERO;

    ELSE 
        valor absoluto = NUMERO
}
 */
public class Valor_absoluto {

    public static void main(String[] args) {
        //Declaracion de variales
        //Declaracion de variable tipo int para numero entero
        int num;
        //Declaracion de variable tipo int para numero valor absoluto
        int valor_absoluto;
        //Lectura del numero
        //Mensaje para introducir el numero
        System.out.println("Introduce un numero:"
                + "\n");
        //Lectura del numero
        num = LT.readInt();
        //Tratamiento
         
        if (num < 0){
            
            valor_absoluto = -num;
            
        }
        else{
            valor_absoluto = num;
        }
        //Visualizar resultado
        System.out.println("\n"
                + "Este es el resultado: " + valor_absoluto);
    }
    
}
