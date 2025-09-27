package clase_06_autos;

public class Auto {
    private String patente;
    private String marca;
    private Color color;
    private int modelo;
    private Motor motor;


    public Auto(String patente, String marca, Color color, int modelo, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acelerar() {
        motor.acelerar();
    }
    
    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color.toString() + ", modelo=" + modelo + "\n "
                + motor.toString() + '}';
    }
    
    
    
}
