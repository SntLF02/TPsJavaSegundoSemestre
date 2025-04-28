public class Main {
    public static void main(String[] args) {
        a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        c();
    }

    public static void c() {
        d();
    }

    public static void d(){
        try {
            int resultado = 10 / 0; // Esto genera ArithmeticException
        } catch (ArithmeticException ae){
            System.out.println("Error aritmetico: "+ ae);
        }
    }
}