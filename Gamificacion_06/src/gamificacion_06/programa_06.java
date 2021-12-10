package gamificacion_06;

/*  Realizar un programa que teniendo para cada Comunidad Autónoma el número de contagios
COVID habidos durante el último mes visualice la Comunidad con más contagios y la media de
contagios a nivel nacional. La visualización debe seguir el siguiente formato */

public class programa_06 {
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new programa_06().metodoPrincipal();
    }
    public void metodoPrincipal(){
        //variables
        String comunidades [] = {"Andalucia", "Aragon", "Asturias","Baleares", "Canarias", "Castilla Leon", "Castilla la Mancha","Cataluña", "Valenciana", "Extremadura", "Galicia", "Madrid"
                + "Murcia"};
        int contagios [] = {234,145,654,67,435,233,43,456,987,1002,876,254,432};
        //llamar a la funcion encargada de hacer la media
        media(contagios);
        //llamar a la funcion encargada de encontrar la comunidad con mas contagios
        max(contagios, comunidades);
    }
    private void media(int dato []){
        float suma = 0;
        for (int indice = 0; indice<dato.length;indice++){
            suma += dato[indice];
        }
        System.out.println("El valor de la media es: " + suma/10 );
    }
    //máximo
    private void max(int dato [], String dato2[]){
        //variables
        int max = 0, aux = 0;
        //algoritmo
        for(int indice = 0; indice<dato.length; indice++){
            if(dato[indice]>max){
                max = dato[indice];
                aux = indice;
            }
        }   
        System.out.println("La comunidad con mas contagios es: "+ dato2[aux]);
    }
}


