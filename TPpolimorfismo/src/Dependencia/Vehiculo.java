package Dependencia;

public class Vehiculo {
    private String tipove;
    public Vehiculo(String tipove){
        this.tipove=tipove;
    }

    public String getTipove() {
        return tipove;
    }

    public void setTipove(String tipove) {
        this.tipove = tipove;
    }
    public void cargar_combustible (Combustible combustible){
        System.out.println("Cargando combustible "+combustible.getTipo()+ " a "+getTipove());
    }
}
