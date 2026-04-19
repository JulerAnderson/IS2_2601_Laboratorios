package corregido.ocp;

public class EmpleadoAsalariado extends Empleado{

    public EmpleadoAsalariado(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularSalario() {
        return 5000;
    }
}
