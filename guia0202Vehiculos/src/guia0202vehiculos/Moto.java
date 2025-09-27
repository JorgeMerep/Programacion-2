package guia0202vehiculos;

public class Moto extends Vehiculo {
    private boolean esCross;
    
    public Moto(String marca, String modelo, boolean esCross) {
        super(marca, modelo);
        this.esCross = esCross;
    }
    
    public String mostrarDetalles() {
        return "marca: " + getMarca() + ", modelo: " + getModelo() + ", es Cross: " + esCross;
    }
            
}
