package guia_01_01_rectangulo;


public class Guia_01_01_rectangulo {


    public static void main(String[] args) {
       
        Rectangulo r1 = new Rectangulo(4, 5);
        Rectangulo r2 = new Rectangulo(2, 3);
        
        Rectangulo r3 = r1.sumarRectangulo(r2);
        
        System.out.println(r3.getBase());
        System.out.println(r3.getAltura());
                
              
    }
    
}
