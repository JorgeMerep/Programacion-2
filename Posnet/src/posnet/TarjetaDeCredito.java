package posnet;

public class TarjetaDeCredito {

    private final EntidadFinanciera entidadFinanciera;
    private final String banco;
    private final String numero;
    private double saldoDisponible;
    private final Cliente titular;

    public TarjetaDeCredito(EntidadFinanciera entidadFinanciera, String banco, String numero, double saldoDisponible, Cliente titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.banco = banco;
        this.numero = numero;
        this.saldoDisponible = saldoDisponible;
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void restarSaldo(double monto) {
        saldoDisponible -= monto;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

}
