
package practica2;


public class Practica2 {

   
    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(4, 6);
        Rectangulo r2 = new Rectangulo(3, 5);

        Rectangulo r3 = r1.sumar(r2);

        System.out.println("La suma de los 2 rectangulos es: " + r3.getDatos());
    }
    
}
