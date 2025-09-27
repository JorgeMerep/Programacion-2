package clase_10_estacionamiento;

public abstract class VehiculoCarga extends Vehiculo {
    private double carga;
    private final double maxCarga;
    
    public VehiculoCarga(String patente, String marca, int modelo, double maxCarga){
        super(patente, marca, modelo);
        this.maxCarga = maxCarga;        
    }
    
    private void validarCargaNegativa(double carga){
        if (carga < 0) {
            throw new IllegalArgumentException("Carga negativa");
        }
    }
    
    protected void validarCarga(double carga){
        if(carga > maxCarga){
            throw new IllegalArgumentException("Carga excedida");
        }
    }
    
    public void cargar(double carga){
        validarCargaNegativa(carga);
        this.carga = calcularCarga(carga);
        System.out.println(nombreClase() + " cargado");
    }
    
    protected abstract double calcularCarga(double carga);
    
    public double getCarga(){
        return carga;
    }
    
    public double getMaxCarga(){
        return maxCarga;
    }
   
}
