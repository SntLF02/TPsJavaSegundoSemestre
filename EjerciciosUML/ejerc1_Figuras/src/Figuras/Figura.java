package Figuras;

import java.util.ArrayList;

public class Figura {

    private ArrayList<Poligono> poligonos; // al ser de 1.* uno o + a muchos se reprecenta con un arraylist
    private ArrayList<Elipse> elipses; //1.*

    public Figura() {
        this.poligonos = new ArrayList<>();
        this.elipses = new ArrayList<>();
        //reprecentando la agregacion (linea solida con rombo vacio)
    }

    public void agregarPoligono(Poligono poligono){
        this.poligonos.add(poligono);
    }

    public void borrarPoligono(Poligono poli){
        poligonos.remove(poli);
    }

    public void mostrarPoligonos(){
        for (Poligono p: poligonos){
            System.out.println(p.getNombre());

            for (Lado l : p.getLados()){
                System.out.println("Lado: " + l.getNombre());

                for (Punto punt: l.getPuntos()){
                    System.out.println("        Punto: (" + punt.getX() + ", " + punt.getY() + ")");

                }

            }
        }
    }

    public void agregarElipce(Elipse elipse){

        this.elipses.add(elipse);
    }

    public void borrarElipce(Elipse eli){
        elipses.remove(eli);
    }

    public void mostrarElipses(){
        for (Elipse e: elipses){
            System.out.println(e.getNombre());
        }
    }
}
