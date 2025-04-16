public class Plato {
    private String nombrePlato;
    private Restaurante restaurante;

    public Plato() {
    }

    public Plato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Plato(String nombrePlato, Restaurante restaurante) {
        this.nombrePlato = nombrePlato;
        this.restaurante = restaurante;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
}
