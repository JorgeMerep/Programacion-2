package clase_10_estacionamiento;

public class Camion extends VehiculoCarga {
    
    public Camion(String patente, String marca, int modelo, double maxCarga){
        super(patente, marca, modelo, maxCarga);       
    }
    
    @Override
    protected double calcularCarga(double carga){
        double cargaFinal = getCarga() + carga;
        validarCarga(cargaFinal);
        return cargaFinal;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Camion acelerando");
    }
    
    @Override
    public void frenar() {
        System.out.println("Camion frenando");
    }
    
    @Override
    public String toString() {
        return nombreClase() + super.toString() + ", carga= " + getCarga() + '}';
    }
    
    
}
