public class B {
    public String b;
    public A[] tiene = new A[3];

    public B(){}

    public B(String b){
        this.b = b;
    }

    public B(String b, A[] tiene){
        this.b = b;
        this.tiene = tiene;
    }
}
