import java.util.ArrayList;

public class Pais {
    private String nombre;
    private Continente continente;
    private ArrayList<Provincia> provincias;
    private ArrayList<Pais> paisesVecinos;

    public Pais(String nombre, Continente continente) {
        this.nombre = nombre;
        this.continente = continente;
        this.provincias = new ArrayList<>();
        this.paisesVecinos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public ArrayList<Pais> getPaisesVecinos() {
        return paisesVecinos;
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public void agregarPaisVecino(Pais pais) {
        paisesVecinos.add(pais);
    }
}