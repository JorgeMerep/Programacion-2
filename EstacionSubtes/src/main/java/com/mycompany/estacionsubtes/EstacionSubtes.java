package com.mycompany.estacionsubtes;

public class EstacionSubtes {

    public static void main(String[] args) {
        // Configuramos la central con precio de viaje = 120
        CentralSubtes sube = new CentralSubtes(120);

        // Caso 1: Tarjeta normal
        TarjetaRecargable tarjetaNormal = new TarjetaRecargable(sube);
        tarjetaNormal.recargar(300); // Recargamos saldo

        System.out.println("=== TARJETA NORMAL ===");
        System.out.println("Saldo inicial: $" + tarjetaNormal.consultarSaldo());

        while (tarjetaNormal.puedoViajar()) {
            tarjetaNormal.realizarViaje();
        }
        System.out.println("Saldo final (normal): $" + tarjetaNormal.consultarSaldo());
        System.out.println();

        // Caso 2: Tarjeta con descuento del 50%
        TarjetaRecargableConDescuento tarjetaConDesc = new TarjetaRecargableConDescuento(sube, 50);
        tarjetaConDesc.recargar(300);

        System.out.println("=== TARJETA CON DESCUENTO 50% ===");
        System.out.println("Saldo inicial: $" + tarjetaConDesc.consultarSaldo());

        while (tarjetaConDesc.puedoViajar()) {
            tarjetaConDesc.realizarViaje();
        }
        System.out.println("Saldo final (con descuento): $" + tarjetaConDesc.consultarSaldo());
        System.out.println();

        // Caso 3: Probar con descuento menor (20%)
        TarjetaRecargableConDescuento tarjetaDesc20 = new TarjetaRecargableConDescuento(sube, 20);
        tarjetaDesc20.recargar(200);

        System.out.println("=== TARJETA CON DESCUENTO 20% ===");
        System.out.println("Saldo inicial: $" + tarjetaDesc20.consultarSaldo());

        tarjetaDesc20.realizarViaje(); // 1er viaje
        tarjetaDesc20.realizarViaje(); // 2do viaje
        tarjetaDesc20.realizarViaje(); // 3er viaje

        // Caso 4: Intentar viajar con descuento y quedar sin saldo
        System.out.println("Saldo final (20% descuento): $" + tarjetaDesc20.consultarSaldo());

    }
}