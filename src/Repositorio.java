import java.util.ArrayList;
import java.util.List;

public class Repositorio<T> {
    private final List<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void quitar(T elemento) {
        elementos.remove(elemento);
    }

    public List<T> obtenerTodos() {
        return elementos;
    }
}
