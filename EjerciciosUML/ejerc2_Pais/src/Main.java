import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear un continente
        Continente america = new Continente("América");

        // Crear países
        Pais argentina = new Pais("Argentina", america);
        Pais brasil = new Pais("Brasil", america);
        Pais chile = new Pais("Chile", america);

        // Agregar países al continente
        america.agregarPais(argentina);
        america.agregarPais(brasil);
        america.agregarPais(chile);

        // Crear provincias para Argentina
        Provincia mendoza = new Provincia("Mendoza", new Ciudad("Ciudad de Mendoza"));
        Provincia sanJuan = new Provincia("San Juan", new Ciudad("San Juan"));
        Provincia sanLuis = new Provincia("San Luis", new Ciudad("San Luis"));
        Provincia laRioja = new Provincia("La Rioja", new Ciudad("La Rioja"));

        // Agregar provincias a Argentina
        argentina.agregarProvincia(mendoza);
        argentina.agregarProvincia(sanJuan);
        argentina.agregarProvincia(sanLuis);
        argentina.agregarProvincia(laRioja);

        // Crear ciudades adicionales en Mendoza
        mendoza.agregarCiudad(new Ciudad("San Rafael"));
        mendoza.agregarCiudad(new Ciudad("Godoy Cruz"));

        // Establecer provincias vecinas reales
        mendoza.agregarProvinciaVecina(sanJuan);
        mendoza.agregarProvinciaVecina(sanLuis);

        sanJuan.agregarProvinciaVecina(mendoza);
        sanJuan.agregarProvinciaVecina(laRioja);

        sanLuis.agregarProvinciaVecina(mendoza);
        sanLuis.agregarProvinciaVecina(laRioja);

        laRioja.agregarProvinciaVecina(sanJuan);
        laRioja.agregarProvinciaVecina(sanLuis);

        // Establecer países vecinos de Argentina
        argentina.agregarPaisVecino(brasil);
        argentina.agregarPaisVecino(chile);

        // Establecer países vecinos de Brasil y Chile
        brasil.agregarPaisVecino(argentina);
        chile.agregarPaisVecino(argentina);

        // Mostrar información básica
        System.out.println("Continente: " + america.getNombre());
        System.out.println("Países en " + america.getNombre() + ":");

        for (Pais pais : america.getPaises()) {
            System.out.println("- " + pais.getNombre());
            System.out.println("  Provincias:");
            for (Provincia provincia : pais.getProvincias()) {
                System.out.println("  - " + provincia.getNombre() + " (Capital: " + provincia.getCapital().getNombre() + ")");
                System.out.println("    Ciudades:");
                for (Ciudad ciudad : provincia.getCiudades()) {
                    System.out.println("    - " + ciudad.getNombre());
                }
                System.out.println("    Provincias Vecinas:");
                for (Provincia provinciaVecina : provincia.getProvinciasVecinas()) {
                    System.out.println("    - " + provinciaVecina.getNombre());
                }
            }

            System.out.println("  Países Vecinos:");
            for (Pais paisVecino : pais.getPaisesVecinos()) {
                System.out.println("  - " + paisVecino.getNombre());
            }
        }
    }
}