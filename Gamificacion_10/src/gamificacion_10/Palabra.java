/*
CLASE Palabra
Agklutina las declaraciones y funcionalidades para gestionar objetos Palabra
 */
package gamificacion_10;

public class Palabra {
    //DECLARACIÓN DE LOS ATRIBUTOS DE LA CLASE QUE DESCRIBEN EL ESTADO DE LOS
    //OBJETOS Palabra
    //declaración atributo de clase constante de tipo entero para representar el máximo
    //número de caractres que puede tener un objeto Palabra
    private static final int MAXIMO_NUMERO_CARACTERES=20;
    //declaración atributo de clase constante de tipo char para representar el
    //caracter de fin de secuencia de caracteres
    private static final char FINAL_SECUENCIA='.';
    //declaración atributo de clase constante de tipo char que representa el
    //caracter espacio en blanco(' '
    private static final char ESPACIO=' ';
    //declaración atributo de clase variable de tipo char paa representar el
    //caracter leido de la secuencia de caracteres
    private static char caracter=ESPACIO;
    //declaración atributo de objeto de tipo array de componentes tipo char para
    //representar/almacenarlos caracteres de un objeto Palabra
    private char [] caracteres=new char[MAXIMO_NUMERO_CARACTERES];
    //declaración atrbuto de objeto de tipo entero para representar el número
    //de caracteres de un objeto Palabra
    private int numeroCaracteres;
    
    
    //MÉTODOS
    
    //método constructor
    public Palabra() {
        //inicialización del atributo de objeto numeroCaracteres
        numeroCaracteres=0;
    }
    
    //método funcionales describen el comportamiento de los objetos Palabra
    
    //método de clase buscarPalabra que lleva a cabo la búsqueda de un objeto Palabra 
    //en la secuencia de caracteres
    private static void buscarPalabra() {
        while (caracter==ESPACIO) {
            //lectura siguiente caracter de la secuencia
            caracter=LT.readChar();
        }
    }
    
    
    //método de clase  boleano hayPalabras que verifica si en la secuencia de caracteres hay
    //al menos una palabra para leer
    public static boolean hayPalabras() {
        //llamada al método buscarPalabra
        buscarPalabra();
        //verificar si se ha encontrado una palabra
        return (caracter!=FINAL_SECUENCIA);
    }
    
    //método de objeto lectura que lleva a cabo la lectura de un objeto Palabra
    //desde la secuencia de caracteres.
    //NOTA: el método lectura solo será llamado siempre y cuando haya, al menos,
    //una palabra en la secuencia para leer
    public void lectura() {
        //inicialización atributo numeroCaracteres a 0
        numeroCaracteres=0;
        //bucle de lectura y almacenamiento de los caracteres del objeto Palabra a leer
        //desde la secuencia de caracteres
        while ((caracter!=FINAL_SECUENCIA)&&(caracter!=ESPACIO)) {
            //al ser un caracter alfabético es un caracter de la palabra que estamos
            //leyendo y or lo tanto será almacenado en la componente que
            //le corresponde del array caracteres
            caracteres[numeroCaracteres]=caracter;
            //incremneto del atributo numeroCaracteres
            numeroCaracteres++;
            //lectura siguiente caracter de la secuencia 
            caracter=LT.readChar();
        }
    }
    
