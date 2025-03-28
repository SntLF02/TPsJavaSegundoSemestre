package Figuras;

import java.util.ArrayList;

public abstract class Poligono {
    private String nombre; //simple parametro
    private ArrayList<Lado> lados; //relacion de composicion

    public Poligono(String nombre, ArrayList<Lado> lados) {
        this.nombre = nombre;
        this.lados = lados;
        // Se le pasa el arraylist de lados porque siosi necesita de lados para existir el poligono, relacion de composicion (linea solida con rombo relleno)
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Lado> getLados() {
        return lados;
    }

    public void setLados(ArrayList<Lado> lados) {
        this.lados = lados;
    }
}
