package corregido.srp;

public class Informe {
    private String contenido;

    public Informe(String contenido) {
        this.contenido = contenido;
    }

    public String generarInforme(){
        return "Informe generado: " + contenido;
    }
}
