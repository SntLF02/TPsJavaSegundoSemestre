import java.util.ArrayList;

public class Ciudad {
    private String nombreCiudad;
    private ArrayList<Restaurante>restaurantes ;

    public Ciudad() {
        this.restaurantes = new ArrayList<>();
    }

    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
        this.restaurantes = new ArrayList<>();
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void agregarRestaurante(Restaurante restaurante){
        restaurantes.add(restaurante);
    }

    public void mostrarRestaurantes() {
        System.out.println("Restaurantes en " + nombreCiudad + ":");
        for (Restaurante r : restaurantes) {
            System.out.println("- " + r.getNombre() + " (Sucursales: " + r.getSucursales().size() + ")");
        }
    }
}
