package Parametrico;

import java.util.ArrayList;

public class EJParametrico {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>() ;
        ArrayList<Integer> num = new ArrayList<>();

        Animal a1 = new Animal("Tigre");
        animales.add(a1);

        num.add(1);

        System.out.println(" El animal "+ num.get(0)+" es un "+ animales.get(0).getAnimal());
    }

}
