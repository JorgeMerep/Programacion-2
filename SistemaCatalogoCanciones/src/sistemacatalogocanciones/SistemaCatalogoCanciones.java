package sistemacatalogocanciones;

import config.RutasArchivos;
import java.io.IOException;
import model.Cancion;
import model.CatalogoMusical;
import model.GeneroMusical;

public class SistemaCatalogoCanciones {

    public static void main(String[] args) {
        try {
            CatalogoMusical<Cancion> catalogo = new CatalogoMusical<>();
            catalogo.agregar(new Cancion(1, "Bohemian Rhapsody", "Queen", GeneroMusical.ROCK));
            catalogo.agregar(new Cancion(2, "Billie Jean", "Michael Jackson",GeneroMusical.POP));
            catalogo.agregar(new Cancion(3, "Shape of You", "Ed Sheeran", GeneroMusical.POP));
            catalogo.agregar(new Cancion(4, "Take Five", "Dave Brubeck", GeneroMusical.JAZZ));
            catalogo.agregar(new Cancion(5, "Canon in D", "Pachelbel", GeneroMusical.CLASICA));

            System.out.println("Catálogo de canciones:");
            catalogo.paraCadaElemento(cancion -> System.out.println(cancion));

            System.out.println("------------------------------------------------");

            System.out.println("\nCanciones de género POP:");
            catalogo.filtrar(cancion -> cancion.getGenero() == GeneroMusical.POP)
                    .forEach(cancion -> System.out.println(cancion));

            System.out.println("------------------------------------------------");

            System.out.println("\nCanciones cuyo título contiene 'shape':");
            catalogo.filtrar(cancion -> cancion.getTitulo().toLowerCase().contains("shape"))
                    .forEach(cancion -> System.out.println(cancion));

            System.out.println("------------------------------------------------");

            System.out.println("\nCanciones ordenadas por ID:");
            catalogo.ordenar();
            catalogo.paraCadaElemento(cancion -> System.out.println(cancion));

            System.out.println("------------------------------------------------");

            System.out.println("\nCanciones ordenadas por artista:");
            catalogo.ordenar((cancion1, cancion2) -> cancion1.getArtista().compareTo(cancion2.getArtista()));
            catalogo.paraCadaElemento(cancion -> System.out.println(cancion));

            System.out.println("------------------------------------------------");

            catalogo.guardarEnArchivo(RutasArchivos.getRutaBINString());
            CatalogoMusical<Cancion> cargado = new CatalogoMusical<>();
            cargado.cargarDesdeArchivo(RutasArchivos.getRutaBINString());
            System.out.println("\nCanciones cargadas desde binario:");
            cargado.paraCadaElemento(cancion -> System.out.println(cancion));

            System.out.println("------------------------------------------------");

            catalogo.guardarEnCSV(RutasArchivos.getRutaCSVString());
            cargado.cargarDesdeCSV(RutasArchivos.getRutaCSVString(), cancionCSV->Cancion.fromCSV(cancionCSV));
            System.out.println("\nCanciones cargadas desde CSV:");
            cargado.paraCadaElemento(cancion -> System.out.println(cancion));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
