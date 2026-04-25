package inicial.ejercicio01;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = new Logger();
        Logger logger2 = new Logger();

        logger1.log("Mensaje 1");
        logger2.log("Mensaje 2");

        System.out.println(logger1 == logger2);
    }
}