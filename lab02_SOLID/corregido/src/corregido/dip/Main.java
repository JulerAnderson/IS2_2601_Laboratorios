package corregido.dip;

public class Main {
    public static void main(String[] args) {
        Proveedor proveedor = new ProveedorLocal();
        Tienda tienda = new Tienda(proveedor);
        tienda.reabastecer("Arroz", 50);
        
        Proveedor proveedorAlt = new ProveedorAlternativo();
        Tienda tiendaConProvAlt = new Tienda(proveedorAlt);
        tiendaConProvAlt.reabastecer("Arroz", 50);
    }
}