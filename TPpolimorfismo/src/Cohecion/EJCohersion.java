package Cohecion;

public class EJCohersion {

    public static void main(String[] args) {
        int a, b;
        double resta1;
        a = 10;
        b = 5;

        Resta resta = new Resta();

        System.out.println("La resta de "+a+" y "+b+" es: "+resta.restar(a,b));
        resta1 = (double ) a;
    }

}





