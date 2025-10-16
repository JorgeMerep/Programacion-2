package gimnasio;
import java.time.LocalDate;


public class PersonalTrainer extends Entrenador {
    
    private static double MONTO_POR_CLIENTE = 35000;
    private double sueldoMinimo;
    private int cantClientes;

    public PersonalTrainer(String nroLegajo, String nombre, String apellido, LocalDate fechaIngreso, double sueldoMinimo, int cantClientes) {
        super(nroLegajo, nombre, apellido, fechaIngreso);
        this.sueldoMinimo = sueldoMinimo;
        this.cantClientes = cantClientes;
    }

    public int getCantClientes() {
        return cantClientes;
    }
    
    @Override
    public double calcularSueldo() {
        double sueldo = cantClientes * MONTO_POR_CLIENTE;

        return (sueldo > sueldoMinimo) ? sueldo : sueldoMinimo;
    }
    
}
