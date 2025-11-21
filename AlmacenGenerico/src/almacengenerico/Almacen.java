package almacengenerico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Almacen<T> implements Almacenable<T> {
    
    private List<T> items = new ArrayList<>();

    @Override
    public void agregar(T item) {
        validarItem(item);
        items.add(item);
    }
    
    private void validarItem(T item) {
        if(item == null) {
            throw new NullPointerException("Item nulo");
        }
    }

    @Override
    public boolean eliminar(T item) {
        return items.remove(item);
    }

    @Override
    public boolean contiene(T item) {
        return items.contains(item);
    }

    @Override
    public T obtener(int indice) {
        if(indice < 0 || indice >= items.size()) {
            throw new IndexOutOfBoundsException("Indice fuera de rango");
        }
        return items.get(indice);
    }

    @Override
    public int tamanio() {
        return items.size();
    }
    
    @Override
    public void limpiar() {
        items.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayList(items).iterator();
    }
}
