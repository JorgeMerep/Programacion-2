
package model;

import java.time.LocalDate;


public abstract class Evento implements CSVSerializable{
    
    private int id;
    private String nombre;
    private LocalDate fecha;

    public Evento(int id, String nombre, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toCSV() {
        return id + "," + nombre + "," + fecha + ",";
    }
   
    public static String toHeaderCSV(){
        return "id,nombre,fecha,";
    }
    
}
