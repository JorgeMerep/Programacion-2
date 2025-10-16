package empresalogistica;

public abstract class Vehiculo {

    private String patente;
    private String marca;
    private int modelo;

    public Vehiculo(String patente, String marca, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    protected abstract void tocarBocina();

    protected abstract void conducirRapido();

}
