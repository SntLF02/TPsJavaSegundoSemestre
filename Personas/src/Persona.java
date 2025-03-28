import javax.swing.*;

public class Persona {
    public static void main(String[] args) {

        Alumno a1 = new Alumno();
        a1.setDni(44538995);
        a1.nombre = "Santiago";
        a1.trabaja = true;

        Alumno a2 = new Alumno();
        a2.setDni(2358722);
        a2.nombre = "Sebastian";
        a2.trabaja = false;

        Alumno b1 = new Alumno();
        b1.setDni(26524563);
        b1.nombre = "Gero";
        b1.trabaja = true;

        a1.mostrar_atributos();
        a2.mostrar_atributos();
        b1.mostrar_atributos();

        System.out.println("Suma de los dni: " + (a1.getDni()+a2.getDni()+b1.getDni()));

        String unDNI = "DNI:"+String.valueOf(a1.getDni()); //convertir numero a String
        String edad = "20";
        int edadN = Integer.parseInt(edad); // convertir String a numero
        //Float.parseFloat(###)
        //Double.parseDouble(###)
        String nombre = "Santiago";
        char segunda = nombre.charAt(1);//a 'segunda' se le asigna el segundo caracter


        String n = JOptionPane.showInputDialog("Nombre?");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Edad?"));//JOP devuelve un String, por eso la conversion a int

    }
    Alumno z1 = new Alumno();
}