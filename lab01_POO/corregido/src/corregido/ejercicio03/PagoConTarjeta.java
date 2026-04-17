package corregido.ejercicio03;
import java.util.Scanner;

public class PagoConTarjeta extends MetodoPago {

    public PagoConTarjeta(double monto) {
        super(monto);
    }

    @Override
    public boolean realizarPago(double monto) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de tarjeta (16 dígitos): ");
        String tarjeta = sc.nextLine();
        if (tarjeta.length() == 16 && tarjeta.matches("\\d{16}")) {
            System.out.println("Pago con tarjeta exitoso.");
            return true;
        } else {
            System.out.println("Número de tarjeta inválido.");
            return false;
        }
    }
}
