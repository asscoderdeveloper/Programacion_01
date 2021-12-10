/*
FUNCIONALIDAD: lleva a cabo la resolución de una ecuación de primer grado del
tipo ax+b=0, donde el coeficiente de las x (a) y el término independiente (b)
son introducidos por el usuarfio, a través del teclado. Posteriormente a la 
resolución visualiza el resultado por pantalla. 
 */
/*
ALGORITMO ECUACION PRIMER GRADO {
    LECTURA DATOS ECUACIÓN;
    TRATAMIENTO;
    VISUALIZAR RESULTADO;
}

ALGORIMTO LECTURA DATOS ECUACIÓN {
    LECTURA COEFICIENTE ECUACIÓN;
    LECTURA TÉRMINO INDEPENDIENTE;
}

ALGORIMTO LECTURA COEFICIENTE ECUACIÓN {
    MENSAJE USUARIO PARA INTRODUCIR POR TECLADO EL COEFICIENTE DE LA ECUACIÓN;
    LECTURA VALOR COEFICIENTE POR TECLADO;
}
ALGORITMO LECTURA TÉRMINO INDEPENDIENTE {
    MENSAJE USUARIO PARA INTRODUCIR EL TÉRMINO INDEPENDIENTE DE LA ECUACIÓN;
    LECTURA VALOR TÉRMINO INDEPENDIENTE POR TECLADO;
}

ALGORITMO TRATAMIENTO {
    x=-TERMINO INDEPENDIENTE/COEFICIENTE;
}
*/
package esquema_secuencial_primer_grado;


public class Esquema_secuencial_primer_grado {

    public static void main(String [] argumentos) throws Exception{
        //DECLARACION
        //DECLARACION DE VARIABLES DE TIPO DOUBLE a Y b
        double a, b, resultado_final;
        //LECTURA DE LOS DATOS DE LA ECUACION
        System.out.println("Introduce el termino que acompaña a la X:"
                + "\n");
        a = LT.readDouble();
        System.out.println("\n"
                + "Introduce el termino independiente: "
                + "\n");
        b = LT.readDouble();
        //TRATAMIENTO
        resultado_final = (-1*b)/a;
        //IMPRESIÓN POR PANTALLA DEL RESULTADO FINAL
        System.out.println("\n"
                + "Tu ecuacion queda tal que así:"
                + "\n"
                + "\n"
                + a + "X"+" + "+b+" = 0"
                + "\n");
        System.out.println("Asi que el valor final de X es: " + resultado_final + "\n");
        
    }
    
}
