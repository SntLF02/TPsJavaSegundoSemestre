import java.util.ArrayList;

public class Restaurante {

    private String nombre;
    private ArrayList<Plato>platos;
    private ArrayList<Sucursal>sucursales;

    public Restaurante() {
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.platos = new ArrayList<>();
        this.sucursales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void agregarSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
    }

    public void agregarPlato(Plato plato){
        if (platos.size() < 20) {
            platos.add(plato);
        } else {
            System.out.println("Este restaurante ya tiene el máximo de 20 platos.");
        }
    }
}
