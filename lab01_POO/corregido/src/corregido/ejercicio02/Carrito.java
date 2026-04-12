package corregido.ejercicio02;
import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        if (producto.hayStock()) {  
            productos.add(producto);
            producto.reducirStock();
            System.out.println("Producto agregado al carrito.");
        } else {
            System.out.println("No hay stock disponible para este producto.");
        }
    }

    public void mostrarResumen() {
        double total = 0;
        System.out.println("\n--- Resumen del Carrito ---");
        for (Producto p : productos) {
            p.mostrarInfo();
            total += p.getPrecio();
        }
        System.out.println("Total a pagar: S/ " + total);
    }
}
