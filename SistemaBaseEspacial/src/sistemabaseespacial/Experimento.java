package sistemabaseespacial;

public class Experimento extends UnidadOperativa {
    private int duracionIdeal;

    public Experimento(String nombre, String modulo, TipoAtmosfera atmosfera, int duracionIdeal) {
        super(nombre, modulo, atmosfera);
        this.duracionIdeal = duracionIdeal;
    }

    @Override
    public String toString() {
        return "Experimento{" + super.toString() + ", duracionIdeal=" + duracionIdeal + '}';
    }
    
    @Override
    protected String replicarse(){
       return getNombre() + " replicandose mediante clonacion de protocolo...\n";
    }
    
    
}
