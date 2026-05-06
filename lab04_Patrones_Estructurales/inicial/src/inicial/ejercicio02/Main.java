package inicial.ejercicio02;

public class Main {
    public static void main(String[] args) {
        String usuario = "admin";
        String clave = "1234";

        AutenticacionService authService = new AutenticacionService();
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        NotificacionService notificacionService = new NotificacionService();

        if (authService.autenticar(usuario, clave)) {
            usuarioRepository.guardarUltimoAcceso(usuario);
            notificacionService.enviarNotificacion(usuario);
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Credenciales inválidas.");
        }
    }
}