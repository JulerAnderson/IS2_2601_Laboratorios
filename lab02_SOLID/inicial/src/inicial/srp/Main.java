package inicial.srp;

public class Main {
    public static void main(String[] args) {
        Informe informe = new Informe("Rendimiento trimestral");
        informe.generarInforme();
        informe.enviarPorCorreo();
    }
}
