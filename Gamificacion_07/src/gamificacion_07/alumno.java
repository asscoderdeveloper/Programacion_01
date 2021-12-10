/*
Clase alumno
Que aglutina todos los atributos y las funcionalidades de Objetos Alumno
*/
package gamificacion_07;

public class alumno {
    //declaraciones de los atributos de la clase que definen el estado de todo 
    //objeto alumno
    
    //declaracion atributo de objeto para declarar el nombre del alumno
    private String nombre;
    //declaracion atributo de objeto para declarar la fecha de nacimiento de un 
    //alumno
    private String fechaNacimiento;
    //declaracion atributo de objeto para declarar el DNI de un alumno
    private String dni;
    //declaracion atributo de objeto para declarar el codigo postal del alumno
    private int codigoPostal;
    //declaracion atributo de objeto para declarar la carrera que estudia
    private String carrera;
    //atributo de clase para representar el maximo numero de asignaturas que puede 
    //realizar un estudiante
    private static final int NUMERO_MAXIMO_ASIGNATURAS = 10; // ponemos el static porque es un atirbuto de clase
    //declaramos un atributo de clase para representar la cantidad de asignaturas que realiza el estudiante
    private int numeroAsignaturas;
    //declaracion de un atributo de objeto apra representar las asignaturas 
    //que cursa el estudiante
    private String [] asignaturas;
    
    //METODOS
    
    //METODOS CONSTRUCTORES
    //METODO CONSTRUCTOR SIN PARAMETROS
    
    public alumno() {}
    
    //metodo constructor con parametros para incializar los atributos del objeto
    //alumno a instanciar
    
    public alumno(String dato1, String dato2, String dato3, 
            int dato4, String dato5, int dato6){
        
        nombre = dato1;
        fechaNacimiento = dato2;
        dni = dato3;
        codigoPostal = dato4;
        carrera = dato5;
        numeroAsignaturas = dato6;
    }
    
    
    
    //METODOS FUNCIONALES QUE DEFINEN EL COMPORTAMIENTO DE TODO OBJETO alumno
    
    //metodo de objeto lectura que lleva a cabo la lectura desde el teclado
    //de un objeto alumno
    public void lectura(){
         System.out.println("Lectura Objeto Alumno ");
         
         System.out.print("NOMBRE: ");
         nombre = LT.readLine();
         
         System.out.print("FECHA DE NACIMIENTO: ");
         fechaNacimiento = LT.readLine();
         
         System.out.print("DNI: ");
         dni = LT.readLine();
         
         System.out.print("CODIGO POSTAL: ");
         codigoPostal = LT.readInt();
         
         System.out.print("CARRERA: ");
         carrera = LT.readLine();
         
         System.out.println("Introduce la cantidad de asignaturas que realizas: ");
         numeroAsignaturas = LT.readInt();
         
         lecturaAsignaturas();

     }
    
    //metodo privado que lleva  a cabo la introduccion de las asignaturas que realiza 
    //por teclado
    
    private void lecturaAsignaturas(){
                asignaturas = new String [numeroAsignaturas];

        System.out.println("Introduce las asignaturas que realizas");
        for(int indice = 0; indice<numeroAsignaturas; indice++){
            asignaturas[indice] = LT.readLine();
        }
    }
     
     ///método función toString de tipo String que lleva a cabo la conversión
    //de la información representada por los atributos de un objeto a formato
    //String con fines de visualización a través de las sentencias System.out.print
    //o System.out println
     public String toString(){
         return "NOMBRE: " + nombre + "\n"+
          "FECHA DE NACIMIENTO: " + fechaNacimiento + "\n"+
          "DNI: " + dni + "\n"+
          "CODIGO POSTAL: " + codigoPostal + "\n"+
          "NUMERO MAXIMO DE ASIGNATURAS A REALIZAR: " + NUMERO_MAXIMO_ASIGNATURAS+ "\n"+
          "CARRERA: " + carrera + "\n"+
          "NUMERO DE ASIGNATURAS QUE CURSA: " + numeroAsignaturas + "\n"+
          "LAS ASIGNATURAS QUE CURSA SON: " + visualizadorAsignaturas();
              
          }
     private String visualizadorAsignaturas(){
        for(int indice = 0; indice< numeroAsignaturas; indice++){
           System.out.print(asignaturas[indice]);
        }
        return "";
     }
}



