package corregido.ejercicio02;

public class Main {
    public static void main(String[] args) {
        ProductoFisico libro = new ProductoFisico("Libro Java", 50.0, 5, 0.5);
        ProductoDigital curso = new ProductoDigital("Curso en línea", 80.0, 3, "https://cursos.com/java");

        Carrito carrito = new Carrito();
        carrito.agregarProducto(libro);
        carrito.agregarProducto(curso);
        carrito.agregarProducto(curso);

        carrito.mostrarResumen();
    }
}
