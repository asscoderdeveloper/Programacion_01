/*
FUNCIONALIDAD:
1. declaración de un objeto alumno sin inicializar.
2. declaración de un objeto alumno con inicialización.
3. Lectura, desde el teclado, del objeto alumno declarado
sin incializar.
4. Visualización de los dos objeto alumno declarados.
 */
package gamificacion_07;

public class alumno_uso_1 {
    //metodo main
    public static void main (String [] args) throws Exception{
        //metodo principal
        new alumno_uso_1().metodoPrincipal();
    }
    
    private void metodoPrincipal(){
        //DECLARACIONES 
        //declaracion de un objeto sin incializar
        alumno alumno1 = new alumno();
        //declaracion de un objeto inicializado
        
        
        //ACCIONES
        //Lectrura, desde teclado, del objeto alumno declarado sin inicializar
        alumno1.lectura();
        
        //VISUALIZACION DE LOS OBJETOS DECLARADOS
        System.out.println("\nPRIMER ALUMNO: " + "\n"+alumno1.toString());
    }
}
