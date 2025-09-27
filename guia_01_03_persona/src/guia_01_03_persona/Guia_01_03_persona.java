
package guia_01_03_persona;

public class Guia_01_03_persona {


    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pedro", 18, 1.75);
        
        System.out.println("Es mayor: " + p1.esMayorDeEdad());
        System.out.println("IMC: " + p1.calcularIMC(75));
        
    }
    
}
