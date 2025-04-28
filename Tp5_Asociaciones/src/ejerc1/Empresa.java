package ejerc1;

import java.util.ArrayList;

public class Empresa {
    public String rSocial;
    public ArrayList<Trabajador>empleado;

    public Empresa(){
    }

    public Empresa(String rSocial) {
        this.empleado = new ArrayList<>();
        this.rSocial = rSocial;
    }

}
