package Figuras;

import java.util.ArrayList;

public class Lado {
    private String nombre;
    private ArrayList<Punto>puntos;

    public Lado(String nombre, ArrayList<Punto> puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }
}
