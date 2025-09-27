package clase_11_integrador_listas;

import java.util.ArrayList;
import java.util.Objects;

public class Sucursal {
    private final String nombre;
    private String localidad;
    private final ArrayList<DispositivoElectronico> dispositivos;
    
    /*
    private Sucursal(){ //puede existir un constructor privado.
        dispositivos = new ArrayList<>();
    }
    
    public Sucursal(String nombre){
        this(); //llama al constructor no parametrizado.
        this.nombre = nombre;
    }
    
    public Sucursal(String nombre, String localidad){
        this(nombre); //llama al constructor que recibe un parámetro.
        this.localidad = localidad;
    }*/

    public Sucursal(String nombre){ 
        this.nombre = nombre;
        dispositivos = new ArrayList<>();
    }
    
    public void agregarDispositivo(DispositivoElectronico dispositivo){
        if (dispositivo == null) {
            throw new IllegalArgumentException("Dispositivo nulo");
        }
        dispositivos.add(dispositivo);        
    }
    
    public ArrayList<DispositivoElectronico> getDispositivos(){
        return new ArrayList<>(dispositivos); //devuelve una copia de la lista de dispositivos
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean tieneNombre(String nombre){
        return this.nombre.equals(nombre);
    }
    
    public String getTablaDispositivos(){
        return DispositivoElectronico.toStringTable(dispositivos);
    }
    
    public ArrayList<DispositivoElectronico> obtenerDispositivosPorTipo(TipoDispositivo tipo) {
        ArrayList<DispositivoElectronico> filtrados = new ArrayList<>();
        for (DispositivoElectronico d : dispositivos) {
            if (d.esDeTipo(tipo)) {
                filtrados.add(d);
            }
        }
        return filtrados;
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Sucursal s)) {
            return false;
        }
        return nombre.equals(s.nombre);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    
    
    
}
