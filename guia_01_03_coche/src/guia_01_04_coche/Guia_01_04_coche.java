
package guia_01_04_coche;


public class Guia_01_04_coche {


    public static void main(String[] args) {
     
        Coche c1 = new Coche("Volkswagen", "Polo");
        
        System.out.println("Combustible restante: " + c1.getCombustible());
        
        c1.setCombustible(25);
        
        System.out.println("Combustible restante: " + c1.getCombustible());
        System.out.println("Autonomia: " + c1.calcularAutonomia());
        
        c1.recargarCombustible();
        
        System.out.println("Combustible restante: " + c1.getCombustible());
        
        
    }
    
}
