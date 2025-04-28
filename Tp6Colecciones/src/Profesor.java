import java.util.ArrayList;

public class Profesor extends Persona {
    public ArrayList<Asignatura> curso = new ArrayList<>();

    public Profesor(){
    }

    public Profesor(String nombre, int legajo){
        super(nombre, legajo);

    }
}
