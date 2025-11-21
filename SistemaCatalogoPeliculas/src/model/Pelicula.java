package model;

public class Pelicula implements CSVSerializable, Comparable<Pelicula> {

    private int id;
    private String titulo;
    private String director;
    private Genero genero;

    public Pelicula(int id, String titulo, String director, Genero genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toCSV() {
        return id + "," + titulo + "," + director + "," + genero + "\n";
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        return (Integer.compare(id, pelicula.id));
    }

    public static Pelicula fromCSV(String peliculaCSV) {
        peliculaCSV = peliculaCSV.substring(0, peliculaCSV.length()); //Descarta el último caracter del String, que es el \n (salto de línea).
        String[] datos = peliculaCSV.split(","); //Crea un array de String, donde cada posición tiene el valor de un atributo.
        return new Pelicula(Integer.parseInt(datos[0]), datos[1], datos[2], Genero.valueOf(datos[3])); //Convierte cada String en el tipo de dato del respectivo atributo (si es String, no es necesario).

    }

}
