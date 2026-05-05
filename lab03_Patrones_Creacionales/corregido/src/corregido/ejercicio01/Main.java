package corregido.ejercicio01;

public class Main {
    public static void main(String[] args) {
        // Solo se puede obtener una instancia de Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Compra registrada");
        logger2.log("Pago exitoso");

        // Las instancias son las mismas
        System.out.println(logger1 == logger2);  // true
    }
}