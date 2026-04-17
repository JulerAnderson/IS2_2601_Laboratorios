package inicial.isp;

public class Main {
    public static void main(String[] args) {
        IEmpleadoTienda cajero = new Cajero("Ana");
        IEmpleadoTienda almacenero = new Almacenero("Luis");
        IEmpleadoTienda supervisor = new Supervisor("Marta");

        cajero.registrarVenta("Mouse inalámbrico", 45.0);
        cajero.actualizarInventario("Mouse inalámbrico", 10);

        System.out.println();

        almacenero.actualizarInventario("Teclado mecánico", 20);
        almacenero.supervisarOperacion();

        System.out.println();

        supervisor.supervisarOperacion();
        supervisor.registrarVenta("Laptop", 3200.0);
    }
}
