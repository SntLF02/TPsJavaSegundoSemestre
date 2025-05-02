package UpCasting;

public class EJUpCasting {

    public static void main(String[] args) {

        Vivero v = new Vivero();
        Enredadera e = new Enredadera("enredadera", "primavera - verano", "liquidambar", true);
        Planta P = e;

        v.agregarPlanta(e);
        v.agregarPlanta(new Flor("Jazmin", "Primavera", "Cielo", 10));


        v.mostrar();


    }


}
