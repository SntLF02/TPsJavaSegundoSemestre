
public class Main {
    public static void main(String[] args) {

        Ciudad ciudad1= new Ciudad("Mendoza");

        Restaurante mcdonals = new Restaurante("Mcdonals ");
        Restaurante papanato = new Restaurante("Papanatos ");
        Restaurante elReydeLaMilanesa = new Restaurante("El Rey de la Milanesa");

        Sucursal sucursal1 = new Sucursal("sur", mcdonals);
        Sucursal sucursal2 = new Sucursal("norte", papanato);
        Sucursal sucursal3 = new Sucursal("este", mcdonals);
        Sucursal sucursal4 = new Sucursal("oeste", papanato);
        Sucursal sucursal5 = new Sucursal("centro", elReydeLaMilanesa);

        Plato hamburguesamc = new Plato("Hamburguesa",mcdonals);
        Plato hamburguesa = new Plato("Hamburguesa", papanato);
        Plato papas = new Plato("Papas",papanato);
        Plato papasmc = new Plato("Papas", mcdonals);
        Plato milanesa = new Plato("Milanesa", elReydeLaMilanesa);

        mcdonals.agregarSucursal(sucursal1);
        mcdonals.agregarSucursal(sucursal3);
        papanato.agregarSucursal(sucursal2);
        papanato.agregarSucursal(sucursal4);
        elReydeLaMilanesa.agregarSucursal((sucursal5));

        mcdonals.agregarPlato(hamburguesamc);
        mcdonals.agregarPlato(papasmc);
        papanato.agregarPlato(hamburguesa);
        papanato.agregarPlato(papas);
        elReydeLaMilanesa.agregarPlato(milanesa);

        ciudad1.agregarRestaurante(mcdonals);
        ciudad1.agregarRestaurante(papanato);
        ciudad1.agregarRestaurante(elReydeLaMilanesa);

        Persona clari = new Persona("Clari");
        Persona eli = new Persona("Eli");

        clari.agregarPlatoMeGusta(milanesa);
        clari.agregarPlatoMeGusta(hamburguesa);
        clari.agregarPlatoNoMeGusta(hamburguesamc);
        eli.agregarPlatoMeGusta(hamburguesamc);
        eli.agregarPlatoMeGusta(papasmc);
        eli.agregarPlatoNoMeGusta(papas);

        ciudad1.mostrarRestaurantes();
        System.out.println("---------");
        eli.mostrarMeGusta();
        eli.mostrarNoMeGusta();
        System.out.println("---------");
        clari.mostrarMeGusta();
        clari.mostrarNoMeGusta();
    }
}