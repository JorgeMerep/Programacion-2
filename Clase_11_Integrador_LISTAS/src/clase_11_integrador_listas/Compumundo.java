package clase_11_integrador_listas;

import java.util.ArrayList;

public class Compumundo {

    public static void main(String[] args) {

        CadenaTecnologia compumundo = new CadenaTecnologia();
        hardcodearCadena(compumundo);
        //compumundo.listarDispoSucTabla("Sucursal B");

        /*ArrayList<DispositivoElectronico> telefonos = compumundo.dispositivosPorTipo(TipoDispositivo.TELEFONO);
        System.out.println("Listado de TELEFONOS en todas las sucursales de la cadena:");
        for (DispositivoElectronico dispositivo : telefonos) {
            System.out.println(dispositivo);
        }*/
        
        System.out.println(DispositivoElectronico.toStringTable(compumundo.dispositivosPorTipo(TipoDispositivo.COMPUTADORA)));
    }

    public static void hardcodearCadena(CadenaTecnologia cadena) {

        Sucursal suc1 = new Sucursal("Sucursal A");
        Sucursal suc2 = new Sucursal("Sucursal B");

        cadena.agregarSucursal(suc1);
        cadena.agregarSucursal(suc2);

        cadena.agregarDispositivo("Sucursal A", new DispositivoElectronico("123", TipoDispositivo.COMPUTADORA, 1500));
        cadena.agregarDispositivo("Sucursal A", new DispositivoElectronico("435", TipoDispositivo.TABLET, 500));
        cadena.agregarDispositivo("Sucursal A", new DispositivoElectronico("293", TipoDispositivo.TELEFONO, 1200));
        cadena.agregarDispositivo("Sucursal A", new DispositivoElectronico("218", TipoDispositivo.COMPUTADORA, 2500));

        cadena.agregarDispositivo("Sucursal B", new DispositivoElectronico("382", TipoDispositivo.COMPUTADORA, 1500));
        cadena.agregarDispositivo("Sucursal B", new DispositivoElectronico("382", TipoDispositivo.COMPUTADORA, 1500));
        cadena.agregarDispositivo("Sucursal B", new DispositivoElectronico("218", TipoDispositivo.TABLET, 600));
        cadena.agregarDispositivo("Sucursal B", new DispositivoElectronico("271", TipoDispositivo.TELEFONO, 1100));
        cadena.agregarDispositivo("Sucursal B", new DispositivoElectronico("631", TipoDispositivo.TELEFONO, 1800));
        
        cadena.borrarDispositivo("218");

    }

}
