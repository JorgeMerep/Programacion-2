package sistemaregistroproyectoslaboratorio;

public class MachineLearning extends Proyecto implements Actualizable {

    private int porcentajePrecisionAlcanzado;
    private static final int PORC_PRECISION_MINIMA = 0;
    private static final int PORC_PRECISION_MAXIMA = 100;

    public MachineLearning(String nombre, String equipoResponsable, EstadoActual estadoActual, int porcentajePrecisionAlcanzado) {
        super(nombre, equipoResponsable, estadoActual);
        validarPorcentajePrecision(porcentajePrecisionAlcanzado);
        this.porcentajePrecisionAlcanzado = porcentajePrecisionAlcanzado;
    }

    private void validarPorcentajePrecision(int porcentaje) {
        if (porcentaje < PORC_PRECISION_MINIMA || porcentaje > PORC_PRECISION_MAXIMA) {
            throw new IllegalArgumentException(
                    "El porcentaje de precisión debe estar entre " + PORC_PRECISION_MINIMA + " y " + PORC_PRECISION_MAXIMA + ". Valor recibido: " + porcentaje
            );
        }
    }

    @Override
    public String toString() {
        return super.toString() + "MachineLearning{" + "porcentajePrecisionAlcanzado=" + porcentajePrecisionAlcanzado + '}';
    }

    @Override
    public String actualizarResultados() {
        return "Machine Learning " + getNombre() + " se esta actualizando...";

    }

}
