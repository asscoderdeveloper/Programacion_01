package gamificacion_05;
/*
FUNCIONALIDAD: Dar valores a una array de 100 componentes, mostrar la suma
de todos los valores y realizar al media
OBJETIVO: Intorducción a los arrays
FECHA: 30/10/21
AUTOR: Alex Sánchez
 */

/*ALGORITMO PROGRAMA 01
    Lectura de variables
    Tratamiento
    Visualizacion
Algoritmo lectura de variables{
    Mensaje que pida las variables
    Leer las variables
}
Algoritmo tratamiento{
   Llamar al subprograma para que realice la lectura de caracteres, llamar a otro
subprograma para que cuente las palabras

Visualizacion{
    Imprimir por pantalla el numero de palabras inpares
}
 */
public class programa_05 {
    //variables
    String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    //metodo main
    public static void main (String []args) throws Exception{
        //metodo principal
        new programa_05().metodoPrincipal();
    }
    public void metodoPrincipal() throws Exception{
        //variables
        int temperaturas [] = {40,32,32,43,12,5,4,21,23,9,0,12};

        //llamada a funcion que compara las temperaturas
        mayor(temperaturas);
        menor(temperaturas);
        //llamada a funcion que realiza la media aritmetica de las temperaturas
        mediaAritmetica(temperaturas);
    }
    private void mayor(int []dato){
        int mayor = dato[0], calido = 0;
        for(int indice = 0; indice<dato.length;indice++){
            if(dato[indice]>mayor){
                mayor = dato[indice];
                calido = indice;
            }
        }
        System.out.println("El mes mas calido del año es: "+ meses[calido]);
    }
    private void menor(int [] dato){
        int menor = dato[0], frio =0;
        for(int indice = 0; indice<dato.length;indice++){
            if(dato[indice]<menor){
                    menor = dato[indice];
                    frio = indice;
                }            
        } 
        System.out.println("El mes mas frio es: " + meses[frio]);
    }
    
        
        private void mediaAritmetica(int [] dato){
        float suma = 0;       
        for(int indice = 0 ; indice<dato.length; indice++){ 
            suma +=dato[indice];
        }
        System.out.println("La media de temperatura durante los 12 meses es de: " + suma/12);
    }
}
