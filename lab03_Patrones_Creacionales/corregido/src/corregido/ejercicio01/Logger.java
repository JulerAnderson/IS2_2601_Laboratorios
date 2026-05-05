package corregido.ejercicio01;

public class Logger {
    // Instancia única de Logger
    private static Logger instanciaUnica;

    // Constructor privado para evitar la creación externa de instancias
    private Logger() {}

    // Método para obtener la única instancia de Logger
    public static Logger getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Logger();
        }
        return instanciaUnica;
    }

    public void log(String mensaje) {
        System.out.println("Log: " + mensaje);
    }
}