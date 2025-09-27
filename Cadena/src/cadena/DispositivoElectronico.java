package cadena;

public class DispositivoElectronico {

    private final String id;
    private final double precio;
    private final TipoDispositivo tipo;

    public DispositivoElectronico(String id, double precio, TipoDispositivo tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoDispositivo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Precio: " + precio + " | Tipo: " + tipo;
    }

    public boolean esDeTipo(TipoDispositivo tipo) {
        return this.tipo == tipo;
    }

}
