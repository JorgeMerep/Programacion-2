package clase_09_posnet_integrador;

public class Clase_09_Posnet_Integrador {

    public static void main(String[] args) {
      
        Cliente cliente = new Cliente("123456789", "Juan", "Perez", "112223456", "juanperez@gmail.com");
        Posnet posnet = new Posnet();
        TarjetaDebito tarjeta = new TarjetaDebito(EntidadFinanciera.MASTERCARD, "Banco campeon", cliente, "1234 5678 9123 2234", 30000);
        Ticket ticket = posnet.efectuarPago(tarjeta, 20000, 1);
        System.out.println(ticket);
        
        
    }
    
}
