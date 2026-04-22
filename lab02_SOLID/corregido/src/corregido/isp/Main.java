package corregido.isp;

public class Main {
    public static void main(String[] args) {
        IRegistradorVentas cajero = new Cajero("Ana");
        IGestionInventarios almacenero = new Almacenero("Luis");
        ISupervisionOperativa supervisor = new Supervisor("Marta");

        cajero.registrarVenta("Mouse inalámbrico", 45.0);
        System.out.println();

        almacenero.actualizarInventario("Teclado mecánico", 20);
        System.out.println();

        supervisor.supervisarOperacion();
    }

}
