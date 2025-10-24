package sistemaregistroproyectoslaboratorio;

public class SistemasVisualizacion extends Proyecto {

    private int cantidadGraficosGenerados;

    public SistemasVisualizacion(String nombre, String equipoResponsable, EstadoActual estadoActual, int cantidadGraficosGenerados) {
        super(nombre, equipoResponsable, estadoActual);
        validarGraficosGeneradosNegativo(cantidadGraficosGenerados);
        this.cantidadGraficosGenerados = cantidadGraficosGenerados;
    }

    private void validarGraficosGeneradosNegativo(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad de graficos generados invalida");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "SistemasVisualizacion{" + "cantidadGraficosGenerados=" + cantidadGraficosGenerados + '}';
    }

}
