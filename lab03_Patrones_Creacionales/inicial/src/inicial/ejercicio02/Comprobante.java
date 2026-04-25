package inicial.ejercicio02;

public abstract class Comprobante {
    protected String cliente;
    protected double monto;

    public Comprobante(String cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    public abstract void mostrarDetalle();
}