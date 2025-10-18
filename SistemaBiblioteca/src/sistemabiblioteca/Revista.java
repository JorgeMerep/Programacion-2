
package sistemabiblioteca;


public class Revista extends Publicacion implements Leible{
    
    private int numeroEdicion;

    public Revista(String titulo, int anioPublicacion,int numeroEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer() {
        System.out.println("Leyendo la revista.");
    }

    @Override
    public String toString() {
        return "Revista{" + "numeroEdicion=" + numeroEdicion + '}';
    }
    
    
    
}
