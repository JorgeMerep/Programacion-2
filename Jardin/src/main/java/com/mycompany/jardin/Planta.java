package com.mycompany.jardin;

import java.util.Objects;

public abstract class Planta {

    private String nombre;
    private String ubicacion;
    private String clima;

    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Planta planta)) {
            return false;
        }
        return nombre.equals(planta.nombre) && ubicacion.equals(planta.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ubicacion);
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", clima=" + clima + '}';
    }

}
