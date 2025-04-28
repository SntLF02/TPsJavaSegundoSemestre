import java.util.Date;

public class Inscripcion {
    public Estudiante inscripto;
    private Date fecha;
    public Asignatura en;

    public Inscripcion(Asignatura en){
        this.en = en;
    }

    public Inscripcion(Estudiante inscripto, Asignatura en, Date fecha) {
        this.inscripto = inscripto;
        this.en = en;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
