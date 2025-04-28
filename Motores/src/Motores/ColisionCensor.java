package Motores;

public class ColisionCensor {
    //atributo para identificar el objeto
    public String colision;

    public ColisionCensor(String colision) {
        this.colision = colision;
    }
    private PathAgent receptor;

    public ColisionCensor() {
    }

    // public ColisionCensor(PathAgent receptor) {this.receptor = receptor;}

    //public ColisionCensor(String colision, PathAgent receptor) {
    //    this.colision = colision;
    //    this.receptor = receptor;
    //}

    public PathAgent getReceptor() {
        return receptor;
    }

    public void setReceptor(PathAgent receptor) {
        this.receptor = receptor;
    }

    public void mostrarColisionCensaor(){
        System.out.println("No tiene atributos");
        System.out.println("Se asocia a+");
    }
    
}
