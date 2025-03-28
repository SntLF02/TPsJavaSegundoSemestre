public class Alumno {
    //atributos
    private int dni;
    public String nombre;
    public boolean trabaja;

    public void mostrar_atributos(){
        System.out.println("dni: "+dni);
        System.out.println("Nombre: "+nombre);
        if (trabaja)
            System.out.println("Trabaja");
        else
            System.out.println("No trabaja");
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Alumno(){

    }
    public Alumno(int dni)
    {
        this.dni=dni;
    }
}
