import java.util.ArrayList;

public class Pastura extends Cereal {
    public Pastura(String nombre, ArrayList<String> mineralesRequeridos) {
        super(nombre, mineralesRequeridos);
    }

    @Override
    public boolean puedeSembrarseEn(Lote lote) {
        return super.puedeSembrarseEn(lote) && !lote.haTenidoPastura();
    }
}
