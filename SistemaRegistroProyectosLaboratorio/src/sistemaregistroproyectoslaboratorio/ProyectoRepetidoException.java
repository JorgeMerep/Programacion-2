package sistemaregistroproyectoslaboratorio;

public class ProyectoRepetidoException extends RuntimeException {

    private static final String MENSAJE = "Proyecto repetido";

    public ProyectoRepetidoException() {
        this(MENSAJE);
    }

    public ProyectoRepetidoException(String mensaje) {
        super(mensaje);
    }

}
