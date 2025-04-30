package Herencia1;

public class Main {
    public static void main(String[] args) {

        Profesor p1 = new Profesor("Julian", 43, "Matematica");
        Alumno a1 = new Alumno("Santiago", 21, "Ingenieria en Programacion");

        p1.mostrarProfesor();
        System.out.println("----------------------");
        a1.mostrarAlumno();
    }
}
