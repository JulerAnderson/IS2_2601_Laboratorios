package corregido.srp;

public class Main {
    public static void main(String[] args) {
        Informe informe = new Informe("Rendimiento trimestral");
        String informeGenerado = informe.generarInforme();

        ServicioCorreo servicioCorreo = new ServicioCorreo("cliente@empresa.com");
        servicioCorreo.enviarCorreo(informeGenerado);
    }
}
