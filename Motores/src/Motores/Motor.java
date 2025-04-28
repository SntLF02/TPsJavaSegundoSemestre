package Motores;

public abstract class Motor implements Auxiliar {
    protected int rmp;

    public Motor() {
    }

    public Motor(int rmp) {
        this.rmp = rmp;
    }
    public abstract int acelerar(int i);
    
    public void parar(){
        System.out.println("Vehículo detenido");
    }
   }
