package corregido.dip;

public class ProveedorLocal implements Proveedor {

    public ProveedorLocal() {
    }

    @Override
    public void abastecerProducto(String producto, int cantidad) {
        System.out.println("Proveedor local abasteció " + cantidad + " unidades de " + producto);
    }
}