package corregido.srp;

public class ServicioCorreo {
    private String direccionCorreo;

    public ServicioCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public void enviarCorreo(String informe) {
        System.out.println("Enviando correo a " + direccionCorreo + ": " + informe);
    }
}
