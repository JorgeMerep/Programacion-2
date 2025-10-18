
package sistemabiblioteca;


public class Ilustracion extends Publicacion{
    
    private String nombreIlustrador;
    private int dimensionAlto;
    private int dimensionAncho;

    public Ilustracion(String titulo, int anioPublicacion,String nombreIlustrador, int dimensionAlto, int dimensionAncho) {
        super(titulo, anioPublicacion);
        this.nombreIlustrador = nombreIlustrador;
        this.dimensionAlto = dimensionAlto;
        this.dimensionAncho = dimensionAncho;
    }

    @Override
    public String toString() {
        return "Ilustracion{" + "nombreIlustrador=" + nombreIlustrador + ", dimensionAlto=" + dimensionAlto + ", dimensionAncho=" + dimensionAncho + '}';
    }
    
    
    
    
    
    
}
