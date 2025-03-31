package Figuras;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Figura figura1 = new Figura(); //creacion objeto
        Punto p1 = new Punto (3,5);
        Punto p2 = new Punto (8,1);
        Punto p3 = new Punto (8,1);
        Punto p4 = new Punto (9,3);
        Punto p5 = new Punto (9,3);
        Punto p6 = new Punto (3,5);

        ArrayList<Punto> puntos12 = new ArrayList<>();
        puntos12.add(p1);
        puntos12.add(p2);
        Lado l1 = new Lado ("l1",puntos12);

        ArrayList<Punto> puntos34 = new ArrayList<>();
        puntos34.add(p3);
        puntos34.add(p4);
        Lado l2 = new Lado ("l2",puntos34);

        ArrayList<Punto> puntos56 = new ArrayList<>();
        puntos56.add(p5);
        puntos56.add(p6);
        Lado l3 = new Lado ("l3",puntos56);

       ArrayList<Lado>lados = new ArrayList<>();
       lados.add(l1);
       lados.add(l2);
       lados.add(l3);

       Triangulo t1 = new Triangulo ("escaleno",lados);
       figura1.agregarPoligono(t1);
       figura1.mostrarPoligonos();

       Circulo c1 = new Circulo("circulo");
       figura1.agregarElipce(c1);
       figura1.mostrarElipses();

    }
}
