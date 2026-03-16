// ...existing code...
import java.util.Scanner; 

public class SistemaGestionEmpleados {

    private Empleado[] empleados;

    public SistemaGestionEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : empleados) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    public static void main(String[] args) {
        // Usar la nueva clase Empleados para gestionar la lista
        Empleados empleados = new Empleados();
        empleados.altaEmpleados();

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.SOLICITAR_PORCENTAJE);
        double porcentaje = scanner.nextDouble();

        empleados.aumentarSalario(porcentaje);
        
        empleados.mostrarListado();

        scanner.close();
    }
}
// ...existing code...

