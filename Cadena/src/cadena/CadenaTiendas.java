package cadena;

import java.util.ArrayList;

public class CadenaTiendas {

    private final ArrayList<Sucursal> sucursales;

    public CadenaTiendas() {
        sucursales = new ArrayList<>();
    }

    //A) Agregar sucursal 
    public boolean agregarSucursal(Sucursal sucursal) {
        boolean existe = existeSucursalConNombre(sucursal.getNombre());
        if (existe) {
            System.out.println("La sucursal '" + sucursal.getNombre() + "' ya existe en la cadena.");
        } else {
            sucursales.add(sucursal);
        }
        return !existe; // true si se agregó, false si ya existía
    }

    //A) Validar existencia de sucursal
    private boolean existeSucursalConNombre(String nombre) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    //B) Buscar sucursal 
    public Sucursal buscarSucursal(String nombre) {
        Sucursal encontrada = obtenerSucursalPorNombre(nombre);
        return encontrada;
    }

    //B) Obtiene sucursal por nombre
    private Sucursal obtenerSucursalPorNombre(String nombre) {
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getNombre().equals(nombre)) {
                return sucursal;
            }
        }
        return null;
    }

    //A) Listar dispositivos
    public void listarDispositivos() {
        if (sucursales.isEmpty()) {
            System.out.println("No hay sucursales registradas en la cadena.");
            return;
        }

        for (Sucursal sucursal : sucursales) {
            sucursal.listarDispositivos();
            System.out.println("-----------------------------");
        }
    }

    //B) Listar dispositivos por tipo
    public ArrayList<DispositivoElectronico> dispositivosPorTipo(TipoDispositivo tipo) {
        ArrayList<DispositivoElectronico> resultado = new ArrayList<>();

        for (Sucursal sucursal : sucursales) {
            resultado.addAll(sucursal.obtenerDispositivosPorTipo(tipo));
        }

        return resultado;
    }

}
