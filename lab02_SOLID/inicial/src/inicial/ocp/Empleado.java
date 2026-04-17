package inicial.ocp;

public class Empleado {
    private String tipoEmpleado;

    public Empleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public double calcularSalario() {
        if (tipoEmpleado.equals("Asalariado")) {
            return 5000;
        } else if (tipoEmpleado.equals("PorHora")) {
            return 20 * 40;
        } else {
            return 0;
        }
    }
}
