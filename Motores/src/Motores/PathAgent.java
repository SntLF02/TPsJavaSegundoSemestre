package Motores;

public class PathAgent {
    public Driver control;
    private ColisionCensor censor[]= new ColisionCensor[10];

    public PathAgent() {
    }

    public PathAgent(Driver control) {
        this.control = control;
    }

    // public ColisionCensor[] getCensor() { return censor;}

    // public void setCensor(ColisionCensor[] censor) { this.censor = censor;}

    // sobrecarga de setCensor
    public void setCensor(ColisionCensor censor, int indice) {
        this.censor[indice] = censor;
    }
    public void mostrarAtributos(){
        System.out.println("-----------------");
        System.out.println("Atributos de PathAgent");
        System.out.println("Contiene un Driver que incluye un MotorPrincipal");
        System.out.println("y contiene un arreglo de ColisionCensor");
        System.out.println("-----------------");
    }
}
