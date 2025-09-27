package cadena;

import java.util.*;

public class Sucursal {

    private final String nombre;
    private final ArrayList<DispositivoElectronico> dispositivos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean agregarDispositivo(DispositivoElectronico dispositivo) {
        if (!checkDispositivo(dispositivo)) {
            return false;
        }
        dispositivos.add(dispositivo);
        return true;
    }

    private boolean checkDispositivo(DispositivoElectronico dispositivo) {
        if (dispositivo == null) {
            System.out.println("No se puede agregar un dispositivo nulo a la sucursal " + nombre);
            return false;
        }
        return true;
    }

    //A) Listar dispositivos
    public void listarDispositivos() {
        if (dispositivos.isEmpty()) {
            System.out.println("No hay dispositivos en la sucursal " + nombre);
        } else {
            System.out.println("Dispositivos en sucursal " + nombre + ":");
            for (DispositivoElectronico d : dispositivos) {
                System.out.println(d);
            }
        }
    }

    //B) Listar dispositivos por tipo
    public ArrayList<DispositivoElectronico> obtenerDispositivosPorTipo(TipoDispositivo tipo) {
        ArrayList<DispositivoElectronico> filtrados = new ArrayList<>();
        for (DispositivoElectronico d : dispositivos) {
            if (d.esDeTipo(tipo)) {
                filtrados.add(d);
            }
        }
        return filtrados;
    }

}
