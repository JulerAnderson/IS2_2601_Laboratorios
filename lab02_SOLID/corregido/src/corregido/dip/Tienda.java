package corregido.dip;

public class Tienda {
    private Proveedor proveedor;

    public Tienda(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void reabastecer(String producto, int cantidad) {
        proveedor.abastecerProducto(producto, cantidad);
    }
}