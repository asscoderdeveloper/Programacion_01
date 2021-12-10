//clase que aglutina todos los atributos y metodos del objeto persona
package gamificacion_08;

public class Persona {
    //declaraciones de los atributos de la clase que definen al objeto persona
    
    //declaracion del atributo de objeto para declarar el nombre de la persona
    private String nombre;
    
    //declaracion del atributo de objeto para declarar el el nif de la persona
    private String nif;
    
    //declaracion del atributo de objeto para declarar la edad de la persona
    private int edad;
    
    //declaracion del atributo de objeto para declarar el saldo de su cuenta corriente
    private  static int saldo = 0;
    
    //METODOS
    
    //METODOS CONSTRUCTORES
    //metodo constructor sin parametros    
    public Persona(){}
    
    //metodo constructor con parametros para declarar los atributos del objeto persona
    public Persona(String dato1, String dato2, int dato3, int dato4){
        nombre = dato1;
        nif = dato2;
        edad = dato3;
        saldo = dato4;
    }
    
    //METODOS FUNCIONALES QUE DEFINEN EL COMPORTAMIENTO DE LA CLASE
    
    //metodo de objeto de lectura que lleva a cabo la lectura desde teclado
    //de un objeto persona
    
    public void lectura(){
        System.out.println("Lectura Objeto Persona: ");
        
        System.out.print("INTRODUCE EL NOMBRE DE LA PERSONA: ");
        nombre = LT.readLine();
        
        System.out.print("INTRODUCE EL NIF DE LA PERSONA: ");
        nif = LT.readLine();
        
        System.out.print("INTRODUCE LA EDAD DE LA PERSONA: ");
        edad = LT.readInt();
        
        System.out.print("INTRODUCE EL SALDO DE SU CUENTA BANCARIA: ");
        saldo = LT.readInt();
    }
    
    //metodo funcion toString de tipo string que lelva a cabo la conversion de la 
    //informacion representada por los atributos de un objeto a formato string 
    //con fines de visualizacion a traves de las sentecnais System.out.println
    public String toString(){
        return "NOMBRE: " + nombre + "\n"+
         "NIF: " + nif + "\n"+
         "EDAD: " + edad + "\n"+
         "SALDO EN LA CUENTA BANCARIA: " + saldo + "\n";
    }
    
    //metodo copia que devuelve una copia de un objeto persona
    public String copia(){
        return "NOMBRE: " + nombre + "\n"+
         "NIF: " + nif + "\n"+
         "EDAD: " + edad + "\n"+
         "SALDO EN LA CUENTA BANCARIA: " + saldo + "\n";
    }
    
    //metodo cumpleaños que lleva a cabo el incremento de la edad de un objeto
    //persona en una unidad
    public void cumpleaños(){
        edad = edad+1;
    }
    
    //metodo cobro que incrementa el saldo del objeto persona a traves de un 
    //parametro introducido por teclado
    public void cobro(){
        int dineroCobrado = 0;
        System.out.print("INTRODUCE LA CANTIDAD DE DINERO QUE HAS COBRADO: ");
        dineroCobrado =  LT.readInt();
        saldo =+dineroCobrado;
    }
    
    //igual pero sin parametro introducido
    public void cobro2(){
        saldo+=100000;
    }
    
    //metodo  gasto que lleva a cabo la reducción del saldo de un objeto persona
    //con el importe del parametro dado
    public void gasto(){
        int dineroGastado = 0;
        System.out.print("INTRODUCE LA CANTIDAD DE DINERO QUE HAS GASTADO: ");
        dineroGastado = LT.readInt();
        saldo = saldo - dineroGastado;
    }
}
