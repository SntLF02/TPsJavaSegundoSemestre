public class Mineral {
    private String nombre;
    private String tipo; // "Primario" o "Secundario"

    public Mineral(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}