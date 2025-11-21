package almacengenerico;
import java.util.Objects;

public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private Tipo tipo;

    public Producto(int id, String nombre, double precio, Tipo tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Producto p)) {
            return false;
        }
        return this.id == p.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
}
