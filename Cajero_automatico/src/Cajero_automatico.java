public class Cajero_automatico {

    public final double efectivo = 0;
    protected double acepta;
    private String devuelve;

    public String getDevuelve() {
        return devuelve;
    }

    public void setDevuelve(String devuelve) {
        this.devuelve = devuelve;
    }

    public void procesarPedido(){

    }
    public boolean pago(double cantidad){
        return true;

    }

}