package clase_11_integrador_listas;

import java.util.ArrayList;

public class CadenaTecnologia {

    private final ArrayList<Sucursal> sucursales;
    //opción: private final ArrayList<Sucursal> sucursales = new ArrayList<>();

    public CadenaTecnologia() {
        sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        validarSucursal(sucursal);
        sucursales.add(sucursal);
    }

    public ArrayList<DispositivoElectronico> getDispositivos() {
        ArrayList<DispositivoElectronico> toReturn = new ArrayList<>();
        for (Sucursal suc : sucursales) {
            toReturn.addAll(suc.getDispositivos());
        }
        return toReturn;
    }

    private void validarSucursal(Sucursal sucursal) {
        if (sucursal == null || sucursales.contains(sucursal)) {
            throw new IllegalArgumentException("Sucursal repetida");
        }
    }

    public boolean agregarDispositivo(String nombreSucursal, DispositivoElectronico dispositivo) {
        Sucursal suc = null;
        if((suc = buscarSucursal(nombreSucursal)) != null){
            suc.agregarDispositivo(dispositivo);
            return true;
        }
        return false;        
    }

    private Sucursal buscarSucursal(String nombreSucursal) {
        Sucursal toReturn = null;
        int i = 0;
        while (i < sucursales.size() && toReturn == null) {
            Sucursal actual = sucursales.get(i++);
            if (actual.tieneNombre(nombreSucursal)) {
                toReturn = actual;  
            }
        }
        return toReturn;
    }
   
    public void listarDispoSucTabla(String nombreSucursal){
        Sucursal suc = null;
        if((suc = buscarSucursal(nombreSucursal)) != null){
            System.out.println(suc.getTablaDispositivos());
        }
    }
    
    public ArrayList<DispositivoElectronico> dispositivosPorTipo(TipoDispositivo tipo) {
        ArrayList<DispositivoElectronico> resultado = new ArrayList<>();
        for (Sucursal sucursal : sucursales) {
            resultado.addAll(sucursal.obtenerDispositivosPorTipo(tipo));
        }
        return resultado;
    }
        
    }
