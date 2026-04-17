package inicial.srp;

public class Informe {
    private String contenido;

    public Informe(String contenido) {
        this.contenido = contenido;
    }

    public void generarInforme(){
        System.out.println("Informe generado: " + contenido);
    }

    public void enviarPorCorreo(){
        System.out.println("Enviando informe por correo: " + contenido);
    }
}
