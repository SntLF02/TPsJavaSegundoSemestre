package Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Sobrecarga1 s1 = new Sobrecarga1();
        s1.metodo();
        System.out.println("----------------------");
        s1.metodo(5);
        System.out.println("----------------------");
        s1.metodo(8,2);
        System.out.println("----------------------");
        s1.metodo(110, "Santiago");

    }
}
