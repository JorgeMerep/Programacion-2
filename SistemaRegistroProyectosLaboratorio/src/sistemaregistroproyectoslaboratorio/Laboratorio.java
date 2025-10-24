package sistemaregistroproyectoslaboratorio;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    private String nombre;
    private List<Proyecto> proyectos;

    public Laboratorio(String nombre) {
        this.nombre = nombre;
        proyectos = new ArrayList<>();
    }

    private void validarProyecto(Proyecto proyecto) {
        if (proyecto == null) {
            throw new IllegalArgumentException("Proyecto nulo");
        }
        if (proyectos.contains(proyecto)) {
            throw new ProyectoRepetidoException("No se puede agregar un proyecto repetido!!");
        }
    }

    public void agregarProyecto(Proyecto proyecto) {
        validarProyecto(proyecto);
        proyectos.add(proyecto);
    }

    public String mostrarProyectos() {
        StringBuilder sb = new StringBuilder();
        for (Proyecto proyecto : proyectos) {
            sb.append(proyecto);
            sb.append("\n");
        }

        return sb.toString();
    }

    public String actualizarResultadosProyecto() {
        StringBuilder sb = new StringBuilder();
        for (Proyecto proyecto : proyectos) {
            if (proyecto instanceof Actualizable a) {
                sb.append(a.actualizarResultados());
            } else {
                sb.append(proyecto.getClass().getSimpleName());
                sb.append(" no pueden actualizarse directamente.");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private void validarEstadoActual(EstadoActual nuevoEstado) {
        if (nuevoEstado == null) {
            throw new IllegalArgumentException("El estado indicado es nulo. No se realizo ninguna modificacion");
        }
    }

    public void actualizarEstadoProyectos(EstadoActual nuevoEstado) {
        validarEstadoActual(nuevoEstado);

        System.out.println("=== Actualizacion de estados de proyectos ===");

        int proyectosModificados = procesarActualizacionEstados(nuevoEstado);

        mostrarResumenActualizacion(proyectosModificados);

        System.out.println("=============================================");
    }

    private int procesarActualizacionEstados(EstadoActual nuevoEstado) {
        int contador = 0;

        for (Proyecto proyecto : proyectos) {
            if (proyecto.getEstadoActual() != nuevoEstado) {
                mostrarCambioEstado(proyecto, nuevoEstado);
                proyecto.setEstadoActual(nuevoEstado);
                contador++;
            }
        }

        return contador;
    }

    private void mostrarCambioEstado(Proyecto proyecto, EstadoActual nuevoEstado) {
        System.out.println("Proyecto '" + proyecto.getNombre() + "' cambio de estado "
                + proyecto.getEstadoActual() + " A " + nuevoEstado);
    }

    private void mostrarResumenActualizacion(int proyectosModificados) {
        if (proyectosModificados == 0) {
            System.out.println("No se realizo ninguna modificacion.");
        } else {
            System.out.println("Total de proyectos actualizados: " + proyectosModificados);
        }
    }

}
