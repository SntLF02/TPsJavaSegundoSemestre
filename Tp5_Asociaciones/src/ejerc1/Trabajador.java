package ejerc1;

public class Trabajador {
    private int dni;
    private Empresa Empleador;

    public Trabajador(){}

    public Trabajador(int dni, Empresa empleador) {
        this.dni = dni;
        Empleador = empleador;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Empresa getEmpleador() {
        return Empleador;
    }

    public void setEmpleador(Empresa empleador) {
        Empleador = empleador;
    }
}
