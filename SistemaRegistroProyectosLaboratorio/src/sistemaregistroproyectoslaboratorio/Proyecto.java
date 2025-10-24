package sistemaregistroproyectoslaboratorio;

import java.util.Objects;

public abstract class Proyecto {

    private String nombre;
    private String equipoResponsable;
    private EstadoActual estadoActual;

    public Proyecto(String nombre, String equipoResponsable, EstadoActual estadoActual) {
        this.nombre = nombre;
        this.equipoResponsable = equipoResponsable;
        this.estadoActual = estadoActual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Proyecto p)) {
            return false;
        }
        return nombre.equals(p.nombre) && equipoResponsable.equals(p.equipoResponsable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, equipoResponsable);
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", equipoResponsable=" + equipoResponsable + ", estadoActual=" + estadoActual + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public EstadoActual getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(EstadoActual estadoActual) {
        this.estadoActual = estadoActual;
    }

}
