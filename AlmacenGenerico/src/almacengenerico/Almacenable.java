package almacengenerico;


public interface Almacenable<T> extends Iterable<T> {
    
    void agregar(T item);
    
    boolean eliminar(T item);
    
    boolean contiene(T item);
    
    T obtener(int indice);

    int tamanio();
    
    void limpiar();

    default boolean estaVacio(){
        return tamanio() == 0;
    };

}
