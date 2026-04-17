package inicial.isp;

public interface IEmpleadoTienda {
    void registrarVenta(String producto, double monto);
    void actualizarInventario(String producto, int cantidad);
    void supervisarOperacion();
}
