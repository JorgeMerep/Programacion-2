package posnet;

public class Posnet {
    private final static int MIN_CUOTA = 1;
    private final static int MAX_CUOTA = 6;
    private final static double PORC_REC_CUOTA = 0.03;

    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoBase, int cuotas) {
        if (!validarArgumentos(tarjeta, montoBase, cuotas)) {
            return null;
        }

        double montoFinal = calcularMontoConRecargo(montoBase, cuotas);

        if (!tieneSaldoSuficiente(tarjeta, montoFinal)) {
            return null;
        }

        tarjeta.restarSaldo(montoFinal);
        double montoPorCuota = montoFinal / cuotas;

        return new Ticket(
            tarjeta.getTitular().getNombre() + " " + tarjeta.getTitular().getApellido(),
            montoFinal,
            montoPorCuota
        );
    }

    private double calcularMontoConRecargo(double montoBase, int cuotas) {
        if (cuotas == 1) {
            return montoBase;
        } else {
            double recargo = PORC_REC_CUOTA * (cuotas - 1);
            return montoBase * (1 + recargo);
        }
    }

    private void validarTarjeta(TarjetaDeCredito tarjeta) {
        if (tarjeta == null) {
            throw new IllegalArgumentException("Tarjeta inválida");
        }
    }

    private void validarMonto(double montoBase) {
        if (montoBase <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }
    }

    private void validarCuotas(int cuotas) {
        if (cuotas < MIN_CUOTA || cuotas > MAX_CUOTA) {
            throw new IllegalArgumentException("Cantidad de cuotas inválida");
        }
    }

    private void validarArgumentos(TarjetaDeCredito tarjeta, double montoBase, int cuotas) {
            validarTarjeta(tarjeta);
            validarMonto(montoBase);
            validarCuotas(cuotas);
    }

    private boolean tieneSaldoSuficiente(TarjetaDeCredito tarjeta, double montoFinal) {
        return tarjeta.getSaldoDisponible() >= montoFinal;
    }
}
