public class Ejecutable {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Caniche",9);
        Animal animal2 = new Animal("Koker",5);
        animal1.aumentarMachos();
        Animal animal3 = new Animal("Salchicha",13);
        animal3.aumentarHembras();

        animal1.mostrarAtributos();
        animal2.mostrarAtributos();
        animal3.mostrarAtributos();
        System.out.println("Cantidad de machos: "+Animal.machos);
        System.out.println("Cantidad de hembras: "+Animal.hembras);
    }
}
