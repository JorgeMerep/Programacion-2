package practica2;

import java.awt.geom.Area;

/*Crea una clase Rectángulo con atributos ancho y alto de tipo double.
     * Implementa métodos para calcular el área y el perímetro del rectángulo.
     * Escribe un método esCuadrado() que devuelva true si el rectángulo es un
     * cuadrado, es decir, si ancho y alto son iguales*/
public class Rectangulo {

    // Atributos de Clase
    private double ancho;
    private double alto;

    // Constructor con validación
    public Rectangulo(double ancho, double alto) {
        setAncho(ancho);
        setAlto(alto);
    }

    // GETTERS
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    // SETTERS con validación
    public void setAncho(double ancho) {
        validarValor(ancho);
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        validarValor(alto);
        this.alto = alto;
    }

    // VALIDACIÓN general
    private void validarValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("El valor debe ser mayor que cero");
        }
    }

    // MÉTODOS de cálculo
    public double calcularArea() {
        return ancho * alto;
    }

    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    public boolean esCuadrado() {
        return ancho == alto;
    }
    
    public Rectangulo sumar(Rectangulo otro) {
        double nuevoAncho = this.ancho + otro.ancho;
        double nuevoAlto = this.alto + otro.alto;
        return new Rectangulo(nuevoAncho, nuevoAlto);
    }
    
    public String getDatos(){
        return "Ancho: " + ancho + " Alto: " + alto;
    }
}
