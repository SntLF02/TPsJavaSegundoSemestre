package Herencia1;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor(){
        super();
    }

    public Profesor(String nombre, int edad, String asignatura){
        super(nombre,edad);
        this.asignatura=asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void mostrarProfesor(){
        System.out.println("info Profesor: \n nombre: "+ getNombre() +
                "\n edad: " + getEdad() +
                "\n asignatura que da: " + asignatura);
    }
}
