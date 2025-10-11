package com.mycompany.estacionsubtes;

public class TarjetaRecargableConDescuento extends TarjetaRecargable {

    private double descuento;

    public TarjetaRecargableConDescuento(CentralSubtes central, double descuento) {
        super(central);
        setDescuento(descuento);
    }

    public void setDescuento(double descuento) {
        validarDescuento(descuento); 
        this.descuento = descuento;
    }

    private void validarDescuento(double descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 100");
        }
    }

    public double getDescuento() {
        return descuento;
    }

    private double calcularPrecioConDescuento() {
        double precioBase = getCentral().consultarPrecioViaje();
        return precioBase * (1 - descuento / 100.0);
    }

   
    @Override
    public boolean puedoViajar() {
        return consultarSaldo() >= calcularPrecioConDescuento();
    }

    @Override
    public void descontarViaje() {
        double costo = calcularPrecioConDescuento();
        descontarSaldo(costo);
        System.out.println("Viaje con descuento (" + descuento + "%). Costo: " + costo
                + ". Saldo restante: " + consultarSaldo());
    }

    @Override
    public void realizarViaje() {
        if (!puedoViajar()) {
            throw new IllegalStateException("Saldo insuficiente para realizar el viaje con descuento.");
        }
        descontarViaje();
    }
}
