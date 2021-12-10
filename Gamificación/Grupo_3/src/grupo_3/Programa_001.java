/*
FUNCIONALIDAD: lleva a cabo la visualización del mensaje "HOLA MUNDO" en la ventana
de texto de salida.
FECHA REALIZACIÓN: 01.octubre.2021
ASIGNATURA: Programación I
ESTUDIOS: ING. Informática
AUTOR: Juan MOntes de Oca
 */

package grupo_3; //sentencia que indica que el presente programa pertenece al proyecto
                 //Netbeans grupo_03

public class Programa_001 {

    public static void main(String[] argumentos) throws Exception {
        //DECLARACION
        //DECLARACION DE VARIABLES DE TIPO DOUBLE PARA ALMACENAR LOS EIROS RECIBIDOS
        double euros;
        //DECLARACION DE VARIABLE DE TIPO DOUBLE PARA ALMACENAR LOS DOLARES
        double dolares;
        //DECLARACION DE LA CONSTANTE TIPO DOUBLE PARA ALMACENAR LA UNIDAD DE CONVERSION
        final double UNIDAD_CONVERSION = 1.16;
        //LECTURA IMPORTE DE EUROS
        System.out.print("Introduce la cantidad de euros a convertir: ");
        euros = LT.readDouble();
        //TRATAMIENTO
        //PASAR DE EUROS A DOLARES
        dolares = euros*UNIDAD_CONVERSION;
        //VISUALIZAR RESULTADO
        System.out.println("Este es el valor en dolares "+ dolares + " dolares." );
    }
}

