package ordenamiento;

public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    private String formato = "%02d/%02d/%d";

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return formato.formatted(dia, mes, anio);
    }
    
    
    
}
