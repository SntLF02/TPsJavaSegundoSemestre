public class Alumno extends Persona{

    public int notas[] = new int[3];

    public Alumno(int dni){
        super(dni);
    }//constructor por defecto herencia

    public Alumno(int dni,String nombre) {
        super(dni,nombre);
    }//contructor sobrecargado  herencia

    public Alumno (int dni, String nombre, int[] notas){
        super(dni,nombre);
        this.notas=notas;
    }//constructor sobrecargado con atributos de la clase y herencia

    public void mostrar_atributos(){//re definicion o sobre escritura de metodo o polymorfismo
        super.mostrar_atributos();//heredado de la superClase Persona

        for (int i = 0; i<notas.length;i++){
            System.out.println("Nota "+(i+1)+": "+notas[0]);
        }
    }

    public void hacer_ejercicio(){
        System.out.println("Hacer 3 series de 10 sentadillas");
    }
}
