package sistemacatalogopeliculas;

import config.RutaArchivos;
import model.Catalogo;
import model.Genero;
import model.Pelicula;

public class SistemaCatalogoPeliculas {

    public static void main(String[] args) {
        try {
            // Crear un catálogo de películas
            Catalogo<Pelicula> catalogoPeliculas = new Catalogo<>();
            catalogoPeliculas.agregar(new Pelicula(1, "El Padrino", "Francis FordCoppola", Genero.DRAMA));
            catalogoPeliculas.agregar(new Pelicula(2, "La La Land", "Damien Chazelle", Genero.COMEDIA));
            catalogoPeliculas.agregar(new Pelicula(3, "Guerra Mundial Z", "MarcForster", Genero.TERROR));
            catalogoPeliculas.agregar(new Pelicula(4, "Toy Story", "John Lasseter", Genero.ANIMACION));
            catalogoPeliculas.agregar(new Pelicula(5, "The Social Dilemma", "JeffOrlowski", Genero.DOCUMENTAL));

            // Mostrar todas las películas en el catálogo
            System.out.println("Catálogo de películas:");
            catalogoPeliculas.paraCadaElemento(pelicula -> System.out.println(pelicula));

            System.out.println("----------------------------------------------");
            // Filtrar películas por género COMEDIA
            System.out.println("\nPelículas de género COMEDIA:");
            catalogoPeliculas.filtrar(pelicula -> pelicula.getGenero() == Genero.COMEDIA)
                    .forEach(pelicula -> System.out.println(pelicula));
            System.out.println("----------------------------------------------");

            // Filtrar películas cuyo título contiene "Guerra"
            System.out.println("\nPelículas cuyo título contiene 'Guerra':");
            catalogoPeliculas.filtrar(pelicula -> pelicula.getTitulo().toLowerCase().contains("guerra"))
                    .forEach(pelicula -> System.out.println(pelicula));
            System.out.println("----------------------------------------------");

            // Ordenar películas de manera natural (por id)
            System.out.println("\nPelículas ordenadas de manera natural (por id):");
            catalogoPeliculas.ordenar();
            catalogoPeliculas.paraCadaElemento(pelicula -> System.out.println(pelicula));
            System.out.println("----------------------------------------------");

            // Ordenar películas por título usando Comparator
            System.out.println("\nPelículas ordenadas por título:");
            catalogoPeliculas.ordenar((p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
            catalogoPeliculas.paraCadaElemento(pelicula -> System.out.println(pelicula));
            System.out.println("----------------------------------------------");

            // Guardar el catálogo en archivo binario
            catalogoPeliculas.guardarEnArchivo(RutaArchivos.getRutaBINString());
            // Cargar el catálogo desde archivo binario
            Catalogo<Pelicula> catalogoCargado = new Catalogo<>();
            catalogoCargado.cargarDesdeArchivo(RutaArchivos.getRutaBINString());
            System.out.println("\nPelículas cargadas desde archivo binario:");
            catalogoCargado.paraCadaElemento(pelicula -> System.out.println(pelicula));
            System.out.println("----------------------------------------------");

            // Guardar el catálogo en archivo CSV
            catalogoPeliculas.guardarEnCSV(RutaArchivos.getRutaCSVString());
            // Cargar el catálogo desde archivo CSV
            catalogoCargado.cargarDesdeCSV(RutaArchivos.getRutaCSVString(), peliculasCSV -> Pelicula.fromCSV(peliculasCSV));
            System.out.println("\nPelículas cargadas desde archivo CSV:");
            catalogoCargado.paraCadaElemento(pelicula -> System.out.println(pelicula));
            System.out.println("----------------------------------------------");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
