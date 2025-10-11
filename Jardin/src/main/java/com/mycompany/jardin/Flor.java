package com.mycompany.jardin;

public class Flor extends Planta {

    private TemporadaFlorecimiento temporada;

    public Flor(String nombre, String ubicacion, String clima, TemporadaFlorecimiento temporada) {
        super(nombre, ubicacion, clima);
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return super.toString() + "Flor{" + "temporada=" + temporada + '}';
    }
 
}
