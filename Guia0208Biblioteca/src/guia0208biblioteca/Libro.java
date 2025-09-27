package guia0208biblioteca;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private boolean disponible;

    public Libro(String titulo, String autor, int anio, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.disponible = disponible;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void cambiarDisponibilidad(Libro libro){
        libro.disponible = !(libro.disponible);
    }
    
    @Override
    public boolean equals(Object o){
        if (o == null || !(o instanceof Libro l)) {
            return false;
        }
        return titulo.equals(l.titulo) && autor.equals(l.autor) && anio == anio;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(titulo, autor, anio);
    }
    
    @Override
    public String toString(){
        return "Libro{titulo= " + titulo + ", autor= " + autor + ", anio= " + anio + ", disponible= " + disponible + '}';
    }
}
