package UpCasting;

public class Planta {


    private String tipoPlanta;
    private String estacion;
    private String nombre;

    public Planta(String tipoPlanta, String estacion, String nombre) {
        this.tipoPlanta = tipoPlanta;
        this.estacion = estacion;
        this.nombre = nombre;
    }

    public void florecer() {
        System.out.println("La planta floreció...");

    }

    public void brote() {
        System.out.println("La planta tuvo un brote...");
    }

    private void podar() {
        System.out.println("La planta fue podada...");
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public void Injerto() {
       podar();
       System.out.println("La planta fue podada, y de ahi se saco un injerto...");
   }

    @Override
    public String toString() {
        return "UpCasting.Vivero{" + "tipoPlanta=" + tipoPlanta + ", Estacion en la que florece =" + estacion + ", nombre de la planta =" + nombre + '}';
    }

}


