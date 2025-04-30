package Herencia1;

public class Alumno extends Persona{
    private String carrera;

    public Alumno(){
        super();
    }

    public Alumno(String nombre, int edad, String carrera){
        super(nombre,edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void mostrarAlumno(){
        System.out.println("info Alumno: \n nombre: "+ getNombre() +
            "\n edad: " + getEdad() +
            "\n carrera que estudia: " + carrera);
    }

}
