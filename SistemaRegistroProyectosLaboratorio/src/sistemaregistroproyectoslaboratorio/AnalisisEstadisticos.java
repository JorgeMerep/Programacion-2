package sistemaregistroproyectoslaboratorio;

public class AnalisisEstadisticos extends Proyecto implements Actualizable {

    private TipoAnalisis tipoAnalisis;

    public AnalisisEstadisticos(String nombre, String equipoResponsable, EstadoActual estadoActual, TipoAnalisis tipoAnalisis) {
        super(nombre, equipoResponsable, estadoActual);
        this.tipoAnalisis = tipoAnalisis;
    }

    @Override
    public String toString() {
        return super.toString() + "AnalisisEstadisticos{" + "tipoAnalisis=" + tipoAnalisis + '}';
    }

    @Override
    public String actualizarResultados() {
        return "Analisis Estadisticos " + getNombre() + " se esta actualizando...";
    }

}
