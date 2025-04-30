package HerenciaUpCasting;

public class EJHerenciaUpCasting {
    public static void main(String[] args) {
        Padre p1 = (Padre) new Hijo();
        Padre p2 = (Padre) new Hijo();

        p1.Imprimir();
        p2.Imprimir();
    }

}
