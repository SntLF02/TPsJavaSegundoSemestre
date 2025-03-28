
public class Animal {
    public String raza;
    public int edad;
    public static int machos = 0;
    public static int hembras = 0;

    public Animal(){}
    public Animal(String raza,int edad){
        this.raza = raza;
        this.edad = edad;
    }

    public void mostrarAtributos(){
        System.out.println("Raza: "+raza);
        System.out.println("Edad: "+edad);
        System.out.println("----------------------------");
    }

    public void aumentarMachos(){
        machos+=2;
    }
    public void aumentarHembras(){
        hembras +=1;
    }

}
