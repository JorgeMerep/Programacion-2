package clase_07_estacionamiento;

import java.util.ArrayList;

public class Clase_07_Estacionamiento {

    public static void main(String[] args) {
        
        // vaciar el estacionamiento
         
        Estacionamiento garage = new Estacionamiento("Parking VIP");
        
        Auto a1 = new Auto("ABC123", "Honda", 2023);
        Auto a2 = new Auto("JDR567", "Ford", 2021);
        Auto a3 = new Auto("KKM321", "Renault", 2023);
        Auto a4 = new Auto("BND200", "Fiat", 2024);
        Auto a5 = new Auto("AFH329", "Peugeot", 2022);
                
        garage.agregarAuto(a1);
        garage.agregarAuto(a2);
        garage.agregarAuto(a3);
        garage.agregarAuto(a4);
        garage.agregarAuto(a5);
        
        System.out.println(garage.autosString());
        
        
        
        
        /*
        ArrayList<Integer> lista = new ArrayList<>(); //Por "inferencia de tipos", en el constructor no se vuelve a especificar Integer.
        
        lista.add(20);
        lista.add(23);
        lista.add(21);
        lista.add(28);
        
        //for each
        for(int valor : lista) {
            System.out.println(valor);
        }
        */
        
        
    }
    
}
