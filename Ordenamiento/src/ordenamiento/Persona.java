package ordenamiento;


public class Persona implements Comparable<Persona> {
    
    private int dni;
    private String nombre;
    private char genero;
    private double altura;
    private Fecha fechaNacimiento;
    private Nacionalidad nacionalidad;

    public Persona(int dni, String nombre, char genero, double altura, Fecha fechaNacimiento, Nacionalidad nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.genero = genero;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", genero=" + genero + ", altura=" + altura + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + '}';
    }

    @Override
    public int compareTo(Persona persona) {
        return Integer.compare(dni, persona.dni);
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }
    
}
