package ejerc1;

public class Main {
    public static void main(String[] args) {
        Empresa Cocacola = new Empresa("CocaCola");

        Trabajador trabajador1 = new Trabajador(44423435, Cocacola);

        Cocacola.empleado.add(trabajador1);

        System.out.println("dni trabajador 1: "+ Cocacola.empleado.get(0).getDni());
        System.out.println("Trabajando para: "+ trabajador1.getEmpleador().rSocial);
    }
}
