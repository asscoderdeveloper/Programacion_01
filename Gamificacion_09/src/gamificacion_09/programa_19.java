package gamificacion_09;

public class programa_19 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        int contador = 0;
        //mensaje
        System.out.println("Introduce una secuencia de caracteres finalizada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            contador++;
           //algoritmo
            if(contador%2!=0){
                char palabraInvertida[] = new char [palabra.numeroCaracteres()]; 
                //algoritmo
                palabraInvertida = palabra.inversor();
                //
                for(int indice = 0; indice<palabra.numeroCaracteres(); indice++){
                  System.out.print(palabraInvertida[indice]);  
                } 
                System.out.print("\n");
            }
            else{
                char palabraGrande [] = new char [palabra.numeroCaracteres()];
                //algoritmo
                palabraGrande = palabra.getMayusc();
                //
                for(int indice = 0; indice<palabra.numeroCaracteres();indice++){
                    System.out.print(palabraGrande[indice]);
                }
                System.out.print("\n");                
            }
        }
    }
}
