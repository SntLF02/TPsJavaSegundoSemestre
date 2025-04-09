public class Clase1 implements Interface1 {
    public int s;
    private String h;
    private int edad;

    public Clase1(){}

    public Clase1(int s, String h,int edad) {
        this.s = s;
        this.h = h;
        this.edad=edad;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad=edad;
    }
    public void mostrar_datos(){
        System.out.println("Implementar mostrar_datos() de clase1");
        System.out.println("edad: "+ edad);
    }

    public int calcular_anio(int b){
        return 0;
    }

}
