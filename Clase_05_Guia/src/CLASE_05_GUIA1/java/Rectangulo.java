
package Clase_05_Guia1.java;

public class Rectangulo {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double altura) {
        validarPositivo(ancho);
        validarPositivo(altura);
        this.ancho = ancho;
        this.alto = alto;
    }
    
    private void validarPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Parametro invalido");
        }
    }
    
    public double calcularArea() {
        return ancho * alto;
    }
    
    public double calcularPerimetro() {
        return (ancho + alto) * 2;
    }
    
    public boolean esCuadrado() {
        return ancho == alto;
    }
    
    public double getAncho() {
        return ancho;
    }    
    
    public double getAlto() {
        return alto;
    }
    
    public static Rectangulo sumarRectangulos(Rectangulo r1, Rectangulo r2) {
        double ancho_total = r1.getAncho() + r2.getAncho();
        double alto_total = r2.getAlto() + r2.getAlto();
        Rectangulo r3 = new Rectangulo(ancho_total, alto_total);
        return r3;
    }
    
    //suma de rectangulos --> metodo de instancia
    public Rectangulo sumar(Rectangulo otro) {
        return new Rectangulo (ancho + otro.ancho, alto + otro.alto);
    }
    
    //suma de rectangulos --> metodo de clase
    public static Rectangulo sumar(Rectangulo r1, Rectangulo r2) {
        return r1.sumar(r2);
        // return new Rectangulo(r1.ancho + r2.ancho, r1.alto + r2.alto);
    }
    
}
