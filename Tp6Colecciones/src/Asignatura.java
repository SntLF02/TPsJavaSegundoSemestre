public class Asignatura {
    private int codigo;
    public Profesor instructor;

    public Asignatura(){}

    public Asignatura(int codigo, Profesor instructor) {
        this.codigo = codigo;
        this.instructor = instructor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
