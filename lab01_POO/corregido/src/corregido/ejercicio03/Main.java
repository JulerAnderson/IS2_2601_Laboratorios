package corregido.ejercicio03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 130.50;

        System.out.println("--- Pasarela de Pago ---");
        System.out.println("Total a pagar: S/ " + total);
        System.out.println("1. Pago con Tarjeta");
        System.out.println("2. Pago con Transferencia");
        System.out.print("Seleccione una opción: ");
        String opcion = sc.nextLine();

        Pago metodoPago;

        if (opcion.equals("1")) {
            metodoPago = new PagoConTarjeta(total);
        } else {
            metodoPago = new PagoConTransferencia(total);
        }

        boolean resultado = metodoPago.realizarPago(total);
        if (resultado) {
            System.out.println("¡Gracias por su compra!");
        } else {
            System.out.println("El pago no fue procesado.");
        }
    }
}
