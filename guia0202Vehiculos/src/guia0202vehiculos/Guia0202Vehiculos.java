package guia0202vehiculos;

public class Guia0202Vehiculos {

    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla", true);
        Moto m1 = new Moto("Honda", "Transalp", false);
        
        System.out.println(c1.mostrarDetalles());
        System.out.println(m1.mostrarDetalles());
        
        
    }
    
}
