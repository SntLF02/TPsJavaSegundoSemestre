import java.util.ArrayList;

public class Provincia {
    private String nombreProv;
    private ArrayList<Ciudad> ciudades;

    public Provincia(String nombreProv) {
        this.nombreProv = nombreProv;
        this.ciudades = new ArrayList<>();
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void agregarCiudad(Ciudad ciudad){
        this.ciudades.add(ciudad);
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public int contarCiudadesDeficit(){
        int contador = 0;
        for (Ciudad ciudad : ciudades){
            if (ciudad.determinarDeficit()){
                contador++;
            }
        }
        return contador;
    }
}
