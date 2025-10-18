package sistemabiblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SistemaBiblioteca {

    private String nombre;
    private List<Publicacion> publicaciones;

    public SistemaBiblioteca(String nombre) {
        this.nombre = nombre;
        publicaciones = new ArrayList<Publicacion>();
    }

    private void validarPublicacion(Publicacion publicacion) {

        if (publicacion == null) {
            throw new IllegalArgumentException("Publicacion invalida");
        }
        if (publicaciones.contains(publicacion)) {
            throw new PublicacionDuplicadaException();
        }
    }

    public void agregarPublicacion(Publicacion publicacion) {
        validarPublicacion(publicacion);
        publicaciones.add(publicacion);
    }

    public void mostrarPublicacion() {

        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }

    public void leerPublicaciones() {

        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Leible) {
                System.out.println(publicacion);
            } else {
                System.out.println("Esta publicacion no puede ser leida.");
            }
        }
    }
    
    public Publicacion comprarPublicacion(String titulo){
        Publicacion publicacion = null;
        Iterator<Publicacion> iteradorPublicacion = publicaciones.iterator();
        
        while(iteradorPublicacion.hasNext() && publicacion == null){
            Publicacion siguientePublicacion = iteradorPublicacion.next();
            
            if(siguientePublicacion.tieneTitutlo(titulo)){
                publicacion = siguientePublicacion;
                iteradorPublicacion.remove();
            }
        }
        return publicacion;
    }
}
