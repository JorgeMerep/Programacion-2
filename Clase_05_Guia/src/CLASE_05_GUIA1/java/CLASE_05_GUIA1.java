package Clase_05_Guia1.java;


public class CLASE_05_GUIA1 {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(4, 5);
        Rectangulo r2 = new Rectangulo(2, 3);
        
        Rectangulo r3 = r1.sumar(r2); //esta forma es la MAS orientada a objetos
        
        Rectangulo r4 = Rectangulo.sumarRectangulos(r1, r2);
        
        // System.out.println("Ancho: " + r3.getAncho());
        // System.out.println("Alto: " + r3.getAlto());
        
        String x = r1.toString();
        
        System.out.println(x);
        System.out.println("abc");
        
       
    }
    
}
