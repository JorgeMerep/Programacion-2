package sistemabiblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        SistemaBiblioteca biblioteca1 = new SistemaBiblioteca("El Ateneo");
        cargarBiblioteca(biblioteca1);
        biblioteca1.mostrarPublicacion();
        System.out.println("----------------------------");
        biblioteca1.leerPublicaciones();
        System.out.println("---------------------------");
        System.out.println(biblioteca1.comprarPublicacion("El procer"));
        System.out.println("----------------------------");
        biblioteca1.mostrarPublicacion();

    }

    public static void cargarBiblioteca(SistemaBiblioteca sistemaBiblioteca) {

        Libro libro1 = new Libro("El principito", 1800, "Sarasa", Genero.FICCION);
        Libro libro2 = new Libro("El procer", 1800, "Dr.Baus", Genero.HISTORIA);
        Libro libro3 = new Libro("El principito", 1800, "Dr.Baus", Genero.FICCION);

        Revista revista1 = new Revista("El grafico", 1960, 1);
        Revista revista2 = new Revista("Ole", 1980, 150);

        Ilustracion ilustracion1 = new Ilustracion("Mona Lisa", 1500, "Baus", 40, 40);
        Ilustracion ilustracion2 = new Ilustracion("Perros timberos", 1550, "Baus", 80, 40);
        Ilustracion ilustracion3 = null;

        try {
            sistemaBiblioteca.agregarPublicacion(libro1);
            sistemaBiblioteca.agregarPublicacion(libro2);
            sistemaBiblioteca.agregarPublicacion(revista1);
            sistemaBiblioteca.agregarPublicacion(revista2);
            sistemaBiblioteca.agregarPublicacion(ilustracion1);
            sistemaBiblioteca.agregarPublicacion(ilustracion2);
            sistemaBiblioteca.agregarPublicacion(libro3); // Test caso Libro duplicado

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistemaBiblioteca.agregarPublicacion(ilustracion3); // Test caso Ilustracion nula

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
