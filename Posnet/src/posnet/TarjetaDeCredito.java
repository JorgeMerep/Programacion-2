package posnet;

public class TarjetaDeCredito {

    private EntidadFinanciera entidadFinanciera;
    private String banco;
    private String numero;
    private double saldoDisponible;
    private Cliente titular;

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
}
