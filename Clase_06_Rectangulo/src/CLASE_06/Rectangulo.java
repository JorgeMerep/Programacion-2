
package CLASE_06;
/*
Clase Rectángulo:
o Crea una clase Rectángulo con atributos ancho y alto de tipo double.
o Implementa métodos para calcular el área y el perímetro del rectángulo.
o Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si ancho y alto son iguales.
*/

public class Rectangulo {
    
    private double base;
    private double altura;
    
    public Rectangulo(double base, double altura){
        validarPositivo(base);
        validarPositivo(altura);
        this.base = base;
        this.altura = altura;
    }
    
    private void validarPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    
    public double calcularPerimetro(double base, double altura) {
        return (base + altura) * 2;
    }
    
    public boolean esCuadrado(double base, double altura) {
        return base == altura;
    }
    
    public Rectangulo sumarRectangulo(Rectangulo otro) {
        return new Rectangulo(base + otro.base, altura + otro.altura);
    }
    
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
