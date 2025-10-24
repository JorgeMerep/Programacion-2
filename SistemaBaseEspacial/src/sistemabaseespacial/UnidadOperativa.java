package sistemabaseespacial;

import java.util.Objects;

public abstract class UnidadOperativa {
    private String nombre;
    private String modulo;
    private TipoAtmosfera atmosfera;

    public UnidadOperativa(String nombre, String modulo, TipoAtmosfera atmosfera) {
        this.nombre = nombre;
        this.modulo = modulo;
        this.atmosfera = atmosfera;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean tieneAtmosfera(TipoAtmosfera tipo){
        return atmosfera == tipo;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || !(o instanceof UnidadOperativa u)){
            return false;
        }
        return nombre.equals(u.nombre) && modulo.equals(u.modulo);        
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre, modulo);
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", modulo=" + modulo + ", atmosfera=" + atmosfera;
    }
    
    public String ejecutarTareasBasicas(){
        StringBuilder sb = new StringBuilder();
        sb.append(reabastecerse());
        sb.append(mantenerCondicionesAtmosfericas());
        sb.append(replicarse());
        return sb.toString();        
    }
    
    private String reabastecerse(){
        return nombre + " reabasteciendose...\n";
    }
    
    private String mantenerCondicionesAtmosfericas(){
        return nombre + " manteniendo condiciones atmosfericas adecuadas...\n";
    }
    
    protected abstract String replicarse();
    
}
