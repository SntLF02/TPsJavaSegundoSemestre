public class Clase2 extends Clase1{
    public Clase2(){
        super();
    }

    public Clase2(int s,String h,int edad){
        super(s,h,edad);
    }

    public void mostrar_datos(){
        System.out.println("mostrar datos de clase2:");
        System.out.println("Edad -> "+getEdad());
    }

    public void m_datosSuper(){
        super.mostrar_datos();
    }
}
