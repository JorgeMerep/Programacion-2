package guia0208biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre = nombre;
        libros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro){
        chequearNull(libro);
        libros.add(libro);
    }
    
    private void chequearNull(Object o){
        if (o == null){
            throw new IllegalArgumentException("Objeto nulo");
        }
    }
    
    public String listarLibros(){
        StringBuilder lista = new StringBuilder();
        for (Libro l : libros){
            lista.append(l + "\n");
        }
        return lista.toString();
    }
    
    private Libro buscarLibro(String titulo){
        for (Libro l : libros){
            if (titulo.toUpperCase().equals(l.getTitulo().toUpperCase())){
                return l;
            }
        }
        return null;       
    }
    
    private boolean estaLibro(String titulo){
        return buscarLibro(titulo) != null;
    }
    
    public Libro retirarLibro(String titulo){
        if (estaLibro(titulo)){
            Libro l = buscarLibro(titulo);
            l.cambiarDisponibilidad(l);
            return libros.remove(libros.indexOf(l));
        }
        return null;
    }

    
}
