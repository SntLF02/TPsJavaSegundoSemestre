package Sobrecarga;

public class Sobrecarga1 {
    public void metodo(){
        System.out.println("sin parametros");
    }
    public void metodo(int x){
        System.out.println("unico parametro pasado: x = "+ x);
    }
    public void metodo(int x, int y){
        System.out.println("Dos parametros pasados, x = "+ x + ", y = " + y);
        System.out.println("suma = " + x+y);
    }
    public void metodo(int x, String nombre){
        System.out.println("dos parametros pasados pero diferente tipo al anterior");
        System.out.println("x = "+ x + " nombre: "+ nombre);
    }
}
