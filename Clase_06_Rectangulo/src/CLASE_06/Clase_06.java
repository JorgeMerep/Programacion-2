package CLASE_06;

public class Clase_06 {

    public static void main(String[] args) {
       
        Rectangulo r1 = new Rectangulo(4, 5);
        Rectangulo r2 = new Rectangulo(2, 3);
        
        Rectangulo r3 = r1.sumarRectangulo(r2);
              
        //se pasa por parámetro un objeto, y el método println llama por dentro a toString
        System.out.println(r1); 

              
    }
    
}
