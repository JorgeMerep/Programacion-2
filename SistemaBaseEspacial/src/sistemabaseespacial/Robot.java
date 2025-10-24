package sistemabaseespacial;

public class Robot extends UnidadOperativa implements Desplazable {
    private int autonomia;

    public Robot(String nombre, String modulo, TipoAtmosfera atmosfera, int autonomia) {
        super(nombre, modulo, atmosfera);
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Robot{" + super.toString() + ", autonomia=" + autonomia + '}';
    }
    
    @Override
    protected String replicarse(){
       return getNombre() + " replicandose mediante copia...\n";
    }
    
    @Override
    public String desplazar(){
        return "Robot " + getNombre() + " desplazandose a modulo destino.";
    }
    
    
    
}
