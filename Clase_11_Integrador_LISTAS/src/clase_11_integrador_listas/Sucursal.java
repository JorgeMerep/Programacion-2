package clase_11_integrador_listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Sucursal {

    private final String nombre;
    private String localidad;
    private final ArrayList<DispositivoElectronico> dispositivos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(DispositivoElectronico dispositivo) {
        if (dispositivo == null) {
            throw new IllegalArgumentException("Dispositivo nulo");
        }
        dispositivos.add(dispositivo);
    }

    public ArrayList<DispositivoElectronico> getDispositivos() {
        return new ArrayList<>(dispositivos); //devuelve una copia de la lista de dispositivos
    }

    public String getNombre() {
        return nombre;
    }

    public boolean tieneNombre(String nombre) {
        return this.nombre.equals(nombre);
    }

    public String getTablaDispositivos() {
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
    public boolean equals(Object o) {
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

    public DispositivoElectronico borrarDispositivo(String idDispositivo) {
        DispositivoElectronico d = null;
        Iterator<DispositivoElectronico> iterDispositivos = dispositivos.iterator();
        
        while(iterDispositivos.hasNext() && d == null) {
            DispositivoElectronico sigDispositivo = iterDispositivos.next();

            if (sigDispositivo.getId().equals(idDispositivo)) {
                d = sigDispositivo;
                iterDispositivos.remove();
            }
        }
        return d;
    }

    public double[] porcDispositivosPorTipo() {
        TipoDispositivo[] tipos = TipoDispositivo.values();
        int contadores[] = new int[tipos.length];
        double porcentajes[] = new double[tipos.length];

        for (DispositivoElectronico disp : dispositivos) {  
            contadores[disp.getTipo().ordinal()]++;
        }
        
        for (int i = 0; i < contadores.length; i++){
            porcentajes[i] = calcularPorcentaje(contadores[i]);
        }
        return porcentajes;
    }

    private double calcularPorcentaje(int cantidad) {
        return cantidad * 100 / dispositivos.size();
    }
}
