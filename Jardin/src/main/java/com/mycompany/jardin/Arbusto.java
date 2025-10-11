package com.mycompany.jardin;

public class Arbusto extends Planta implements Podable{

    private final static int DENSIDAD_FOLLAJE_MINIMA = 1;
    private final static int DENSIDAD_FOLLAJE_MAXIMA = 10;
    private int densidadFollaje;

    public Arbusto(String nombre, String ubicacion, String clima, int densidadFollaje) {
        super(nombre, ubicacion, clima);
        validarDensidadFollaje(densidadFollaje);
        this.densidadFollaje = densidadFollaje;
    }

    private void validarDensidadFollaje(int densidad) {

        if (densidad < DENSIDAD_FOLLAJE_MINIMA || densidad > DENSIDAD_FOLLAJE_MAXIMA) {
            throw new IllegalArgumentException("Densidad invalida");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Arbusto{" + "densidadFollaje=" + densidadFollaje + '}';
    }
    
     @Override
    public String podar(){
        return "El arbusto " + getNombre() + " esta siendo podado";
        
    }

}
