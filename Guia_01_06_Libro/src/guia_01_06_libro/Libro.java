
package guia_01_06_libro;

/* Clase Libro:
o Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
o Implementa métodos para avanzar y retroceder páginas.
o Crea un método que indique si el lector ha terminado de leer el libro.*/

public class Libro {
    
    private final String titulo;
    private final String autor;
    private final int numeroDePaginas;
    private int paginaActual;
    
    public Libro(String titulo, String autor, int totalPaginas) {
        validarPositivo(totalPaginas);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = totalPaginas;
        this.paginaActual = 0;
    }
    
    private void validarPositivo(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    private boolean estaTerminado() {
        return paginaActual == numeroDePaginas;
    }
    
    private boolean esPrimeraPagina() {
        return paginaActual == 0;
    }
    
    public void avanzarPagina() {
        if (!estaTerminado()) {
            paginaActual++;
        }
    }
    
    public void retrocederPagina() {
        if (!esPrimeraPagina()) {
            paginaActual--;
        } 
    }
    
    public void setPaginaActual(int pagina) {
        validarPagina(pagina);
        paginaActual = pagina;
    }
    
    public int getPaginaActual() {
        return paginaActual;
    }
    
    private void validarPagina(int pagina) {
        if (pagina <= 0 || pagina > numeroDePaginas) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
}
