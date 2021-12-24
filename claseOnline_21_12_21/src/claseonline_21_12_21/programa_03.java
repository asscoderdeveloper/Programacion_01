//programa encargado de a traves de la introduccion de una secuencia de caracteres
//por teclado visualizar la frecuencia de aparicion de sus caracteres
package claseonline_21_12_21;

public class programa_03 {
    //metodo main
    public static void main (String []args)throws Exception{
        new programa_03().metodoPrincipal();
    }
    private void metodoPrincipal()throws Exception{
        //declaraciones
        //FINAL DE SECUENCIA
        final char END = '.';
        //DECLARACION DE OBJETO FRECUENCIA CARACTERES PARA GESTIONAR LA FRECUENCIA DE 
        //LOS CARACTERES PASADOS POR PARAMETRO
        FrecuenciaCaracteres frecuencia = new FrecuenciaCaracteres();
        //VARIABLE QUE GUARDA EL CARACTER LEIDO
        char caracter;
        
        //ACCIONES
        //mensaje usuario
        System.out.println("Introduce una secuencia de caracteres: ");
        caracter = LT.readChar();
        while(caracter!=END){
            frecuencia.actualizacion(caracter);
            caracter=LT.readChar();
        }
        //visualizacion
        System.out.println(frecuencia.toString());
    }
}
