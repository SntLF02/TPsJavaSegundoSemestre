public class A {
    public int a;
    private B hace;

    public A(){}

    public A(int a, B hace) {
        this.a = a;
        this.hace = hace;
    }

    public B getHace() {
        return hace;
    }

    public void setHace(B hace) {
        this.hace = hace;
    }

    public int sumar(int x){
        return a+x;
    }
}
