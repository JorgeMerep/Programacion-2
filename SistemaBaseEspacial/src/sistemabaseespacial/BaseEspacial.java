package sistemabaseespacial;

import java.util.ArrayList;
import java.util.List;

public class BaseEspacial {
    private String nombre;
    private List<UnidadOperativa> unidades;
    
    public BaseEspacial(String nombre){
        this.nombre = nombre;
        unidades = new ArrayList<>();
    }
    
    public void agregarUnidadOperativa(UnidadOperativa e){
        validarUnidadOperativa(e);
        unidades.add(e);
    }
    
    private void validarUnidadOperativa(UnidadOperativa e){
        if (e == null){
            throw new IllegalArgumentException("Unidad nula");
        }
        if (unidades.contains(e)){
            throw new UnidadRepetidaException("No puede agregar una unidad repetida!");
        }
    }
    
    public String mostrarUnidades(){
        StringBuilder sb = new StringBuilder();
        for (UnidadOperativa u : unidades){
            sb.append(u);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String moverUnidades(){
        StringBuilder sb = new StringBuilder();
        for (UnidadOperativa u : unidades){
            if (u instanceof Desplazable d){
                sb.append(d.desplazar());
            }
            else {
                sb.append(u.getClass().getSimpleName());
                sb.append(" permanece fijo.");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public String realizarFuncionesBase(){
        StringBuilder sb = new StringBuilder();
        for (UnidadOperativa u : unidades){
            sb.append(u.ejecutarTareasBasicas());
        }
        return sb.toString();
    }
    
    public String filtrarPorTipoAtmosfera(TipoAtmosfera tipo){
        StringBuilder sb = new StringBuilder();
        for (UnidadOperativa u : unidades){
            if (u.tieneAtmosfera(tipo)){
                sb.append(u);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    
    
}
