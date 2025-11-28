package sistemagestioncriaturasupsidedown;

import config.RutasArchivos;
import java.io.IOException;
import model.BestiarioUpsideDown;
import model.Criatura;
import model.TipoCriatura;

public class SistemaGestionCriaturasUpsideDown {

    public static void main(String[] args) {
        try {
            BestiarioUpsideDown<Criatura> bestiario = new BestiarioUpsideDown<>();
            bestiario.agregar(new Criatura(1, "Demogorgon", "Upside Down",
                    TipoCriatura.DEMOGORGON));
            bestiario.agregar(new Criatura(2, "Demodog Juvenil", "Bosque de Hawkins",                    TipoCriatura.DEMODOG));
            bestiario.agregar(new Criatura(3, "Shadow Tendril", "Dimensión Principal",
                    TipoCriatura.SHADOW_MONSTER));
            bestiario.agregar(new Criatura(4, "Mind Flayer Spawn", "Upside Down",
                    TipoCriatura.MIND_FLAYER_MINION));
            bestiario.agregar(new Criatura(5, "Murciélago del Upside Down", "Cueva Oscura", TipoCriatura.MURCIELAGO));

            System.out.println("Criaturas:");
            bestiario.paraCadaElemento(c -> System.out.println(c));

            System.out.println("\nCriaturas tipo DEMODOG:");
            bestiario.filtrar(m -> m.getTipo() == TipoCriatura.DEMODOG)
                    .forEach(c -> System.out.println(c));

            System.out.println("\nCriaturas que contienen 'shadow':");
            bestiario.filtrar(m -> m.getNombre().toLowerCase().contains("shadow"))
                    .forEach(c -> System.out.println(c));

            System.out.println("\nCriaturas ordenadas por ID:");
            bestiario.ordenar((c1, c2) -> Integer.compare(c1.getId(), c2.getId()));
            bestiario.paraCadaElemento(c -> System.out.println(c));

            System.out.println("\nCriaturas ordenadas por nombre:");
            bestiario.ordenar((c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre()));
            bestiario.paraCadaElemento(c -> System.out.println(c));

            bestiario.guardarEnArchivo(RutasArchivos.getRutaBINString());
            BestiarioUpsideDown<Criatura> cargado = new BestiarioUpsideDown<>();
            cargado.cargarDesdeArchivo(RutasArchivos.getRutaBINString());
            System.out.println("\nCriaturas cargadas desde archivo binario:");
            cargado.paraCadaElemento(c -> System.out.println(c));

            bestiario.guardarEnCSV(RutasArchivos.getRutaCSVString());
            cargado.cargarDesdeCSV(RutasArchivos.getRutaCSVString(), lineaCSV -> Criatura.fromCSV(lineaCSV));
            System.out.println("\nCriaturas cargadas desde archivo CSV:");
            cargado.paraCadaElemento(c -> System.out.println(c));

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
