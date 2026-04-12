package corregido.ejercicio02;

public class ProductoDigital extends Producto {
    private String urlDescarga;

    public ProductoDigital(String nombre, double precio, int stock, String urlDescarga) {
        super(nombre, precio, stock);
        this.urlDescarga = urlDescarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto Digital: " + nombre + " | Precio: S/ " + precio + " | Enlace: " + urlDescarga + " | Stock: " + stock);
    }
}
