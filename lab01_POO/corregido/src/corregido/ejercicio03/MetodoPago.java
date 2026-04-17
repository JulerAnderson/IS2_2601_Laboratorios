package corregido.ejercicio03;
public abstract class MetodoPago implements Pago {
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }
}
