package corregido.ejercicio02;

public class AutenticacionService {

    public boolean autenticar(String usuario, String clave) {
        return usuario.equals("admin") && clave.equals("1234");
    }
}