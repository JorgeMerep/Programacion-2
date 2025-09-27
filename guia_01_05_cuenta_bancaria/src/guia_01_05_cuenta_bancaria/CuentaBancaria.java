
package guia_01_05_cuenta_bancaria;

/*5. Clase CuentaBancaria:
o Define una clase CuentaBancaria con atributos saldo, titular, y numeroDeCuenta.
o Implementa métodos para depositar y retirar dinero, asegurándote de que no se permita retirar más de lo que hay en el saldo.
o Crea un método para consultar el saldo actual de la cuenta.*/

public class CuentaBancaria {
    private double saldo;
    private String titular;
    private int numeroDeCuenta;
    private static final int NUMERO_CUENTA_INICIAL = 1;
    private static int siguienteNumeroCuenta = NUMERO_CUENTA_INICIAL;
    
    public CuentaBancaria(String titular) {
        saldo = 0;
        this.titular = titular;
        numeroDeCuenta = siguienteNumeroCuenta++;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    public void depositarDinero(int deposito) {
        saldo += deposito;
    }
    
    public void retirarDinero(int retiro) {
        validarSaldoSuficiente(retiro);
        saldo -= retiro;
    }
    
    private void validarSaldoSuficiente(int retiro) {
        if (retiro > saldo) {
            throw new IllegalArgumentException("No posee saldo suficiente");
        }
    }
}
