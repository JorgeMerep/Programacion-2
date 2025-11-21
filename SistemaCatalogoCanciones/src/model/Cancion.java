package model;

public class Cancion implements Comparable<Cancion>, CSVSerializable {

    private int id;
    private String titulo;
    private String artista;
    private GeneroMusical genero;

    public Cancion(int id, String titulo, String artista, GeneroMusical genero) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion{" + "id=" + id + ", titulo=" + titulo + ", artista=" + artista + ", genero=" + genero + '}';
    }

    //COMPARACION DESCENDENTE LLEVA PRIMERO EL PARAMETRO A COMPARAR Y LUEGO EL DEL PROPIO OBJETO
    @Override
    public int compareTo(Cancion cancion) {
        return Integer.compare(cancion.id, id);
    }

    @Override
    public String toCSV() {
        return id + "," + titulo + "," + artista + "," + genero + "\n";

    }

    public static Cancion fromCSV(String cancionCSV) {

        cancionCSV = cancionCSV.substring(0, cancionCSV.length()); //Descarta el último caracter del String, que es el \n (salto de línea).
        String[] datos = cancionCSV.split(","); //Crea un array de String, donde cada posición tiene el valor de un atributo.
        return new Cancion(Integer.parseInt(datos[0]), datos[1], datos[2], GeneroMusical.valueOf(datos[3])); //Convierte cada String en el tipo de dato del respectivo atributo (si es String, no es necesario).

    }

    public GeneroMusical getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }
    
    

}
