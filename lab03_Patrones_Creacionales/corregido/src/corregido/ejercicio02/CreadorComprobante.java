package corregido.ejercicio02;

public abstract class CreadorComprobante {

    public abstract Comprobante crearComprobante(String cliente, double monto);

    public void emitirComprobante(String cliente, double monto) {
        Comprobante comprobante = crearComprobante(cliente, monto);
        comprobante.mostrarDetalle();
    }
}