package guia0202vehiculos;

public class Coche extends Vehiculo {
    private boolean automatico;
    
    public Coche(String marca, String modelo, boolean automatico) {
        super(marca, modelo);
        this.automatico = automatico;
    }
    
    public String mostrarDetalles() {
        return "marca: " + getMarca() + ", modelo: " + getModelo() + ", automatico: " + automatico;
    }
    

    
}
