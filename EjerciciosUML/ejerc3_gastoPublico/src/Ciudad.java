public class Ciudad {
    private String nombreCiudad;
    private int habitantes;
    private int gastoPublico;
    private MontoRecaudado montoRecaudado;

    public Ciudad(String nombreCiudad, int habitantes, int gastoPublico, MontoRecaudado montoRecaudado) {
        this.nombreCiudad = nombreCiudad;
        this.habitantes = habitantes;
        this.gastoPublico = gastoPublico;
        this.montoRecaudado = montoRecaudado;
    }

    public boolean determinarDeficit(){
        return gastoPublico > montoRecaudado.calcularRecaudacionT();
    }

    public String obtener_informacion(){
        return "Ciudad: "+ nombreCiudad +
                "\nHabitantes: "+ habitantes +
                "\nGasto Publico: "+ gastoPublico +
                "\nRecaudacion total impuestos: "+ montoRecaudado.calcularRecaudacionT() +
                "\nEn deficit: "+ (determinarDeficit() ? "Si" : "No"); //elige opcion dependiendo si es True 'si' o false 'no'
    }

}
