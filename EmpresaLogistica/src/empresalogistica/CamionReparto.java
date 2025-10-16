
package empresalogistica;

public class CamionReparto extends Vehiculo implements TransportadorPaquete {

    private boolean cargado;

    public CamionReparto(String patente, String marca, int modelo, boolean cargado) {
        super(patente, marca, modelo);
        this.cargado = cargado;
    }

    public void abrirPuertaDeCarga() {

    }

    @Override
    public void transportarPaquete(String destino) {

    }

    @Override
    protected void tocarBocina() {

    }

    @Override
    protected void conducirRapido() {

    }

}
