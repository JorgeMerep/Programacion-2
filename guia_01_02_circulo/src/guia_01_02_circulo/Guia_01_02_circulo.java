
package guia_01_02_circulo;

public class Guia_01_02_circulo {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo(10);
        
        System.out.println("Radio: " + c1.getRadio());
        System.out.println("Area: " + c1.calcularArea());
        System.out.println("Circunferencia: " + c1.calcularCircunferencia());
        
        
        System.out.println("Radio: " + c1.getRadio());
        
        c1.escalar(50);
        
        System.out.println("Radio: " + c1.getRadio());
        
        
    }
    
}
