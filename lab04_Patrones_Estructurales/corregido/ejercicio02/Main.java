package corregido.ejercicio02;

public class Main {
    public static void main(String[] args) {
        LoginFacade loginFacade = new LoginFacade();
        loginFacade.iniciarSesion("admin", "1234");
    }
}