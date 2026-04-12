package corregido.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Mouse inalámbrico", 45.0, 10);
        Producto p2 = new Producto("Teclado mecánico", 150.0, 5);

        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
