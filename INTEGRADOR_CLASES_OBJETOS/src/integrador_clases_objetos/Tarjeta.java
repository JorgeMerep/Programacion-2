package integrador_clases_objetos;

public class Tarjeta {
    private final EntidadFinanciera empresa;
    private final String banco;
    private final int numero;
    private double saldo;
    private final Persona titular;
    
    public Tarjeta(EntidadFinanciera empresa, String banco, int numero, double saldo, Persona titular) {
        this.empresa = empresa;
        this.banco = banco;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    private double getSaldo() {
        return saldo;
    }
    
    public void actualizarSaldo(double importe) {
        saldo += importe;
    }
    
    public boolean validarSaldo(double monto) {
        boolean resultado = false;
        if (monto <= getSaldo()) {
            resultado = true;
        }
        return resultado;        
    }
    
    public String getNombreApellido() {
        return titular.getNombre() + " " + titular.getApellido();
    }
    
    
    
}
