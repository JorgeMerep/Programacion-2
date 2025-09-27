package clase_06_autos;

public class Clase_06_Autos {

    public static void main(String[] args) {
        
        Auto a1 = new Auto("ABC123", "Renault", Color.BLANCO, 2024, new Motor(123456, Combustible.NAFTA, 2.0));
               
        System.out.println(a1);
        
        a1.acelerar();
        
        System.out.println(a1);
        
        
        
    }
    
}
