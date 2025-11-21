
package model;

import java.io.Serializable;
import java.lang.classfile.Superclass;
import java.time.LocalDate;


public class EventoMusical extends Evento implements CSVSerializable, Comparable<EventoMusical>{
    
    private String artista;
    private GeneroMusical genero;

    public EventoMusical(int id, String nombre, LocalDate fecha, String artista, GeneroMusical genero) {
        super(id, nombre, fecha);
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "EventoMusical{" + "artista=" + artista + ", genero=" + genero + '}';
    }

    public String getArtista() {
        return artista;
    }

    public GeneroMusical getGenero() {
        return genero;
    }

    @Override
    public int compareTo(EventoMusical eventoMusical) {
        return getFecha().compareTo(eventoMusical.getFecha());
    }

    @Override
    public String toCSV() {
        return  super.toCSV() + artista + "," + genero + "\n";
    }
    
    public static String toHeaderCSV(){
        return Evento.toHeaderCSV() + "artista,genero\n";
    }
    
    public static EventoMusical fromCSV(String eventoMusicalCSV) {
        eventoMusicalCSV = eventoMusicalCSV.substring(0, eventoMusicalCSV.length()); //Descarta el último caracter del String, que es el \n (salto de línea).
        String[] datos = eventoMusicalCSV.split(","); //Crea un array de String, donde cada posición tiene el valor de un atributo.
        return new EventoMusical(Integer.parseInt(datos[0]), datos[1], LocalDate.parse(datos[2]), datos[3], GeneroMusical.valueOf(datos[4])); //Convierte cada String en el tipo de dato del respectivo atributo (si es String, no es necesario).

    }
}
