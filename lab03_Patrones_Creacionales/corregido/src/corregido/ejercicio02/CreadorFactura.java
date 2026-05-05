package corregido.ejercicio02;

public class CreadorFactura extends CreadorComprobante {

    @Override
    public Comprobante crearComprobante(String cliente, double monto) {
        return new Factura(cliente, monto);
    }
}