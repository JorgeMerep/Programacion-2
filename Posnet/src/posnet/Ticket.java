package posnet;

public class Ticket {

    private String nombreCliente;
    private double montoTotal;
    private double montoDeCuota;

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
