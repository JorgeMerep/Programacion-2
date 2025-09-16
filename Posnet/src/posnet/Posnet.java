package posnet;

public class Posnet {

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoBase, int cuotas) {
        if (!validarTarjetayCuotas(tarjeta, cuotas)) {
            return null;
        }

        double montoFinal = calcularMontoConRecargo(montoBase, cuotas);

        if (!tieneSaldoSuficiente(tarjeta, montoFinal)) {
            return null;
        }

        tarjeta.restarSaldo(montoFinal);
        double montoPorCuota = montoFinal / cuotas;

        return new Ticket(" " + tarjeta.getTitular().getNombre() + " " + tarjeta.getTitular().getApellido() + " ", montoFinal, montoPorCuota);
    }

    private double calcularMontoConRecargo(double montoBase, int cuotas) {
        if (cuotas == 1) {
            return montoBase;
        } else {
            double recargo = 0.03 * (cuotas - 1);
            return montoBase * (1 + recargo);
        }
    }

    private boolean validarTarjetayCuotas(TarjetaDeCredito tarjeta, int cuotas) {
        return tarjeta != null && cuotas >= 1 && cuotas <= 6;
    }

    private boolean tieneSaldoSuficiente(TarjetaDeCredito tarjeta, double montoFinal) {
        return tarjeta.getSaldoDisponible() >= montoFinal;
    }

}
