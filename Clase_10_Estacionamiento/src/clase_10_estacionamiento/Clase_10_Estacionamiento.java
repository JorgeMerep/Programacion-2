package clase_10_estacionamiento;

import java.util.ArrayList;

public class Clase_10_Estacionamiento {

    public static void main(String[] args) {
        
        
               
        Estacionamiento garage = new Estacionamiento("Parking VIP");
        
        System.out.println(garage.cantidadVehiculos());
        
        cargarEstacionamiento(garage);
        
        System.out.println(garage.cantidadVehiculos());

        for(Vehiculo v : garage.getVehiculos()){
            if (v instanceof VehiculoCarga vc){
                vc.cargar(9000);
            }
        }
      
       
    }
    
    public static void cargarEstacionamiento(Estacionamiento e){
        Auto a1 = new Auto("ABC123", "Honda", 2023);
        Auto a2 = new Auto("JDR567", "Ford", 2021);
        Auto a3 = new Auto("KKM321", "Renault", 2023);
        Auto a4 = new Auto("BND200", "Fiat", 2024);
        Auto a5 = new Auto("AFH329", "Peugeot", 2022);
        
        Moto m1 = new Moto("aa123", "Honda", 2019);
        Moto m2 = new Moto("ab321", "Suzuki", 2021);
        Moto m3 = new Moto("ss768", "Kawasaki", 2021);
        
        Camion c1 = new Camion("EDD111", "Scania", 2015, 10000);
        Camion c2 = new Camion("VWX852", "Iveco", 2021, 7000);
        
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a2);
        e.agregarVehiculo(a3);
        e.agregarVehiculo(a4);
        e.agregarVehiculo(a5);
        
        e.agregarVehiculo(m1);
        e.agregarVehiculo(m2);
        e.agregarVehiculo(m3);
          
        e.agregarVehiculo(new Tren("FCC", "Scania", 2003, 20000, Combustible.DIESEL));
        e.agregarVehiculo(c1);
        e.agregarVehiculo(c2);
        
    }
}

    /*
    int x = 20;
    int y = 30;
    int z;

    if ((z = x + y) <= 60){
        System.out.println("Ok");
    } else{
        System.out.println("Te pasaste");
    }

    System.out.println("z vale " + z);
    */

