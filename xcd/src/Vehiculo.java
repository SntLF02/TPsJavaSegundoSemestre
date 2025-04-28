public abstract class Vehiculo {
    private  float velocidad;

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void acelera(float acelera){
        tr
        this.velocidad = velocidad + acelera;
    }

    public void frena(float frena){
        this velocidad = velocidad - frena;
    }
}
