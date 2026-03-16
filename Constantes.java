// ...existing code...
/**
 * Constantes usadas en la aplicación (mensajes, valores por convenio, etc).
 */
public final class Constantes {

    public static final String SOLICITAR_PORCENTAJE = "Introduzca el porcentaje de aumento de salario: ";
    public static final String LISTA_EMPLEADOS = "Lista de Empleados:";
    public static final double SALARIO_MINIMO_CONVENIO = 12000.0;
    public static final int NUM_EMPLEADOS_EJEMPLO = 3;

    // Mensajes de error para validaciones
    public static final String ERROR_NOMBRE_INVALIDO = "Nombre inválido: debe contener al menos nombre y apellido.";
    public static final String ERROR_CARGO_INVALIDO = "Cargo inválido: no figura en la lista de cargos permitidos.";
    public static final String ERROR_SALARIO_INVALIDO = "Salario inválido: debe ser numérico y >= salario mínimo de convenio.";

    private Constantes() { }
}
// ...existing code...
