package gamificacion_08;

public class persona_uso_1 {
    //metodo main
    public static void main(String []args) throws Exception{
        new persona_uso_1().metodoPrincipal();
    }
    //metodo principal
    private void metodoPrincipal(){
        //DECLARACIONES 
        //declaracion de un objeto sin inicializar
        Persona persona1 = new Persona();
        
        //ACCIONES
        //lectura, desde teclado, del objeto persona declarado sin incializar
        persona1.lectura();
        persona1.gasto();
        
        //VISUALIZACION DE LOS OBJETOS DECLARADOS
        System.out.println("\nPRIMERA PERSONA --> \n" + persona1.toString());
        //System.out.println("\n"+persona1.copia());
    }
}
