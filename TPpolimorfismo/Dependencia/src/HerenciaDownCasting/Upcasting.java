package HerenciaDownCasting;

public class Upcasting {
    public static void main(String[] args) {
        Empleado e1 = new Gerente();
        e1.trabajar();
    }
}
