package posnet;

public class TP_Integrador_Posnet {

    public static void main(String[] args) {

        Cliente nuevoCliente = new Cliente("33996335", "Jorge", "Merep", "1158056462", "asdasd@gmail.com");

        TarjetaDeCredito nuevaTarjetaDeCredito = new TarjetaDeCredito(EntidadFinanciera.VISA, "ICBC", "1234-5678-9101", 50000, nuevoCliente);

        Posnet nuevoPosnet = new Posnet();

        Ticket ticket = nuevoPosnet.efectuarPago(nuevaTarjetaDeCredito, 20000, 5);

        if (ticket != null) {
            System.out.println(ticket);
        } else {
            System.out.println("Pago rechazado.");
        }
    }
}
