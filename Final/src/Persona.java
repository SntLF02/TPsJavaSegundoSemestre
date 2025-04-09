public abstract class Persona {
    public String nombre;
    public final int dni;


    public Persona(int dni) {
        this.dni = dni;

    }//Constructor por defecto que no se le pasan atributos a no ser de que uno sea final
    //y se requiera varios valores para objetos diferentes

    public Persona(int dni, String nombre){
        this.nombre=nombre;
        this.dni=dni;
    }//Constructor

    public void mostrar_atributos(){
        System.out.println("nombre: "+ nombre);
        System.out.println("dni: "+ dni);
    }
    
    public abstract void hacer_ejercicio();

}
