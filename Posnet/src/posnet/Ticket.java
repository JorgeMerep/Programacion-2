package posnet;

public class Ticket {

    private final String nombreCliente;
    private final double montoTotal;
    private final double montoDeCuota;

    public Ticket(String nombreCliente, double montoTotal, double montoDeCuota) {
        this.nombreCliente = nombreCliente;
        this.montoTotal = montoTotal;
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public String toString() {
        return "Ticket" + "Cliente" + nombreCliente + "Monto total: " + montoTotal + "Monto por cuota: " + montoDeCuota;
    }

}
