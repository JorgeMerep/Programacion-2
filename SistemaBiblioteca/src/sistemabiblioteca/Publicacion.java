package sistemabiblioteca;

import java.util.Objects;

public abstract class Publicacion {

    private String titulo;
    private int anioPublicacion;

    public Publicacion(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Publicacion p)) {
            return false;
        }
        return titulo.equals(p.titulo) && anioPublicacion == p.anioPublicacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anioPublicacion);
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + '}';
    }

    public boolean tieneTitutlo(String titulo) {
        return this.titulo.equals(titulo);

    }
}
