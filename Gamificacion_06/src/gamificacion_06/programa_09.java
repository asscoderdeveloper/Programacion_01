package gamificacion_06;

/* Dados los datos electorales de un municipio en el que se han presentado 10 partidos políticos,
visualiza los resultados generales */

public class programa_09 {
    //metodo main
    public static void main(String []args) throws Exception{
        //metodo principal
        new programa_09().metodoPrincipal();
    }
    public void metodoPrincipal(){
        int votos[] = {10,12,20,23,32,1,23,4,16,19};
        String partidos[] = {"Rojo","Azul","Verde","Amarillo","Violeta","Magenta","Rosa","Marron","Blanco","Negro"};
        //visualizador
        visualizador(votos, partidos);
    }
    private void visualizador(int dato1[], String dato2[]){
        //variables
        int suma = 0;
        float porcentaje;
        //algoritmo
        for(int indice = 0; indice<dato1.length;indice++){
            suma += dato1[indice];
        }       
        for(int indice = 0; indice<dato1.length;indice++){
            System.out.println("El partido " + dato2[indice] + " tiene " + dato1[indice] + " votos ");
            porcentaje=((dato1[indice])/suma)*100;
            System.out.print("que supone un" + porcentaje + "% "
                    + "\n");
        }
    }
    
}
