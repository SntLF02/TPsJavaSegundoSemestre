package Motores;

public class MotorPrincipal extends Motor{

    public MotorPrincipal(int rmp) {
        super(rmp);
    }
    public MotorPrincipal(MotorPrincipal mp) {
        super(mp.rmp);
    }
    @Override
    public int acelerar(int i){
        return rmp+i;
    }

    public void parar(){
         System.out.println("El vehículo está detenido");
    }
    //método obtenido de la interface 
    public boolean funciona(){
        return true;
    }
}