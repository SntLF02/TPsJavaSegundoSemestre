import java.util.ArrayList;

public class Estudiante extends Persona{
    public  ArrayList<Inscripcion> formulario = new ArrayList<>();

    public Estudiante(){
    }

    public Estudiante(String nombre, int legajo){
        super(nombre, legajo);
    }
}
