package gimnasio;
import java.time.LocalDate;


public abstract class Entrenador {
    
    private String nroLegajo;
    private String nombre;
    private String apellido;
    private final LocalDate fechaIngreso;

    public Entrenador(String nroLegajo, String nombre, String apellido, LocalDate fechaIngreso) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    
    public abstract double calcularSueldo();
    
    public String mostrarSueldo() {
        return "|%-20s|%15.2f|\n".formatted(nombreCompleto(), calcularSueldo());
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
}