    //método de objeto toString que lleva a cabo la conversión de un objeto Palabra
    //a String con fines de utilizarlo en las sentencias System.out.print y 
    //System.out.println
    public String toString() {
        //DECLARACIONES
        //declaración de una variable Striung para almacenar el resultado
        //de la concatenación de los caracteres del objeto Palabra a convertir
        String resultado="";
        
        //ACCIONES
        //bucle de concatenaciones
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //concatenar el caracter de lapalabra almacenado en la componente
            //indice-ésima del array caracteres con el String resultado
            resultado=resultado+caracteres[indice];
        }
        //devoluciñon String resultante
        return resultado;   
    }
    
    //método de objeto booleano igualNumeroVocalesQueConsonantes que lleva a cabo
    //la verificación de si un objeto Palabra tiene el mismo número de vocales
    //que consonantes
    public boolean igualNumeroVocalesQueConsonantes() {
        //DECLARACIONES
        //declaración variable entera para almacenar el número de vocales
        int contadorVocales=0;
        //declaración variable entera para almacenar el número de consonantes
        int numeroConsonantes;
        
        //ACCIONES
        //bucle para contabilizar el número de vocales contenidas en un
        //objeto Palabra
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificación de vocal con el caracter de la palabra contenido
            //en la componente indice-ésima del array caracteres
            if (esVocal(caracteres[indice])) {
                //incremento del contador de vocales
                contadorVocales++;
            }
        }
        
        //calcular el número de consonantes
        numeroConsonantes=numeroCaracteres-contadorVocales;
        
        //devolver el resultado demandado
        return (numeroConsonantes==contadorVocales);
    }
    
    //método booleano esVocal lleva a cabo la verificación de vocal del caracter
    //dado por parámetro
    private boolean esVocal(char car) {
        return ((car=='a')||(car=='e')||(car=='i')||(car=='o')||(car=='u'));
    }
    
    //método de objeto función conversionMayusculas que devuelve un objeto Palabra
    //a partir de la conversión a mayúsculas de los caracteres del objeto Palabra
    public Palabra conversionMayusculas() {
        //DECLARACIONES
        //declaración objeto Palabra local para almacenar el resultado de la
        //conversión a mayúsculas
        Palabra conversion=new Palabra();
        
        //ACCIONES
        //bucle de conversión a mayúsculas
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //conversión a mayúsculas del caracter de la palabra
            //contenido en la componente indice-ésima del array caracteres
            //asignándolo a la componente indice-ésima del array
            //caracteres del objeto Palabra conversion
            conversion.caracteres[indice]=(char)((int)caracteres[indice]-('a'-'A'));
        }
        //asignar al atributo numeroCaracteres del objeto Palabra conversión
        //el contenido del atributo numeroCaracteres del objeto Palabra convertido
        conversion.numeroCaracteres=numeroCaracteres;
        
        //devolución objeto Palabra resultante
        return conversion;
    }
    
    //método deobjeto numeroCaracteresPar que verifica si un objeto Palabra tiene
    //un número par de caracteres
    public boolean numeroCaracteresPar() {
        return (numeroCaracteres%2==0);
    }
    
    //método de objeto numeroConsonantesPar que verifica si un objeto Palabra
    //tiene un número par de caracteres consonantes
    public boolean numeroConsonantesPar() {
        //DECLARACIONES
        //declaración contador entero para almacenar el número de consonantes
        int numeroConsonantes=0;
        
        //ACCIONES
        //bucle contador de consonantes
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificación si el caracter del objeto Palabra almacenado
            //en la componente indice-ésima del array caracteres es consonante
            if (!esVocal(caracteres[indice])) {
                //incremento contador de consonantes
                numeroConsonantes++;      
            }
        }
        
        //devolver resultado
        return (numeroConsonantes%2==0);
    }
    
    //método de objeto numeroConsonantes devuelve el número de caracteres consonantes
    //de un objeto Palabra
    public int numeroConsonantes() {
        //DECLARACIONES
        //declaración contador entero para almacenar el número de consonantes
        int numeroConsonantes=0;
        
        //ACCIONES
        //bucle contador de consonantes
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificación si el caracter del objeto Palabra almacenado
            //en la componente indice-ésima del array caracteres es consonante
            if (!esVocal(caracteres[indice])) {
                //incremento contador de consonantes
                numeroConsonantes++;      
            }
        }
        
        //devolver resultado
        return numeroConsonantes;        
    }
    
    //método de objeto getNumeroCaracteres devuelve el número de caracteres de 
    //un objeto Palabra
    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }
    
    //método de objeto soloVocales_e_o que verifica si un objeto Palabra tiene
    //como vocales unicamente a las vocales 'e' y 'o'
    public boolean soloVocales_e_o() {
        //DECLARACIONES
        //declaración constante array de componentes char para representar los
        //caracteres vocales
        final char [] VOCALES={'a','e','i','o','u'};
        //declaración variable array de componentes enteras para almacenar el
        //número de cada una de las vocales 
        int [] numeroVocales={0,0,0,0,0};
        
        //ACCIONES
        //bucle de verificación y contador de vocales en un objeto Palabra
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificar si el caracter del objeto Palabra almacenado en la
            //componente indice-ésima del arary caracteres es una vocal
            if (esVocal(caracteres[indice])) {
                //incrementar contador correspondiente a la vocal 
                for (int i=0;i<VOCALES.length;i++) {
                    if (VOCALES[i]==caracteres[indice]) {
                        //incremento del contador i-ésimo del array numeroVocales
                        numeroVocales[i]++;
                    }
                }
            }
        }
        
        //devolver resultado
        for (int indice=0;indice<numeroVocales.length;indice++) {
            if (esPar(indice)) {
                if (numeroVocales[indice]!=0) {
                    return false;
                }
            }
            else {
                if (numeroVocales[indice]==0) {
                    return false;
                }
            }
        }
        return true;
        
    }
    
    //método privado esPar verifica si un número dado es par
    private boolean esPar(int numero) {
        return (numero%2==0);
    }
    
    //método de objeto esPalindromo que verifica si un objeto Palabra es un
    //palíndromo (capicua)
    public boolean esPalindromo() {
        //DECLARACIONES
        //declaración indice inicial
        int inicio=0;
        //declaración indice final
        int fin=numeroCaracteres-1;
        
        //bucle de verificación
        for (;inicio<fin;inicio++,fin--) {
            //comparación del caracter almacenado en la componente inicio-ésima
            //con el caracter almacenado en la componente fin-ésima del array
            //caracteres
            if (caracteres[inicio]!=caracteres[fin]) {
                return false;
            }
        }
        return true;
    }
    
    //método de objeto masVocales que verifica si un objeto Palabra tiene más
    //vocales que consonantes
    public boolean masVocales() {
        return (numeroVocales()>numeroConsonantes());    
        //return (numeroVocales()>((numeroCaracteres-numeroVocales());
        //return ((numeroCaracteres-numeroConsonantes())>numeroConsonantes());
    }
    
    //método de objeto numeroVocales devuelve el número de caracteres vocales
    //de un objeto Palabra
    public int numeroVocales() {
        //DECLARACIONES
        //declaración contador entero para almacenar el número de consonantes
        int numeroVocales=0;
        
        //ACCIONES
        //bucle contador de consonantes
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificación si el caracter del objeto Palabra almacenado
            //en la componente indice-ésima del array caracteres es consonante
            if (esVocal(caracteres[indice])) {
                //incremento contador de vocales
                numeroVocales++;      
            }
        }
        
        //devolver resultado
        return numeroVocales;        
    }
    
    //método de objeto pesoCodigo que calcula el peso de código de un objeto
    //Palabra
    public int pesoCodigo() {
        //DECLARACIONES
        //declaración variable enetera para almacenar el suma total de los
        //códigos de los caracteres del objeto Palabra
        int pesoTotal=0;
        
        //ACCIONES
        //bucle para acumular el peso de c´ñodigo de cada uno de los caracteres
        //del objeto Palabra
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //acumular el peso del caracter almacenado en la componente indice-ésima
            //del arary caracteres
            pesoTotal=pesoTotal+(int)caracteres[indice];
        }
        //devolución resultado
        return pesoTotal;
    }
    
    //método de objeto numeroVocalesPar que verifica si un objeto Palabra tiene
    //un número par de caracteres vocales
    public boolean numeroVocalesPar() {
        return (numeroVocales()%2==0);
    }
    
    //método de objeto soloVocales_a que verifica si un objeto Palabra tiene 
    //vocales y todas son el caracter vocal 'a'
    public boolean soloVocales_a() {
        //DECLARACIONES
        //declaración constante array de componentes char para representar los
        //caracteres vocales
        final char [] VOCALES={'a','e','i','o','u'};
        //declaración variable array de componentes enteras para almacenar
        //el número de cada una de las vocales que tiene el objeto Palabra
        int [] numeroVocales={0,0,0,0,0};
        
        //ACCIONES
        //bucle para contar el número de cada una de las vocales contenidas
        //en el objeto Palabra
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificar si el caracter almacenado en la componente indice-ésima
            //del array caracteres es una vocal
            if (esVocal(caracteres[indice])) {
                //incrementar contador del arraay numeroVocales correspondiente
                //para ello lo primero es buscar el caracter de la palabra
                //en el array VOCALES
                for (int indice2=0;indice2<VOCALES.length;indice2++) {
                    //verificar si el caracter de la palabra es igual a la
                    //vocal de la componente indice2-ésima del array VOCALES
                    if (VOCALES[indice2]==caracteres[indice]) {
                        //incremento del contador de la componente indice2 del
                        //array numeroVocales
                        numeroVocales[indice2]++;
                    }
                }  
            }
        }
        
        //verficar si en el array numeroVocales solo el contador correspondiente
        //al caracter vocal 'a' es superior a 0
        //primero miramos que los contadores del resto de vocales son 0
        for (int indice=1; indice<numeroVocales.length;indice++) {
            if (numeroVocales[indice]>0) {
                //devolver false porque la palabra tiene alguna vocal diferente a
                //la vocal 'a'
                return false;
            }
        }
        //devolver la verificación de si hay alguna vocal 'a'
        return (numeroVocales[0]>0);
        
        //Otra forma de verificar el resultado para devolver un valor sería
        // return ((numeroVocales[0]>0)&&(numeroVocales[1]==0)&&
        //         (numeroVocales[2]==0)&&(numeroVocales[3]==0)&&
        //         (numeroVocales[4]==0));
    }
    
    //método de objeto todosCaracteresVocales que verifica si un objeto Palabra
    //tiene todos sus caracteres vocales
    public boolean todosCaracteresVocales() {
        //bucle de verificación de si todos los caracteres de un objeto Palabra son
        //vocales
        for (int indice=0;indice<numeroCaracteres;indice++) {
            //verificar si el caracter contenido en la componente indice-ésima
            //del array caracteres no es vocal
            if (!esVocal(caracteres[indice])) {
                return false;
            }
        }
        
        return true;
    }
    
    //método de objeto empiezaTerminaVocal que verifica si un objeto Palabra
    //empieza y termina con vocal
    public boolean empiezaTerminaVocal() {
        return (esVocal(caracteres[0])&&esVocal(caracteres[numeroCaracteres-1]));
    }
    
  
    //MÉTODO adicionCaracter LLEVA A CABO LA ADICIÓN DE UN CARACTER DADO POR PARÁMETRO
    //EN UN OBJETO Palabra
    public void adicionCaracter(char caracter) {
        //almacenar el caracter dado en la primera componente libre del atributo
        //caracteres del objeto Palabra. El índice de dicha componente coincide
        //con el valor del atributo numeroCaracteres del mismo objeto Palabra
        caracteres[numeroCaracteres]=caracter;
        //incrementar el atributo numeroCaracteres del objeto Palabra para que
        //tenga en cuenta el caracter que acabamos de añadir en la palabra
        numeroCaracteres++;
    }
    
    //MÉTODO obtenerCaracter LLEVA A CABO LA OBTENCIÓN DEL CARACTER DE UNA
    //PALABRA QUE ESTÁ ALMACENADO EN LA POSICIÓN DADA DENTRO DEL ATRIBUTO
    //caracteres DE DICHO OBJETO Palabra
    public char obtenerCaracter(int posicion) {
        //devolver el caracter del objeto Palabra que está en la posición
        //dada dentro del atributo array caracteres
        return (caracteres[posicion]);
    }   
    
}
