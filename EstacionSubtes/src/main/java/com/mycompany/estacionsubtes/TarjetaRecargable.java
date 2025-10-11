package com.mycompany.estacionsubtes;

public class TarjetaRecargable extends Tarjeta {

    private double saldo;

    public TarjetaRecargable(CentralSubtes central) {
        super(central);
        this.saldo = 0.0;
    }

    public void recargar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public boolean puedoViajar() {
        return saldo >= getCentral().consultarPrecioViaje();
    }

    @Override
    public void descontarViaje() {
        saldo -= getCentral().consultarPrecioViaje();
        System.out.println("Se realizo un viaje");
    }

    @Override
    public void realizarViaje() {
        if (!puedoViajar()) {
            throw new IllegalStateException("Saldo insuficiente");
        } else {
            descontarViaje();
        }
    }
    
    protected void descontarSaldo(double monto) {
        if (!puedoViajar()) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= monto;
    }
}
