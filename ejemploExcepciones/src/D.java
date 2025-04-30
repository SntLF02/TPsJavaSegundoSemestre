public class D {
    public void metodoD(){

        try {
            // aqui es donde se lanza las excepciones
            throw new IllegalStateException("Se ah producido un error en el metodo D");
        } catch (IllegalStateException  e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
