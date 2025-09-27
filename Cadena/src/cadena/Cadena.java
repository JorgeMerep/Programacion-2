
package cadena;

import java.util.ArrayList;


public class Cadena {

   
    public static void main(String[] args) {
        CadenaTiendas cadena = new CadenaTiendas();

        Sucursal sucursal1 = new Sucursal("Sucursal CABA");
        Sucursal sucursal2 = new Sucursal("Sucursal Provincia");

        cadena.agregarSucursal(sucursal1);
        cadena.agregarSucursal(sucursal2);

        sucursal1.agregarDispositivo(new DispositivoElectronico("A101", 50000, TipoDispositivo.TELEFONOS));
        sucursal1.agregarDispositivo(new DispositivoElectronico("B202", 120000, TipoDispositivo.COMPUTADORAS));
        sucursal2.agregarDispositivo(new DispositivoElectronico("C303", 70000, TipoDispositivo.TELEFONOS));
        sucursal2.agregarDispositivo(new DispositivoElectronico("D404", 30000, TipoDispositivo.TELEFONOS));
        sucursal2.agregarDispositivo(new DispositivoElectronico("E505", 150000, TipoDispositivo.TELEFONOS));
        sucursal1.agregarDispositivo(new DispositivoElectronico("F606", 10000, TipoDispositivo.TABLETS));

        ArrayList<DispositivoElectronico> telefonos = cadena.dispositivosPorTipo(TipoDispositivo.TELEFONOS);

        System.out.println("Listado de TELEFONOS en todas las sucursales de la cadena:");
        for (DispositivoElectronico dispositivo : telefonos) {
            System.out.println(dispositivo);
        }
    }
    
}
