package inicial.ejercicio02;

public class Main {
    public static void main(String[] args) {
        String tipoComprobante = "factura";
        Comprobante comprobante;

        if (tipoComprobante.equalsIgnoreCase("boleta")) {
            comprobante = new Boleta("Carlos Pérez", 150.0);
        } else if (tipoComprobante.equalsIgnoreCase("factura")) {
            comprobante = new Factura("Empresa ABC", 320.0);
        } else {
            System.out.println("Tipo de comprobante no válido.");
            return;
        }
        comprobante.mostrarDetalle();
        // Qué pasa si mañana agregamos otro tipo de comprobante?
    }
}