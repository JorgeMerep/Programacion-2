package clase_07_estacionamiento;

public class Moto {
    
    private String patente;
    private String marca;
    private String modelo;
    private boolean bloqueada;

    public Moto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void bloquear() {
        bloqueada = true;
    }
    
}
