package inicial.ocp;

public class Main {
    public static void main(String[] args) {
        Empleado empleadoAsalariado = new Empleado("Asalariado");
        Empleado empleadoPorHora = new Empleado("PorHora");

        System.out.println("Salario del empleado asalariado: " + empleadoAsalariado.calcularSalario());
        System.out.println("Salario del empleado por hora: " + empleadoPorHora.calcularSalario());
    }
}
