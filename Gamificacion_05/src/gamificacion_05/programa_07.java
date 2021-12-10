package gamificacion_05;



public class programa_07 {
    //variables
    final int END = -1;
    char []abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char [] cola =new char[50];
    int num;
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_07().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        
        //programa encargado de leer el numero introducido por el usuario y 
        //añadir el la letra 
        x();
    }
    private void x(){
        int aux;
        char aux2;
        for(int indice = 0; num != -1;indice++){
            System.out.println("Introduce un numero: ");
            num = LT.readInt();
            if(num>abecedario.length){
               System.out.println("Introduce un numero valido: ");
                num = LT.readInt(); 
            }
            aux = num-1;
            
            if(aux!=-2){
            aux2 = abecedario[aux];
            cola[indice] = aux2;
            }
        }
            for(int indiceDos = 0; indiceDos<cola.length;indiceDos++){
                if(cola[indiceDos] == 0){
                    break;
            }
                System.out.println("El valor de la array es: " + cola[indiceDos]);
                
        }
    }
}
