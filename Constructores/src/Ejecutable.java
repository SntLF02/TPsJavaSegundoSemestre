public class Ejecutable {
    public static void main(String[] args) {
        System.out.println("Persona 1:");
        Persona per1 = new Persona();
        per1.mostrarAtributos();

        System.out.println("Persona 2:");
        Persona per2 = new Persona("Juan");
        per2.mostrarAtributos();

        System.out.println("Persona 3:");
        Persona per3 = new Persona("Santi", 22,true);
        per3.mostrarAtributos();

        System.out.println("Persona 4:");
        Persona per4 = new Persona("Maria",false,34);
        per4.mostrarAtributos();

        System.out.println("Persona 5:"); //se usa la copia de constructor para per5 para usar lo mismos atributos de per4
        Persona per5 = new Persona(per4);
        per5.mostrarAtributos();

        System.out.println("Variable cantiadad desde la clase: "+Persona.cantidad);
        System.out.println("Variable cantidad desde el objeto: "+per4.cantidad);
        per4.aumentarCantidad();
        per1.aumentarCantidad();
        System.out.println("Valor de cantidad: "+Persona.cantidad);


    }
}
