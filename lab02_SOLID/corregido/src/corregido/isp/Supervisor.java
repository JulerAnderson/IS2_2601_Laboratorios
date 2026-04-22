package corregido.isp;

public class Supervisor implements ISupervisionOperativa {
    private String nombre;

    public Supervisor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void supervisarOperacion() {
        System.out.println(nombre + " está supervisando la operación de la tienda.");
    }
}
