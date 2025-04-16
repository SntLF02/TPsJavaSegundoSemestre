import java.util.ArrayList;

public class Persona {

    private String nombre;
    private ArrayList<Plato>platosMeGusta;
    private ArrayList<Plato>platosNoMeGusta;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.platosMeGusta = new ArrayList<>();
        this.platosNoMeGusta = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Plato> getPlatosMeGusta() {
        return platosMeGusta;
    }

    public void setPlatosMeGusta(ArrayList<Plato> platosMeGusta) {
        this.platosMeGusta = platosMeGusta;
    }

    public ArrayList<Plato> getPlatosNoMeGusta() {
        return platosNoMeGusta;
    }

    public void setPlatosNoMeGusta(ArrayList<Plato> platosNoMeGusta) {
        this.platosNoMeGusta = platosNoMeGusta;
    }

    public void agregarPlatoMeGusta(Plato plato) {
        platosMeGusta.add(plato);
    }

    public void agregarPlatoNoMeGusta(Plato plato) {
        platosNoMeGusta.add(plato);
    }

    public void mostrarMeGusta(){
        System.out.println("PLatos que le gustan a " + nombre);
        for (Plato p:platosMeGusta) {
            System.out.println("Nombre del plato: "+p.getNombrePlato()+ " (Restaurante: "+p.getRestaurante().getNombre() + ")");

        }
    }
    public void mostrarNoMeGusta(){
        System.out.println("PLatos que NO le gustan a " + nombre);
        for (Plato p:platosNoMeGusta) {
            System.out.println("Nombre del plato: "+p.getNombrePlato()+ " (Restaurante: "+p.getRestaurante().getNombre() + ")");

        }
    }
}

