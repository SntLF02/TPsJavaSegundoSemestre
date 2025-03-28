import java.util.ArrayList;

public class Provincia {
    private String nombreProv;
    private ArrayList<Provincia> limitaPais;
    private ArrayList<Provincia> limitaProv;

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        
        this.nombreProv = nombreProv;
    }
}
