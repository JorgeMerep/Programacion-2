
package guia_01_05_cuenta_bancaria;


public class Guia_01_05_cuenta_bancaria {


    public static void main(String[] args) {
        
        CuentaBancaria c1 = new CuentaBancaria("Cosme Fulanito");
        System.out.println("Numero cuenta: " + c1.getNumeroDeCuenta());
        
        CuentaBancaria c2 = new CuentaBancaria("Martin Palermo");
        System.out.println("Numero cuenta: " + c2.getNumeroDeCuenta());
        
        System.out.println("Saldo $ " + c1.getSaldo());
        
        c1.depositarDinero(1000);
        
        System.out.println("Saldo $ " + c1.getSaldo());
               
        c1.retirarDinero(300);
        
        System.out.println("Saldo $ " + c1.getSaldo());
    }
    
}
