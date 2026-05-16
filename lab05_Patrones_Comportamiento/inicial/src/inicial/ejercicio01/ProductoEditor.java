package inicial.ejercicio01;

public class ProductoEditor {
    private String nombreProducto;
    private double precio;
    private int stock;

    public ProductoEditor(String nombreProducto, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombreProducto + " | Precio: S/ " + precio + " | Stock: " + stock);
    }

    public void guardarCambios() {
        System.out.println("Producto guardado correctamente en el sistema.");
    }
}