package sistemabiblioteca;

public class PublicacionDuplicadaException extends RuntimeException {

    public static final String MESSAGE = "Publicacion duplicada";

    public PublicacionDuplicadaException() {
        this(MESSAGE);

    }

    public PublicacionDuplicadaException(String mensaje) {
        super(mensaje);
    }
}
