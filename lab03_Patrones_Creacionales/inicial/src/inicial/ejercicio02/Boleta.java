package inicial.ejercicio02;

public class Boleta extends Comprobante {

    public Boleta(String cliente, double monto) {
        super(cliente, monto);
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Boleta emitida para " + cliente + " por S/ " + monto);
    }
}