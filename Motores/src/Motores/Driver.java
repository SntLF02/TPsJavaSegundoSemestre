package Motores;

public class Driver {
    public MotorPrincipal unidad;

    public Driver() {

        this.unidad = new MotorPrincipal(1000);
    }

    public Driver(int rpm) {

        this.unidad = new MotorPrincipal(rpm);
    }

    
    public Driver(MotorPrincipal unidad) {

        this.unidad = new MotorPrincipal(unidad);
    }
    
}
