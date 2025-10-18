
package centrodeportivo;


public class EquipamientoRepetidoException extends RuntimeException{
    
    private static final String MENSAJE = "Equipamiento repetido";

    public EquipamientoRepetidoException() {
        this(MENSAJE);
    }

    public EquipamientoRepetidoException(String mensaje) {
       super(mensaje);
    }
}
