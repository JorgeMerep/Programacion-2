package centrodeportivo;

import java.util.Objects;

public abstract class Equipamiento {

    private String nombre;
    private String sector;
    private IntensidadDeUsoRecomendada nivelUso;

    public Equipamiento(String nombre, String sector, IntensidadDeUsoRecomendada nivelUso) {
        this.nombre = nombre;
        this.sector = sector;
        this.nivelUso = nivelUso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Equipamiento e)) {
            return false;
        }

        return this.nombre.equals(e.nombre) && this.sector.equals(e.sector);

    }

    public boolean tieneNivelUso(IntensidadDeUsoRecomendada intensidad) {
        return nivelUso == intensidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, sector);
    }

    @Override
    public String toString() {
        return "Equipamiento{" + "nombre=" + nombre + ", sector=" + sector + ", nivelUso=" + nivelUso + '}';
    }

}
