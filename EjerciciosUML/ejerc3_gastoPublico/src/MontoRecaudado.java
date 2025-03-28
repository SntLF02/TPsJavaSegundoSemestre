public class MontoRecaudado {
    private int impuesto1;
    private int impuesto2;
    private int impuesto3;
    private int impuesto4;
    private int impuesto5;

    public MontoRecaudado(int impuesto1, int impuesto2, int impuesto3, int impuesto4, int impuesto5) {
        this.impuesto1 = impuesto1;
        this.impuesto2 = impuesto2;
        this.impuesto3 = impuesto3;
        this.impuesto4 = impuesto4;
        this.impuesto5 = impuesto5;
    }

    public double calcularRecaudacionT(){
        return impuesto1+impuesto2+impuesto3+impuesto4+impuesto5;
    }
}
