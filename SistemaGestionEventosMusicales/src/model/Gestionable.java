
package model;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public interface Gestionable<T> {
    
    void agregar(T t);
    void eliminar(int i);
    void limpiar();
    T obtener(int i);
    List<T> filtrar(Predicate<T> filtro);
    void ordenar(Comparator<T> comparador);
    void mostrarTodos();
    void guardarEnArchivo(String path);
    void cargarDesdeArchivo(String path);
    void guardarEnCSV(String path);
    void cargarDesdeCSV(String path, Function<String, T> transf);
    
   
}
