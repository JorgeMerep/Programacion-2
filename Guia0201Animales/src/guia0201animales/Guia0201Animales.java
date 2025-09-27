package guia0201animales;

public class Guia0201Animales {

    public static void main(String[] args) {
        Perro p1 = new Perro("Pepe", 5);
        Gato g1 = new Gato("Braulio", 7);
        
        System.out.println(p1.hacerSonido());
        System.out.println(g1.hacerSonido());
    }
    
}
