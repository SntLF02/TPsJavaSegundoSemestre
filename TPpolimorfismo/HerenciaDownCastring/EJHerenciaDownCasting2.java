package HerenciaDownCastring;

public class EJHerenciaDownCasting2 {

    public static void main(String[] args) {
        Tio t1 = new Sobrino();
        t1.nombre = "Alejo";

        Sobrino s1 = (Sobrino)t1;

        s1.edad = 15;
        System.out.println(s1.nombre);
        System.out.println(s1.edad);
        s1.showMessage();

    }

}
