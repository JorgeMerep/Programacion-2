package guia0203figuras;

public class Guia0203Figuras {

    public static void main(String[] args) {
        Cuadrado cu1 = new Cuadrado(5.5);
        Circulo ci1 = new Circulo(3);
        
        System.out.println(cu1.calcularArea());
        System.out.println(ci1.calcularArea());
    }
    
}
