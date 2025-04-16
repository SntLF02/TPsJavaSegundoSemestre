public class Sucursal {
    private String direccion;
    private Restaurante restaurantePrincipal;

    public Sucursal() {
    }

    public Sucursal(String direccion, Restaurante restaurantePrincipal) {
        this.direccion = direccion;
        this.restaurantePrincipal = restaurantePrincipal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Restaurante getRestaurantePrincipal() {
        return restaurantePrincipal;
    }

    public void setRestaurantePrincipal(Restaurante restaurantePrincipal) {
        this.restaurantePrincipal = restaurantePrincipal;
    }
}
