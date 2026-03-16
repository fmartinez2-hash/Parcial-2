// ...existing code...
/**
 * Representa un empleado con nombre, cargo y salario.
 * Contiene validaciones en setters según criterios del enunciado.
 */
public class Empleado {

    private String nombre;
    private String cargo;
    private double salario;

    /**
     * Crea un empleado validando los parámetros.
     * @param nombre nombre completo (no vacío, más de una palabra)
     * @param cargo cargo dentro de los permitidos en Cargos
     * @param salario salario no negativo y >= convenio
     */
    public Empleado(String nombre, String cargo, double salario) {
        setNombre(nombre);
        setCargo(cargo);
        setSalario(salario);
    }

    /**
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre. Debe ser no vacío y contener al menos dos palabras.
     * @param nombre nombre completo
     * @throws IllegalArgumentException si no cumple
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty() || nombre.trim().split("\\s+").length < 2) {
            throw new IllegalArgumentException(Constantes.ERROR_NOMBRE_INVALIDO);
        }
        this.nombre = nombre.trim();
    }

    /**
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo; debe existir en Cargos.
     * @param cargo cargo
     * @throws IllegalArgumentException si cargo no válido
     */
    public void setCargo(String cargo) {
        if (cargo == null || !Cargos.esValido(cargo)) {
            throw new IllegalArgumentException(Constantes.ERROR_CARGO_INVALIDO);
        }
        this.cargo = cargo;
    }

    /**
     * @return salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece salario; debe ser >= SALARIO_MINIMO_CONVENIO y no negativo.
     * @param salario salario
     * @throws IllegalArgumentException si salario inválido
     */
    public void setSalario(double salario) {
        if (Double.isNaN(salario) || salario < 0 || salario < Constantes.SALARIO_MINIMO_CONVENIO) {
            throw new IllegalArgumentException(Constantes.ERROR_SALARIO_INVALIDO);
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %.2f", nombre, cargo, salario);
    }
}
// ...existing code...