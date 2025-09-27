
package guia_01_06_libro;

public class Guia_01_06_Libro {


    public static void main(String[] args) {
       
        Libro l1 = new Libro("El programador pragmatico", "Juan Perez", 123);
        
        System.out.println("Pagina actual: " + l1.getPaginaActual());
        
        l1.avanzarPagina();
        l1.avanzarPagina();
        l1.avanzarPagina();
        
        System.out.println("Pagina actual: " + l1.getPaginaActual());
        
        l1.retrocederPagina();
                
        System.out.println("Pagina actual: " + l1.getPaginaActual());
        
        l1.setPaginaActual(123);
        
        System.out.println("Pagina actual: " + l1.getPaginaActual());
        
        l1.avanzarPagina();
                
        System.out.println("Pagina actual: " + l1.getPaginaActual());
        
        
    }
    
}
