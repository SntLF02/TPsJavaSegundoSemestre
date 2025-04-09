import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Clase1 c1 = new Clase1(5,"abc",22);
        Clase2 c2 = new Clase2(7,"ads",24);

        System.out.println(c1.calcular_anio(7));
        c1.mostrar_datos();
        System.out.println("Atributo s: "+c1.s);
        System.out.println("a de clase mediante objeto: "+c1.a);
        System.out.println("a desde clase: "+Clase1.a);
        System.out.println("a desde interface: "+Interface1.letra);

        c1.mostrar_datos();
        c2.mostrar_datos();
        c2.m_datosSuper();

    }
}