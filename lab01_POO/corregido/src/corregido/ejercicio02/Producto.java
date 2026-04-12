package corregido.ejercicio02;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Precio y stock no pueden ser negativos.");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean hayStock() {
        return stock > 0;
    }

    public void reducirStock() {
        if (hayStock()) {
            stock--;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public abstract void mostrarInfo();
}
