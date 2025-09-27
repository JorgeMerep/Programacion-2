
package guia_01_03_persona;

/*
o Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
o Implementa un método esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
o Agrega un método para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
*/

public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private static final int EDAD_MAYOR = 18;
    
    public Persona(String nombre, int edad, double altura) {
        validarEdad(edad);
        validarAltura(altura);
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    private void validarEdad(int edad) {
        if (!(edad >= 0 && edad <= 120)) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    private void validarAltura(double altura) {
        if (!(altura >= 0.5 && altura <= 2.5)) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    public boolean esMayorDeEdad() {
        return edad >= EDAD_MAYOR;
    }
    
    public double calcularIMC(double peso) {
        return peso / (altura * altura);
    }
    
}
