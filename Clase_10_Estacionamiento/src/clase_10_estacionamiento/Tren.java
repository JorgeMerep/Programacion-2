package clase_10_estacionamiento;

public class Tren extends VehiculoCarga {
    private Combustible tipoCombustible;
    
    public Tren(String patente, String marca, int modelo, double maxCarga, Combustible tipoCombustible){
        super(patente, marca, modelo, maxCarga);       
        this.tipoCombustible = tipoCombustible;       
    }
    
    @Override
    public void acelerar() {
        System.out.println("Tren acelerando");
    }
    
    @Override
    public void frenar() {
        System.out.println("Tren frenando");
    }
    
    public void tocarSilbato(){
        System.out.println("Chu chuuuu");
    }
    
    @Override
    protected double calcularCarga(double carga){
        validarCarga(carga);
        return carga;
    }
    
    @Override
    public String toString() {
        return nombreClase() + super.toString() +
                ", carga= " + getCarga() +", Combustible= " + tipoCombustible + '}';
    }
    
    
    
}
