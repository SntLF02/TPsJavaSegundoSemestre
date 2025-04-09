import java.util.ArrayList;

public class Lote {
    private String nombre;
    private String tipo; // "Especial" o "Común"
    private ArrayList<Mineral> minerales;
    private ArrayList<String> historialSiembra;

    public Lote(String nombre, ArrayList<Mineral> minerales) {
        this.nombre = nombre;
        this.minerales = minerales;
        this.historialSiembra = new ArrayList<>();
        this.tipo = determinarTipo();
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public ArrayList<Mineral> getMinerales() {
        return minerales;
    }

    public ArrayList<String>getHistorialSiembra(){
        return historialSiembra;
    }

    public String determinarTipo(){
        boolean tieneSecundario = false;

        for (Mineral mineral : minerales) { // Recorre todos los minerales del lote
            if (mineral.getTipo().equalsIgnoreCase("Secundario")) { //Si encuentra un mineral secundario
                tieneSecundario = true;
                break;
            }
        }

        return tieneSecundario ? "Común" : "Especial";
    }

    public boolean haTenidoPastura() {
        for (String cereal : historialSiembra) {
            if (cereal.equalsIgnoreCase("Pastura")) {
                return true;
            }
        }
        return false;
        //return historialSiembra.stream().anyMatch(cereal -> cereal.equalsIgnoreCase("Pastura"));
    }
}