package problemas_a_realizar_iv;

public class nums_char {
    //metodo main
    public static void main (String []args)throws Exception{
        //Declaracion de variables  
        int num = 5006;
        char caracter;
        int orden = 5;
        int digito;
        boolean cerosIzquierda = true;
        
        //ACCIONES
        if(num > 0){
            while(orden >= 0){
                //obtener el digito correspondiente al orden de esta iteración
                digito = num/(int) Math.pow(10.0, (double) orden);
                //obtener el caracter numérico que le corresponde al dígito obtenido
                caracter = (char) ((int)'0'+digito);
                if((digito!=0)&&(cerosIzquierda)){
                    cerosIzquierda = false;
                }
                if(!cerosIzquierda){
                    //visualizar el caracter obtenido
                    System.out.print(caracter);
                }
                //PREPARACION PARA LA SIGUIENTE ITERACIÓN DEL TRATAMIENTO
                //actualizar número
                num = num%(int) Math.pow(10.0, (double)orden);
                //actualizar orden
                orden--;
            }
        }
        else{
            System.out.print('0');
        }
    }
}
