package centrodeportivo;

import java.util.ArrayList;
import java.util.List;

public class CentroEntrenamientoDeportivo {

    private String nombre;
    private List<Equipamiento> equipamientos;

    public CentroEntrenamientoDeportivo(String nombre) {
        this.nombre = nombre;
        equipamientos = new ArrayList<>();
    }

    private void validarEquipos(Equipamiento equipo) {
        if (equipo == null) {
            throw new IllegalArgumentException("Equipamiento inexistente");
        } else if (equipamientos.contains(equipo)) {
            throw new EquipamientoRepetidoException();
        }
    }

    public void agregarEquipos(Equipamiento equipo) {
        validarEquipos(equipo);
        equipamientos.add(equipo);
    }

    public void mostrarEquipos() {
        for (Equipamiento equipos : equipamientos) {
            System.out.println(equipos);
        }
    }

    public void prepararEquipos() {
        for (Equipamiento equipos : equipamientos) {
            if (equipos instanceof UsableADiario usables) {
                usables.prepararParaUsoDiario();
            } else {
                System.out.println("Estos equipos no necesitan preparacion para ser usados");
            }
        }

    }

    public List<Equipamiento> filtrarPorNivelDeUso(IntensidadDeUsoRecomendada intensidad) {

        ArrayList<Equipamiento> equiposFiltrados = new ArrayList<>();

        for (Equipamiento equipos : equipamientos) {
            if (equipos.tieneNivelUso(intensidad)) {
                equiposFiltrados.add(equipos);
                System.out.println(equipos);
            }
        }
        return equiposFiltrados;

    }
}
