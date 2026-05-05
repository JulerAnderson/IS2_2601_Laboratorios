package corregido.ejercicio02;

public class Main {
    public static void main(String[] args) {
        CreadorComprobante creadorBoleta = new CreadorBoleta();
        CreadorComprobante creadorFactura = new CreadorFactura();

        creadorBoleta.emitirComprobante("Carlos Pérez", 150.0);
        creadorFactura.emitirComprobante("Empresa ABC", 320.0);
    }
}