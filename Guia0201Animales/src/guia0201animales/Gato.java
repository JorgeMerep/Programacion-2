package guia0201animales;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public String hacerSonido() {
        return "miau!";
    }
}
