package com.mycompany.estacionsubtes;

public class TarjetaFija extends Tarjeta {

    private int cantidadViajes;

    public TarjetaFija(CentralSubtes central, int cantidadViajes) {
        super(central);
        this.cantidadViajes = cantidadViajes;
    }

    public int consultarViajesRestantes() {
        return cantidadViajes;
    }

    @Override
    public boolean puedoViajar() {
        return cantidadViajes > 0;
    }

    @Override
    public void descontarViaje() {
        cantidadViajes--;
        System.out.println("Se realizo y desconto 1 viaje");
    }

    @Override
    public void realizarViaje() {
        if (!puedoViajar()) {
            throw new IllegalStateException("Cantidad de viajes insuficientes");
        } else {
            descontarViaje();

        }
    }
}
