
package guia_01_04_coche;

public class Coche {
    
    private String marca;
    private String modelo;
    private double kilometraje;
    private double combustibleRestante;
    private static final int RENDIMIENTO_KM_LITRO = 14;
    private static final int COMBUSTIBLE_MAX = 50;
    
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = 0;
        this.combustibleRestante = COMBUSTIBLE_MAX;   
    }
    
    public void setCombustible(double litrosRestantes) {
        combustibleRestante = litrosRestantes;
    }
    
    public double getCombustible() {
        return combustibleRestante;
    }
    
    public double calcularAutonomia() {
        return combustibleRestante * RENDIMIENTO_KM_LITRO;
    }
    
    public void recargarCombustible() {
        combustibleRestante = COMBUSTIBLE_MAX;
    }
    
}
