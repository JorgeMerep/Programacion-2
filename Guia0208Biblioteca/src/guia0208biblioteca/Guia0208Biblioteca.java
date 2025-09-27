package guia0208biblioteca;

public class Guia0208Biblioteca {

    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca("UTN");
        
        Libro l1 = new Libro("El libro de los abrazos", "Eduardo Galeano", 1988, true);
        Libro l2 = new Libro("Desde La Boca", "Martin Kohan", 2024, true);
        Libro l3 = new Libro("El programador Pragmatico", "Juan Perez", 2003, true);
        
        b1.agregarLibro(l1);
        b1.agregarLibro(l2);
        b1.agregarLibro(l3);
        
        System.out.println(b1.listarLibros());
        System.out.println(l2);
        System.out.println(b1.retirarLibro("Desde La Boca"));
        System.out.println(l2);
    }
    
}
