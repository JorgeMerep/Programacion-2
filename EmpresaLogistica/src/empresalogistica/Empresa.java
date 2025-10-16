package empresalogistica;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<TransportadorPaquete> transportadores;

    public Empresa(String nombre, List<TransportadorPaquete> transportadorPaquetes) {
        this.nombre = nombre;
        transportadores = new ArrayList<>();
    }

    public void agregarTransportador(TransportadorPaquete transportador) {
        if (transportador != null) {
            transportadores.add(transportador);
        }

    }

    public void iniciarEntregas() {

    }

}
