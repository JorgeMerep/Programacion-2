package centrodeportivo;

public class InstrumentosParaDeportesDeEquipo extends Equipamiento implements UsableADiario {

    private String tipoDeDeporte;

    public InstrumentosParaDeportesDeEquipo(String nombre, String sector, IntensidadDeUsoRecomendada nivelUso, String tipoDeDeporte) {
        super(nombre, sector, nivelUso);
        this.tipoDeDeporte = tipoDeDeporte;
    }

    @Override
    public void prepararParaUsoDiario() {
        System.out.println("Preparando instrumentos para deportes de equipo");

    }

    @Override
    public String toString() {
        return super.toString() + " InstrumentosParaDeportesDeEquipo{" + "tipoDeDeporte=" + tipoDeDeporte + '}';
    }

}
