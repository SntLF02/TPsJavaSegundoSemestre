public class Persona {
    public String nombre;
    public int edad;
    public boolean trabaja;
    public static int cantidad = 0; //static siempre se inicializa, atributo de clase no se puede inicializar en los constructores, para prestar serivicio a todos los objetos por igual

    public Persona(){}//constructor por defecto o sea valores de variables nulos o en cero

    public Persona(String nombre){ //constructor sobrecargado
        this.nombre = nombre;
    }

    public Persona(String n,int edad,boolean trabaja){
        nombre = n; //si no tienen el mismo nombre de la variable no hace falta el this.
        this.edad = edad;
        this.trabaja = trabaja;
    }

    public Persona(String n,boolean trabaja,int edad){
        nombre = n;
        this.edad = edad;
        this.trabaja = trabaja;
    }

    public Persona(Persona p){ //Contrsuctor como copia de otro objeto
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.trabaja = p.trabaja;
    }

    // Estamos haciendo uso del polimorfismo al usar Persona de tres formas diferentes


    public void aumentarCantidad(){
        cantidad++;
    }

    public void mostrarAtributos(){
        System.out.println(nombre+" "+edad+" años");
        if (trabaja==false){
            System.out.println("No trabaja");
        } else{
            System.out.println("Si trabaja");
        }
    }
}
