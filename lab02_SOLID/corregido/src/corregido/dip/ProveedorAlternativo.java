package corregido.dip;

public class ProveedorAlternativo implements Proveedor {

    public ProveedorAlternativo() {
    }

    @Override
    public void abastecerProducto(String producto, int cantidad) {
        System.out.println("Proveedor alternativo abasteció " + cantidad + " unidades de " + producto);
    }
}