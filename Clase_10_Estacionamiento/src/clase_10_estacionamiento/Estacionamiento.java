package clase_10_estacionamiento;

import java.util.ArrayList;

public class Estacionamiento {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Estacionamiento(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo nuevoVehiculo){
        checkNull(nuevoVehiculo, null);
        if (vehiculos.contains(nuevoVehiculo)){
            throw new IllegalArgumentException("Auto repetido");
        }
        vehiculos.add(nuevoVehiculo);
    }
    
    private void checkNull(Object o, String mensaje) {
        if (o == null) {
            throw new IllegalArgumentException((mensaje == null)? "Objeto nulo" : mensaje);
        }
    }
    
    public int cantidadVehiculos() {
        return vehiculos.size();
    }
    
    public boolean estaVacio() {
        return vehiculos.isEmpty();
    }
    
    public String vehiculosString() {
        StringBuilder lista = new StringBuilder();
        for (Vehiculo v : vehiculos) {
            //System.out.println(a);
            lista.append(v + "\n");
        }
        return lista.toString();
    }
    
   public ArrayList<Vehiculo> getVehiculos() {
        return new ArrayList<>(vehiculos); //se retorna una copia de la lista (NO la lista original).
    }
    
    private Vehiculo buscarVehiculo(String patente) {
        for(Vehiculo v: vehiculos) {
            if(v.tienePatente(patente)){
                return v;
            }
        }
        return null;
    }
    
    public boolean estaVehiculo(String patente){
        return buscarVehiculo(patente) != null;
    }
        
    public Vehiculo sacarVehiculo(String patente) {
        return vehiculos.remove(vehiculos.indexOf(buscarVehiculo(patente)));
    }
    
    public void vaciarEstacionamiento() {
        vehiculos.clear();
    }
    
}
