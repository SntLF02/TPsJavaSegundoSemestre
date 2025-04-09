import java.util.ArrayList;

public abstract class Cereal {
    protected String nombre;
    protected ArrayList<String> nombresMineralesRequeridos;

    public Cereal(String nombre, ArrayList<String> nombresMineralesRequeridos) {
        this.nombre = nombre;
        this.nombresMineralesRequeridos = nombresMineralesRequeridos;
    }

    public boolean puedeSembrarseEn(Lote lote) {
        ArrayList<String> nombresMineralesDelLote = new ArrayList<>();
        for (Mineral mineral : lote.getMinerales()) {
            nombresMineralesDelLote.add(mineral.getNombre());
        }

        return nombresMineralesDelLote.containsAll(nombresMineralesRequeridos);
    }
}