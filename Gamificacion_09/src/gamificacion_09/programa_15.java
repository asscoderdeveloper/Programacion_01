package gamificacion_09;

public class programa_15 {
    //metodo main
    public static void main (String []args)throws Exception{
        //variables
        Palabra palabra = new Palabra();
        Palabra palabra2 = new Palabra();
        int [] vocalesPalabra = new int [5];
        int [] vocalesPalabra2 = new int [5];
        int contador = 0;
        //mensaje
        System.out.println("Introduce una secuencia de caracteres acabada en '.' : ");
        //algoritmo
        while(Palabra.hayPalabras()){
            //lectura
            palabra.lectura();
            //algoritmo
            vocalesPalabra = palabra.getVocales();
            for(int indice = 0; indice<5; indice++){
                if((vocalesPalabra[indice] != 0)&&(vocalesPalabra2[indice])!=0){
                    if(vocalesPalabra[indice] == vocalesPalabra2[indice]){
                        contador++;
                    }
                }
            }
            //visualizacion 
            
            if(contador == palabra.numeroVocales()){
                System.out.print(palabra2.toString());
                System.out.println(" "+palabra.toString());
            }
            System.out.println("Palabra1 --> " + palabra.toString() + 
                    "\n"+ "Palabra2 --> " + palabra2.toString());   
            //copiar palabra 2
            Palabra.copiar(palabra, palabra2);
            vocalesPalabra2 = palabra2.getVocales(); 
                                 
        }
    }
    
}
    
    
