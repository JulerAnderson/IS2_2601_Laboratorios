package inicial.dip;

public class Tienda {
    private ProveedorLocal proveedor;

    public Tienda() {
        this.proveedor = new ProveedorLocal();
    }

    public void reabastecer(String producto, int cantidad) {
        proveedor.abastecerProducto(producto, cantidad);
    }

}