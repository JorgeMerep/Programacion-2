package com.mycompany.estacionsubtes;

public class CentralSubtes {

    private double precioViaje;

    public CentralSubtes(double precioViaje) {
        this.precioViaje = precioViaje;
    }
    
    public double consultarPrecioViaje() {
        return precioViaje;
    }
    
    public void setPrecioViaje(double precioViaje) {
        this.precioViaje = precioViaje;
    }
}
