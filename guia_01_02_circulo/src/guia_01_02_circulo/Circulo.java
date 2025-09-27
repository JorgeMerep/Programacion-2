
package guia_01_02_circulo;
/*
Clase Círculo:
o Define una clase Círculo con un atributo radio de tipo double.
o Crea métodos para calcular el área y la circunferencia del círculo.
o Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un porcentaje dado.
*/

public class Circulo {
    
    private double radio;
    private static final double PI = 3.14;
    
    public Circulo(double radio) {
        validarPositivo(radio);
        this.radio = radio;
    }
    
    private void validarPositivo(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    public double calcularArea() {
        return PI * (radio * radio);
    }
    
    public double calcularCircunferencia() {
        return 2* PI * radio;
    }
    
    public void escalar(double porcentaje) {
        radio *= (1 + (porcentaje / 100));
    }
    
    public double getRadio(){
        return radio;
    }
    
}
