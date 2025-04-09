import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear minerales
        Mineral nitrogeno = new Mineral("Nitrogeno", "Primario");
        Mineral fosforo = new Mineral("Fosforo", "Primario");
        Mineral potasio = new Mineral("Potasio", "Secundario");
        Mineral calcio = new Mineral("Calcio", "Secundario");

        // Crear lotes con minerales
        ArrayList<Mineral> mineralesLote1 = new ArrayList<>();
        mineralesLote1.add(nitrogeno);
        mineralesLote1.add(fosforo);
        //mineralesLote1.add(potasio);
        Lote lote1 = new Lote("Lote1", mineralesLote1);

        lote1.getHistorialSiembra().add("Trigo");
        lote1.getHistorialSiembra().add("Pastura");


        ArrayList<Mineral> mineralesLote2 = new ArrayList<>();
        mineralesLote2.add(calcio);
        mineralesLote2.add(potasio);
        mineralesLote2.add(nitrogeno);
        Lote lote2 = new Lote("Lote2", mineralesLote2);

        //Crear cereales con sus minerales requeridos
        ArrayList<String> mineralesMaiz = new ArrayList<>();
        mineralesMaiz.add("Nitrogeno");
        mineralesMaiz.add("Fosforo");
        Cereal maiz = new Cosecha_Gruesa("Maíz", mineralesMaiz);

        ArrayList<String> mineralesTrigo = new ArrayList<>();
        mineralesTrigo.add("Nitrogeno");
        mineralesTrigo.add("Calcio");
        Cereal trigo = new Cosecha_Fina("Trigo", mineralesTrigo);

        ArrayList<String> mineralesAlfalfa = new ArrayList<>();
        mineralesAlfalfa.add("Fosforo");
        mineralesAlfalfa.add("Potasio");
        Cereal alfalfa = new Pastura("Alfalfa", mineralesAlfalfa);

        // Crear lista de cereales disponibles
        ArrayList<Cereal> cerealesDisponibles = new ArrayList<>();
        cerealesDisponibles.add(maiz);
        cerealesDisponibles.add(trigo);
        cerealesDisponibles.add(alfalfa);

        // Crear lista de lotes y cooperativa
        ArrayList<Lote> lotes = new ArrayList<>();
        lotes.add(lote1);
        lotes.add(lote2);
        Cooperativa cooperativa = new Cooperativa(lotes);

        System.out.println("\n Recomendaciones de siembra:");
        cooperativa.recomendarSiembra(cerealesDisponibles);
    }
}