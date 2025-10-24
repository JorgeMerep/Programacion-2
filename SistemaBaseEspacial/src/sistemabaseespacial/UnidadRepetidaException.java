package sistemabaseespacial;

public class UnidadRepetidaException extends RuntimeException {
    private static final String MENSAJE = "Unidad repetida";
    
    public UnidadRepetidaException(){
        this(MENSAJE);
    }
    
    public UnidadRepetidaException(String mensaje){
        super(mensaje);
    }
    
}
