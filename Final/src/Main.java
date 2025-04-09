public class Main {
    public static void main(String[] args) {

        int [] arreglo_notas = new int [3];
        arreglo_notas[0]=8;
        arreglo_notas[1]=6;
        arreglo_notas[2]=10;

        Alumno alu1 = new Alumno(42522342);
        Alumno alu2 = new Alumno(74252524,"Maria");
        Alumno alu3 = new Alumno(84635245,"Juan",arreglo_notas);

        alu2.mostrar_atributos();
        alu1.mostrar_atributos();
        alu3.mostrar_atributos();

        alu3.hacer_ejercicio();
    }

}