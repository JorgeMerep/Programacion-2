
package centrodeportivo;


public class EquiposDeEntramientoAlAireLibre extends Equipamiento{
    
    private int resistenciaAlClima;
    private static final int RESISTENCIA_MINIMA = 1;
    private static final int RESISTENCIA_MAXIMA = 10;

    public EquiposDeEntramientoAlAireLibre(String nombre, String sector, IntensidadDeUsoRecomendada nivelUso, int resistenciaAlClima) {
        super(nombre, sector, nivelUso);
        this.resistenciaAlClima = resistenciaAlClima;
    }

    @Override
    public String toString() {
        return super.toString() +  " EquiposDeEntramientoAlAireLibre{" + "resistenciaAlClima=" + resistenciaAlClima + '}';
    }
        
    
}
