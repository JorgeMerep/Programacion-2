package sistemabaseespacial;

public class Astronauta extends UnidadOperativa implements Desplazable {
    private int maxEVA;

    public Astronauta(String nombre, String modulo, TipoAtmosfera atmosfera, int maxEVA) {
        super(nombre, modulo, atmosfera);
        this.maxEVA = maxEVA;
    }

    @Override
    public String toString() {
        return "Astronauta{" + super.toString() + ", maxEVA=" + maxEVA + '}';
    }
    
    @Override
    protected String replicarse(){
       return getNombre() + " replicandose mediante entrenamiento...\n";
    }
    
    @Override
    public String desplazar(){
        return "Astronauta " + getNombre() + " desplazandose a modulo destino.";
    }
    
}
