import java.util.ArrayList;

public class Paises {
    private String nombrePais;
    private ArrayList<Pais> paises_limitrofes;
    private ArrayList<Provincia>provincias;

    Public Pais {
        this.provincias = new ArrayList<Provincia>()
    }

    public class agregarProvincia(Provincia provincia){
        this.provincias.add(provincia)
    }
}
