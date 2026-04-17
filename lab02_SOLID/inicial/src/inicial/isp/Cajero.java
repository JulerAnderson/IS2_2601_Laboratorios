package inicial.isp;

public class Cajero implements IEmpleadoTienda{
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void registrarVenta(String producto, double monto) {
        System.out.println(nombre + " registró la venta de " + producto + " por S/ " + monto);        
    }

    @Override
    public void actualizarInventario(String producto, int cantidad) {
        System.out.println(nombre + " no gestiona inventario.");
        
    }

    @Override
    public void supervisarOperacion() {
        System.out.println(nombre + " no supervisa operaciones.");        
    }

}
