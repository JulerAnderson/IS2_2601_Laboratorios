package corregido.ocp;

public class Main {
    public static void main(String[] args) {
        
        Empleado empleadoAsalariado = new EmpleadoAsalariado("Pablo Rojas");
        Empleado empleadoPorHora = new EmpleadoPorHora("Ricardo Perez", 160, 20);

        System.out.println("Salario del empleado asalariado " + empleadoAsalariado.getNombre() + ": $" + empleadoAsalariado.calcularSalario());
        System.out.println("Salario del empleado por hora " + empleadoPorHora.getNombre() + ": $" + empleadoPorHora.calcularSalario());
    }
}