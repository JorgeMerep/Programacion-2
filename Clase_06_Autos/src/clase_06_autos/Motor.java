
package clase_06_autos;


public class Motor {
    
    private int nroSerie;
    private Combustible combustible;
    private double cilindrada;
    private int rpm;

    public Motor(int nroSerie, Combustible combustible, double cilindrada) {
        this.nroSerie = nroSerie;
        this.combustible = combustible;
        this.cilindrada = cilindrada;
    }
    
    public int getRpm(){
        return rpm;
    }
    
    public void acelerar() {
        rpm += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" + "nroSerie=" + nroSerie + ", tipoCombustible=" + combustible + ", cilindrada=" + cilindrada + ", rpm=" + rpm + '}';
    }

    
    
    
}
