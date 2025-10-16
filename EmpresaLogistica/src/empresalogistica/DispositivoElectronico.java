package empresalogistica;

public abstract class DispositivoElectronico {

    private String marca;
    private int nivelBateria;
    private boolean encendido;

    public DispositivoElectronico(String marca, int nivelBateria, boolean encendido) {
        this.marca = marca;
        this.nivelBateria = nivelBateria;
        this.encendido = encendido;
    }

    protected abstract void encender();

    protected abstract int getBateria();
}
