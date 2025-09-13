package estacionamiento.auto;

public class Auto {

    private String patente;
    private String marca;
    private int modelo;

    public Auto(String patente, String marca, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public boolean tienePatente(String patente) {
        return this.patente.equals(patente);
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

    public boolean equals(Object o) {
        if (o == null || !(o instanceof Auto a)) { //si "o" es una instancia de Auto, lo castea a Auto"
            return false;
        }
        //Auto a = (Auto) o; //castear a tipo Auto, porque ahora ya sabemos que "o" es un Auto -cuando llega al método como argumento, es de tipo Object-.
        return patente.equals(a.patente) && marca.equals(a.marca) && modelo == a.modelo;

    }

}
