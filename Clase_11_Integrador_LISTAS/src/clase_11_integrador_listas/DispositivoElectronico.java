package clase_11_integrador_listas;

import java.util.ArrayList;

public class DispositivoElectronico {
    private final String id;
    private final TipoDispositivo tipo;
    private double precio;
    
    public DispositivoElectronico(String id, TipoDispositivo tipo, double precio){
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public String toTableRow(){
        return "| %-8s | %-15s| %8.2f |\n".formatted(id, tipo, precio);
    }
    
    public static String toHeaderRow(){
        return "|    id    |      tipo      |  precio  |\n";
    }
    
    public boolean esDeTipo(TipoDispositivo tipo) {
        return this.tipo == tipo;
    }
    
    public static String toStringTable(ArrayList<DispositivoElectronico> lista){
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.sepHorizontal(toHeaderRow().length()));
        sb.append(toHeaderRow());
        sb.append(Utils.sepHorizontal(toHeaderRow().length(),'*'));
        for(DispositivoElectronico d : lista){
            sb.append(d.toTableRow());
        }
        sb.append(Utils.sepHorizontal(toHeaderRow().length(),'/'));
        return sb.toString();
    }
    
    @Override
    public String toString() {
        return "DispositivoElectronico{" + "id=" + id + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    

}
