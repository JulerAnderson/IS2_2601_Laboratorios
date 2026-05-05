package corregido.ejercicio02;

public class CreadorBoleta extends CreadorComprobante {

    @Override
    public Comprobante crearComprobante(String cliente, double monto) {
        return new Boleta(cliente, monto);
    }
}