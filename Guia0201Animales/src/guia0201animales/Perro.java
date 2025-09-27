package guia0201animales;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public String hacerSonido() {
        return "guau!";
    }
    
}
