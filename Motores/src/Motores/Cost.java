package Motores;

public class Cost {

    public float a;
    private PathAgent receptor;
    private ColisionCensor censor;

    public Cost(){}

    public Cost(float a, Motores.ColisionCensor censor, Motores.PathAgent receptor) {
        this.a = a;
        this.censor = censor;
        this.receptor = receptor;
    }

    public Motores.ColisionCensor getCensor() {
        return censor;
    }

    public void setCensor(Motores.ColisionCensor censor) {
        this.censor = censor;
    }

    public Motores.PathAgent getReceptor() {
        return receptor;
    }

    public void setReceptor(Motores.PathAgent receptor) {
        this.receptor = receptor;
    }
}
