package model;

public class Criatura implements Comparable<Criatura>, CSVSerializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String nombre;
    private String origen;
    private TipoCriatura tipo;

    public Criatura(int id, String nombre, String origen, TipoCriatura tipo) {
        this.id = id;
        this.nombre = nombre;
        this.origen = origen;
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Criatura criatura) {
        return Integer.compare(id, criatura.id);

    }

    @Override
    public String toCSV() {
        return id + "," + nombre + "," + origen + "," + tipo + "\n";
    }

    @Override
    public String toString() {
        return "Criatura{" + "id=" + id + ", nombre=" + nombre + ", origen=" + origen + ", tipo=" + tipo + '}';
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public TipoCriatura getTipo() {
        return tipo;
    }
    
    public static Criatura fromCSV(String criaturaCSV){
        criaturaCSV = criaturaCSV.substring(0, criaturaCSV.length());
        String[] datos = criaturaCSV.split(",");
        return new Criatura(Integer.parseInt(datos[0]), datos[1], datos[2], TipoCriatura.valueOf(datos[3]));
    }

}
