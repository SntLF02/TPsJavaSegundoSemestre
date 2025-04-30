package UpCasting;

import java.util.ArrayList;

public class Vivero {

    private ArrayList<Planta> plantas;

    public Vivero() {
        this.plantas = new ArrayList<Planta>();
    }

    public Vivero(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }


    public void agregarPlanta(Planta p) {
        this.plantas.add(p);
    }

    public void mostrar(){
        for (Planta P: plantas) {
            System.out.println("La planta "+ P.toString());

        }
    }
}

