package Motores;
public class Motores {
    public static void main(String[] args) {
        MotorPrincipal mp1 = new MotorPrincipal(1000);
        Driver drv1 = new Driver(mp1);
        ColisionCensor cc1 = new ColisionCensor("C C 1");
        PathAgent pa1 = new PathAgent(drv1);
        cc1.setReceptor(pa1);
        pa1.setCensor(cc1, 0);
        //a. desde pa1 los censores
        System.out.println("Censor en PathAgent-> "+pa1.getCensor()[0].colision);
        //b.desde PathAgent, acelerar()
        System.out.println("PathAgent activa acelerar 1000->resutlado: "+pa1.control.unidad.acelerar(1000));
        //c.Desde ColisionCensor muestre el receptor
        cc1.getReceptor().mostrarAtributos();
        //d.Desde PathAgent rmp
        System.out.println("Desde PathAgent, el rmp es "+pa1.control.unidad.rmp);
        //e. Desde PathAgent ejecute funciona()
        System.out.print("Desde PathAgent, funciona devuelve -> ");
        if (pa1.control.unidad.funciona())
            System.out.println("Verdadero");
        else
            System.out.println("Falso");
        //f. Desde clases, constante de la interface
        System.out.println("Se muestra la constante de la interface min_revol");
        System.out.println("Desde Motor: "+Motor.min_revol);
        System.out.println("Desde MotorPrincipal: "+MotorPrincipal.min_revol);
        System.out.println("Desde la interface: "+Auxiliar.min_revol);
        
    }
}
