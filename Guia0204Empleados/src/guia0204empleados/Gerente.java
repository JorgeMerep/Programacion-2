package guia0204empleados;

public class Gerente extends Empleado {
    private int supervisados;
    
    public Gerente(String nombre, double salario, int supervisados){
        super(nombre, salario);
        this.supervisados = supervisados;
    }
    
}
