package corregido.isp;

public class Cajero implements IRegistradorVentas{
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void registrarVenta(String producto, double monto) {
        System.out.println(nombre + " registró la venta de " + producto + " por S/ " + monto);
    }
}
