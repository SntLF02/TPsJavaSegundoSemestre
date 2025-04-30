package UpCasting;

public class Enredadera extends Planta {

    private boolean tieneFlor;

    public Enredadera(String tipoPlanta, String estacion, String nombre, boolean tieneFlor) {
        super(tipoPlanta, estacion, nombre);
        this.tieneFlor = tieneFlor;
    }

    public void Florecida(){
        if (tieneFlor){
            System.out.println("La planta ha florecido!!");
        }
    }



}
