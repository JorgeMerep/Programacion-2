package integrador_clases_objetos;

public class Posnet {

    private static final int MIN_CUOTAS = 1;
    private static final int MAX_CUOTAS = 6;
    private static final double TASA_RECARGO = 0.03;
    
    public Ticket efectuarPago(Tarjeta tarjeta, double importe, int cuotas) {
        checkNull(tarjeta);
        Ticket comprobante = null;
        validarCuotas(cuotas);
        double montoFinal = calcularMontoFinal(importe, cuotas);
        if (tarjeta.validarSaldo(montoFinal)) {
            tarjeta.actualizarSaldo(montoFinal);
            comprobante = new Ticket(tarjeta.getNombreApellido(), montoFinal, calcularCuota(montoFinal, cuotas));
        }
        return comprobante;      
    }
    
    private void checkNull(Tarjeta tarjeta){
        if (tarjeta == null) {
            throw new IllegalArgumentException("Tarjeta nula");
        }
    }
    
    private void validarCuotas(int cuotas) {
        if (cuotas < MIN_CUOTAS || cuotas > MAX_CUOTAS) {
            throw new IllegalArgumentException("Cantidad de cuotas invalida");
        }
    }
      
    private double calcularCuota(double montoFinal, int cuotas) {
        return montoFinal / cuotas;        
    }
    
    private double calcularMontoFinal(double importe, int cuotas) {
        if (cuotas > 1) {
            importe += calcularRecargo(importe, cuotas);
        }
        return importe;
    }
    
    private double calcularRecargo(double importe, int cuotas) {
        return importe * TASA_RECARGO * (cuotas - 1);
    }
    
}
