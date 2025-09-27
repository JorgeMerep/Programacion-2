package clase_10_estacionamiento;

import java.util.Objects;

public abstract class Vehiculo {
    
    private String patente;
    private String marca;
    private int modelo;

    public Vehiculo(String patente, String marca, int modelo) {
        //super(); -->llamada al constructor de la clase padre; en este caso es Object, no es necesario especificarlo.
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getPatente() {
        return patente;
    }
    
    protected String getMarca(){
        return marca;
    }
    
    public abstract void acelerar();
    public abstract void frenar();
    
      
    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof Vehiculo v)){
            return false;
        }
        return patente.equals(v.patente) && marca.equals(v.marca) && modelo == v.modelo;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(patente, marca, modelo);
    }
    
    public boolean tienePatente(String patente) {
        return getPatente().equals(patente);
    }

    @Override
    public String toString() {
        return " = {patente=" + patente + ", marca=" + marca + ", modelo=" + modelo;
    }
    
    protected String nombreClase(){
        return getClass().getName().split("\\.")[1];
    }
    
    
    
}
