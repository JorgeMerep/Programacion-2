package clase_15_tiposexceptions;


public class IntegerOverflowException extends Exception {
    
    private static final String MESSAGE = "Desbordamiento de tipo Integer";
    
    public IntegerOverflowException(){
        this(MESSAGE);
    }
    
    public IntegerOverflowException(String mensaje){
        super(mensaje);
    }
    
}
