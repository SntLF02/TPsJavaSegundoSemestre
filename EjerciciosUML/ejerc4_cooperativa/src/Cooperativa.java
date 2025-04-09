import java.util.ArrayList;

public class Cooperativa {
    private ArrayList<Lote> lotes;

    public Cooperativa(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }

    public void recomendarSiembra(ArrayList<Cereal> cerealesDisponibles) {

        for (Lote lote : lotes) { //Recorre todos los lotes dentro de Cooperativa
            System.out.println("Lote: '"+lote.getNombre()+"' tipo: "+ lote.getTipo());

            for (Cereal cereal: cerealesDisponibles){
                if (cereal instanceof Pastura && lote.haTenidoPastura()) {
                    System.out.println("No se recomienda sembrar " + cereal.nombre +" ya tuvo pastura antes.");
                } else if (cereal.puedeSembrarseEn(lote)) {
                    System.out.println("Se recomienda sembrar " + cereal.nombre);
                } else {
                    System.out.println("No es recomendable sembrar " + cereal.nombre);
                }
            }

        }
    }
}