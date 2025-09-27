package clase_09_posnet_integrador;

public class Posnet {
    private static final int MIN_CUOTA = 1;
    private static final int MAX_CUOTA = 6;
    private static final double PORC_REC_CUOTA = 0.03;
    
    public Ticket efectuarPago(TarjetaDebito tarjeta, double monto, int cuotas) {
        validarArgumentos(tarjeta, monto, cuotas);
        Ticket ticket = null;
        double total = calcularTotal(monto, cuotas);
        if (tarjeta.checkLimite(total)) {
            tarjeta.informarVenta(total);
            ticket = new Ticket(tarjeta.getNombreTitular(), total, cuotas);
        }
        return ticket;       
    }
    
    private double calcularTotal(double monto, int cuotas) {
        return monto + calcularRecargo(monto, cuotas);
    }
    
    private double calcularRecargo(double monto, int cuotas) {
        return monto * PORC_REC_CUOTA * (cuotas - 1);
    }
    
    private void validarArgumentos(TarjetaDebito tarjeta, double monto, int cuotas) {
        validarTarjeta(tarjeta);
        validarMonto(monto);
        validarCuotas(cuotas);
    }
    
    private void validarTarjeta(TarjetaDebito tarjeta) {
        if(tarjeta == null){
            throw new IllegalArgumentException("Tarjeta nula");
        }
    }
    
    private void validarMonto(double monto) {
        if(monto < 0){
            throw new IllegalArgumentException("Monto invalido");
        }
    }
    
    private void validarCuotas(int cuotas) {
        if(cuotas < MIN_CUOTA || cuotas > MAX_CUOTA){
            throw new IllegalArgumentException("Cuotas invalidas");   
        }
    }
    
    
}
