package UpCasting;

public class Flor extends Planta {

    private int cantidadFlores;

    public Flor(String tipoPlanta, String estacion, String nombre, int cantidadFlores) {
        super(tipoPlanta, estacion, nombre);
        this.cantidadFlores = cantidadFlores;
    }

    public void cortarFlor(){
        System.out.println("Se cortó una flor...");
    }


}
