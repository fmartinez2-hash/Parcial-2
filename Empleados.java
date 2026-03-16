// ...existing code...

/**
 * Clase responsable de gestionar la colección de empleados.
 * Contiene el array 'lista' con los empleados y métodos para alta, listado y aumento.
 */
public class Empleados {

    /**
     * Lista de empleados gestionada por esta clase.
     */
    private Empleado[] lista;

    /**
     * Crea la estructura interna con tamaño por defecto.
     */
    public Empleados() {
        this.lista = new Empleado[Constantes.NUM_EMPLEADOS_EJEMPLO];
    }

    /**
     * Añade los empleados de ejemplo al arreglo interno.
     * Usa nombres con al menos dos palabras para cumplir validación.
     */
    public void altaEmpleados() {
        lista[0] = new Empleado("Juan Perez", Cargos.DESARROLLADOR, 50000);
        lista[1] = new Empleado("María García", Cargos.DISENADORA, 45000);
        lista[2] = new Empleado("Pedro Martínez", Cargos.GERENTE, 60000);
    }

    /**
     * Aumenta el salario de todos los empleados en el porcentaje dado.
     * @param porcentaje porcentaje de aumento (por ejemplo 10 para 10%)
     */
    public void aumentarSalario(double porcentaje) {
        for (int i = 0; i < lista.length; i++) {
            Empleado e = lista[i];
            if (e != null) {
                double nuevo = e.getSalario() * (1 + porcentaje / 100.0);
                e.setSalario(nuevo);
            }
        }
    }

    /**
     * Muestra por consola el listado de empleados.
     */
    public void mostrarListado() {
        System.out.println(Constantes.LISTA_EMPLEADOS);
        for (Empleado e : lista) {
            if (e != null) {
                System.out.println(e);
            }
        }
    }

    /**
     * Proporciona acceso (solo lectura) a la lista interna.
     * @return array de empleados (puede contener nulls)
     */
    public Empleado[] getLista() {
        return lista.clone();
    }

    /**
     * Permite asignar manualmente la lista completa.
     * @param nueva lista de empleados
     */
    public void setLista(Empleado[] nueva) {
        this.lista = nueva;
    }
}
// ...existing code...
