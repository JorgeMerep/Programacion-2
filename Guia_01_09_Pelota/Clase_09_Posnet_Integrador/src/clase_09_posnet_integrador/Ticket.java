package clase_09_posnet_integrador;

public class Ticket {
    private String cliente;
    private double total;
    private int cuotas;

    public Ticket(String nombreCliente, double total, int cuotas) {
        validarCuotas(cuotas);
        this.cliente = cliente;
        this.total = total;
        this.cuotas = cuotas;
    }
    
    private double montoCuota() {
        return total / cuotas;
    }
    
    private void validarCuotas(int cuotas) {
        if (cuotas <= 0) {
            throw new IllegalArgumentException("Cuota invalida");
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: " + cliente);
        sb.append("\n");
        sb.append("Total: $ " + total);
        sb.append("\n");
        sb.append("Monto Cuota: $%.2f%".formatted(montoCuota()));
        return sb.toString();
     
    }
    
    
}
