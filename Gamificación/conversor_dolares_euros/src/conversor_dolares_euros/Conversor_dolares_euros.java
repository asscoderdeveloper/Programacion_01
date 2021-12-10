/*

FUNCIONALIDAD: CONVERTIR DE EUROS A DOLARES O VICEVERSA DANDO LA OPCION
FECHA REALIZACIÓN: 05.octubre.2021
ASIGNATURA: Programación I
ESTUDIOS: ING. Informática
AUTOR: ALEX SÁNCHEZ
 */

/*
ALGORITMO DE EUROS A DOLARES Y VICEVERSA{
    LECTURA DE LA OPCION QUE ESOCGE;
    LECTURA DE EUROS/DOLARES;
    TRATAMIENTO;
    VISUALIZAR RESULTADO;
}
ALGORITMO LECTURA DE LA OPCION QUE ESCOGE{
    MENSAJE AL USUARIO QUE DE A ELEGIR SI CONVERTIR DE DOLARES A EUROS O
    VICEVERSA;
    LECUTRA DE LA ELECCION;
}
ALGORITMO LECTURA DE EUROS/DOLARES{
    MENSAJE USUARIO PARA SOLICITAR IMPORTE DE EUROS/DOLARES A CONVERTIR;
    LECTURA VALOR IMPORTE EUROS/DOLARES;   
}
ALGORITMO TRATAMIENTO{
    EUROS = DOLARES *UNIDAD_CONVERSION1
    DOLARES = EUROS*UNIDAD_CONVERSION2
}
ALGORITMO VISUALIZAR RESULTADO{
    MENSAJE QUE SAQUE POR PANTALLA EL VALOR EN EUROS/DOLARES
}
*/

package conversor_dolares_euros;


public class Conversor_dolares_euros {
    
    public static void main(String[] argumentos) throws Exception{
        //DECLARACION
        //DECLARACION DE VARIABLE DE TIPO INT PARA ALMACENAR LA OPCION QUE ELIGEN
        int opcion;
        //DECLARACION DE VARIABLES DE TIPO DOUBLE PARA ALMACENAR LOS EUROS/DOLARES
        double dolares, euros, euros_convertidos, dolares_convertidos;
        //DECLARACION DE VARIABLES DE TIPO DOUBLE PARA LAS UNIDADES DE CONVERSION
        final double UNIDAD_CONVERSION_EUROS = 0.86;
        final double UNIDAD_CONVERSION_DOLARES = 1.16;
        //LECTURA DE LA ELECCIÓN
        System.out.println("Elige que tipo de conversion deseas realizar: "
                + "\n"
                + "1 Euros a Dolares"
                + "\n"
                + "2 Dolares a Euros"
                + "\n");
        opcion = LT.readInt();
        //LECTURA DE LA CANTIDAD EUROS/DOLARES
        switch (opcion){
            case 1 :
            System.out.print("\n"
                    + "¿Cual es la cantidad de Euros que deseas convertir? "
                    + "\n");
            euros = LT.readDouble();
            //CONVERTIR EUROS A DOLARES
            dolares_convertidos = euros*UNIDAD_CONVERSION_DOLARES;
            //IMPRIMIR POR PANTALLA RESULTADO FINAL
            System.out.print("Este es el valor: "+ dolares_convertidos + " dolares"
                    + "\n");
            break;
            case 2 :
            System.out.print("¿Cual es la cantidad de Dolares que deseas convertir?"
                    + "\n ");
            dolares = LT.readDouble();
            //CONVERTIR DOLARES A EUROS
            euros_convertidos = dolares*UNIDAD_CONVERSION_EUROS;
            //IMPRIMIR RESULTADO FINAL
            System.out.print("Este es el valor: "+ euros_convertidos+" euros"
                    + "\n");
            break;
            default : 
                System.out.println("\n"
                        + "El valor introducido no es correcto");
                break;
        }
    }
}

