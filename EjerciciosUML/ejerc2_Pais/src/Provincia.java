import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private Ciudad capital;
    private ArrayList<Ciudad> ciudades;
    private ArrayList<Provincia> provinciasVecinas;

    public Provincia(String nombre, Ciudad capital) {
        this.nombre = nombre;
        this.capital = capital;
        this.ciudades = new ArrayList<>();
        this.provinciasVecinas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void setCapital(Ciudad capital) {
        this.capital = capital;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public ArrayList<Provincia> getProvinciasVecinas() {
        return provinciasVecinas;
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }

    public void agregarProvinciaVecina(Provincia provincia) {
        provinciasVecinas.add(provincia);
    }
}