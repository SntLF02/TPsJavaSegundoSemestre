package Cuerpo;

public class Cuerpo {
    public int a;
    public Corazon tiene;

    public Cuerpo(){
        tiene = new Corazon(); // composicion
    }

    public Cuerpo( int a){
        this.a = a;
        tiene = new Corazon(); // composicion
    }

    public Cuerpo( int a, Corazon tiene){
        this.a = a;
        // this.tiene = tiene ; no es composicion
        this.tiene = new Corazon(tiene); // composicion
    }
}
