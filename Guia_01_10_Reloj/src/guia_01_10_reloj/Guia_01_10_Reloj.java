
package guia_01_10_reloj;


public class Guia_01_10_Reloj {

    
    public static void main(String[] args) {
        
        Reloj r1 = new Reloj();
        
        System.out.println("Hora: " + r1.getHora() + " Min: " + r1.getMinuto() + " Seg: " + r1.getSegundo());
        
        r1.setHora(23);
        r1.setMinuto(59);
        r1.setSegundo(59);
        
        System.out.println("Hora: " + r1.getHora() + " Min: " + r1.getMinuto() + " Seg: " + r1.getSegundo());
        
        r1.avanzarSegundo();
        
        System.out.println("Hora: " + r1.getHora() + " Min: " + r1.getMinuto() + " Seg: " + r1.getSegundo());
        
    }
    
}
