package inicial.isp;

public class Almacenero implements IEmpleadoTienda {
    private String nombre;

    public Almacenero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void registrarVenta(String producto, double monto) {
        System.out.println(nombre + " no registra ventas.");
    }

    @Override
    public void actualizarInventario(String producto, int cantidad) {
        System.out.println(nombre + " actualizó el stock de " + producto + " en " + cantidad + " unidades.");
    }

    @Override
    public void supervisarOperacion() {
        System.out.println(nombre + " no supervisa operaciones.");
    }
}
