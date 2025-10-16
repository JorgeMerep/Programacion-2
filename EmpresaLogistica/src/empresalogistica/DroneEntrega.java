package empresalogistica;

public class DroneEntrega extends DispositivoElectronico implements TransportadorPaquete {

    private boolean camaraEncendida;

    public DroneEntrega(String marca, int nivelBateria, boolean encendido, boolean camaraEncendida) {
        super(marca, nivelBateria, encendido);
        this.camaraEncendida = camaraEncendida;
    }

    public void despegar() {

    }

    @Override
    public void transportarPaquete(String destino) {

    }

    @Override
    protected void encender() {

    }

    @Override
    protected int getBateria() {

        

    }

}
