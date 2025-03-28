import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincias(Provincia prov){
        this.provincias.add(prov);
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public ArrayList<Ciudad> calcularCiudadesDeficit(){
        ArrayList<Ciudad>ciudadesEnDeficit = new ArrayList<>();
        for (Provincia provincia : provincias){
            for (Ciudad ciudad : provincia.getCiudades()){
                if (ciudad.determinarDeficit()){
                    ciudadesEnDeficit.add(ciudad);
                }
            }
        }
        return ciudadesEnDeficit;
    }

    public ArrayList<Provincia> calcularProvinciasDeficit(){
        ArrayList<Provincia>provinciasDeficit = new ArrayList<>();
        for (Provincia provincia : provincias){
            int totalCiudades = provincia.getCiudades().size();
            int ciudadesEnDeficit = provincia.contarCiudadesDeficit();
            if (ciudadesEnDeficit > totalCiudades / 2){
                provinciasDeficit.add(provincia);
            }
        }
        return provinciasDeficit;
    }

}
