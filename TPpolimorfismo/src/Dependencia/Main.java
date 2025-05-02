package Dependencia;

public class Main {
    public static void main(String[] args) {
        Combustible combustible = new Combustible("DIESEL");
        Vehiculo vehiculo = new Vehiculo("CAMION");
        vehiculo.cargar_combustible(combustible);
    }
}
