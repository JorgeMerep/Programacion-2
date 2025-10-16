package gimnasio;
import java.time.LocalDate;
import java.time.Period;


public class EntrenadorEquipo extends Entrenador {
    
    private static final int ANIOS_PRIMER_AUMENTO = 3;
    private static final int ANIOS_SEGUNDO_AUMENTO = 6;
    private static final double PORC_PRIMER_AUMENTO = 0.04;
    private static final double PORC_SEGUNDO_AUMENTO = 0.12;
    private double sueldoFijo;
    
    public EntrenadorEquipo(String nroLegajo, String nombre, String apellido, LocalDate fechaIngreso, double sueldoFijo) {
        super(nroLegajo, nombre, apellido, fechaIngreso);
        this.sueldoFijo = sueldoFijo;
    }
    
    @Override
    public double calcularSueldo() {
        return getSueldoAumentado(calcularPorcentajeAumento());
    }
    
    private double calcularPorcentajeAumento() {
        int antiguedad = calcularAntiguedad();
        double porcentaje = 0;
        
        if(antiguedad >= ANIOS_SEGUNDO_AUMENTO) {
            porcentaje = PORC_SEGUNDO_AUMENTO;
        } else if (antiguedad >= ANIOS_PRIMER_AUMENTO) {
            porcentaje = PORC_PRIMER_AUMENTO;
        }
        return porcentaje;
    }
    
    private int calcularAntiguedad() {
        return Period.between(getFechaIngreso(), LocalDate.now()).getYears();
    }
    
    private double getSueldoAumentado(double porcentaje) {
        return sueldoFijo * (1 + porcentaje);
    }
}
