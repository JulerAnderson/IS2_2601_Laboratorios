package inicial.isp;

public class Supervisor implements IEmpleadoTienda{
    private String nombre;

    public Supervisor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void registrarVenta(String producto, double monto) {
        System.out.println(nombre + " no registra ventas directamente.");
    }

    @Override
    public void actualizarInventario(String producto, int cantidad) {
        System.out.println(nombre + " no actualiza inventario directamente.");
    }

    @Override
    public void supervisarOperacion() {
        System.out.println(nombre + " está supervisando la operación de la tienda.");
    }
}
