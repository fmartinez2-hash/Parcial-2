// ...existing code...
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que centraliza los cargos permitidos en la empresa.
 */
public final class Cargos {

    public static final String DESARROLLADOR = "Desarrollador";
    public static final String DISENADORA = "Diseñadora";
    public static final String GERENTE = "Gerente";

    private static final Set<String> LISTA;

    static {
        Set<String> s = new HashSet<>();
        s.add(DESARROLLADOR);
        s.add(DISENADORA);
        s.add(GERENTE);
        LISTA = Collections.unmodifiableSet(s);
    }

    private Cargos() { }

    /**
     * Comprueba si un cargo pertenece a la lista de cargos permitidos.
     * @param cargo texto del cargo
     * @return true si es válido
     */
    public static boolean esValido(String cargo) {
        return cargo != null && LISTA.contains(cargo);
    }

    /**
     * @return copia inmutable de los cargos permitidos
     */
    public static Set<String> obtenerLista() {
        return LISTA;
    }
}
// ...existing code...
