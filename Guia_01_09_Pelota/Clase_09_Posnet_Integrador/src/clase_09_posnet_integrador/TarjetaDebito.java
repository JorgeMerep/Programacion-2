package clase_09_posnet_integrador;

public class TarjetaDebito {
    
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private Cliente titular;
    private String numero;
    private double limite;

    public TarjetaDebito(EntidadFinanciera entidadFinanciera, String entidadBancaria, Cliente titular, String numero, double limite) {
        // habria que validar los argumentos: que no sean null, o que no estén en blanco, según corresponda
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        this.titular = titular;
        this.numero = numero;
        this.limite = limite;
    }
    
    public boolean checkLimite(double monto) {
        return monto <= limite;
    }
    
    public void informarVenta(double monto) {
        if (!checkLimite(monto)) {              //si la tarjeta no tiene limite suficiente...
            throw new IllegalStateException("No tiene limite");
        }
        limite -= monto;
    }
    
    public String getNombreTitular() {
        return titular.nombreCompleto();
    }

            
    
}
