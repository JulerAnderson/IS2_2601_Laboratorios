package corregido.lsp;

public abstract class Repartidor {
    private String nombre;

    public Repartidor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void entregarPedido();

    public abstract void recogerPedido();
}
