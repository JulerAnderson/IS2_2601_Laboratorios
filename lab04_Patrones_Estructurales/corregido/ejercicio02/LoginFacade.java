package corregido.ejercicio02;

public class LoginFacade {
    private AutenticacionService authService;
    private UsuarioRepository usuarioRepository;
    private NotificacionService notificacionService;

    public LoginFacade() {
        this.authService = new AutenticacionService();
        this.usuarioRepository = new UsuarioRepository();
        this.notificacionService = new NotificacionService();
    }

    public void iniciarSesion(String usuario, String clave) {
        if (authService.autenticar(usuario, clave)) {
            usuarioRepository.guardarUltimoAcceso(usuario);
            notificacionService.enviarNotificacion(usuario);
            System.out.println("Login exitoso.");
        } else {
            System.out.println("Credenciales inválidas.");
        }
    }
}