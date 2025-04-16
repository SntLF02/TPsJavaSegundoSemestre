package Cuerpo;

public class Corazon {
    public int latidos;

    public Corazon(){}

    public Corazon(int latidos){
        this.latidos = latidos;
    }

    public Corazon(Corazon corazon){
        this.latidos = corazon.latidos;
    }
}
