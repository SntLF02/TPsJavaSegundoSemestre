public class Main {
    public static void main(String[] args) {
        A a1 = new A(5,null);
        B b1 = new B("String en objeto b1");
        a1.setHace(b1);

        System.out.println("desde a1 veo la relacion con B");
        System.out.println(a1.getHace().b);

        A a2 = new A(10,null);
        A a3 = new A(20,b1);
        b1.tiene[0] = a1;
        b1.tiene[1] = a2;
        b1.tiene[2] = a3;

        System.out.println("\ndesde b1 relacion con A(tiene):");
        for (int i=0; i<3; i++){
            System.out.println("a"+(i+1)+": "+b1.tiene[i].a);
            System.out.println(b1.tiene[i].getHace() );

        }

        A auxiliar [] = new A[3];
        auxiliar [0] = a1;
        auxiliar [1] = a2;
        auxiliar [2] = a3;
        B b2 = new B("Segundo String de B",auxiliar);
        System.out.println("\ndesde b2 relacion con A(tiene):");
        for (int i=0; i<3; i++){
            System.out.println("a"+(i+1)+": "+b2.tiene[i].a);

        }
        a1.setHace(b2);

        System.out.println("Utilizo sumar de A desde b2");
        System.out.println("Atributo de A (a3): "+b2.tiene[2].a);
        System.out.println("a3 de b2 + 50: "+ b2.tiene[2].sumar(50));
        System.out.println("suma del atributo a de los a1, a2, a3 de b2: "+b2.tiene[2].sumar( b2.tiene[0].sumar( b2.tiene[1].sumar(0))));

    }
}