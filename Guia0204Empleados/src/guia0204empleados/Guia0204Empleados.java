package guia0204empleados;

public class Guia0204Empleados {

    public static void main(String[] args) {
        Desarrollador d1 = new Desarrollador("Gustavo", 10000000, "Java");
        Gerente g1 = new Gerente("Juancho", 3000000, 5);
        System.out.println(d1);
        System.out.println(g1);
    }
    
}
