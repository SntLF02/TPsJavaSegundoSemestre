

public class Main {
    public static void main(String[] args) {
        MontoRecaudado recaudacion1 = new MontoRecaudado(5000,3000,2000,1000,4000);
        MontoRecaudado recaudacion2 = new MontoRecaudado(3000,2000,1000,500,1000);

        Ciudad ciudad1 =new Ciudad("Mendoza",150000,17000,recaudacion1);
        Ciudad ciudad2 = new Ciudad("San Rafael",80000,12000,recaudacion2);

        Provincia provincia1 = new Provincia("Mendoza");
        provincia1.agregarCiudad(ciudad1);
        provincia1.agregarCiudad(ciudad2);

        //
        MontoRecaudado recaudacion3 = new MontoRecaudado(1000,2000,1500,4000,1000);
        Ciudad ciudad3 = new Ciudad("San Luis",70000,8000,recaudacion3);
        Provincia provincia2 = new Provincia("San Luis");
        provincia2.agregarCiudad(ciudad3);


        Pais pais = new Pais("Argentina");
        pais.agregarProvincias(provincia1);
        pais.agregarProvincias(provincia2);

        System.out.println("Ciudades en deficit:");
        for (Ciudad ciudad : pais.calcularCiudadesDeficit()){
            System.out.println(ciudad.obtener_informacion());
            System.out.println("------------");
        }

        System.out.println("\nProvincias en deficit:");
        for (Provincia prov : pais.calcularProvinciasDeficit()){
            System.out.println(prov.getNombreProv());
        }


    }
}