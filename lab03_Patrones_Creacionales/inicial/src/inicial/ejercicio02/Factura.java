package inicial.ejercicio02;

public class Factura extends Comprobante {

    public Factura(String cliente, double monto) {
        super(cliente, monto);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Factura emitida para " + cliente + " por S/ " + monto);
    }
}