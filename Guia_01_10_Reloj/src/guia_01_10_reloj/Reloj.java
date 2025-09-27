
package guia_01_10_reloj;

/*Clase Reloj:
o Diseña una clase Reloj con atributos hora, minuto, y segundo.
o Implementa métodos para ajustar la hora, minuto y segundo.
o Crea un método que permita avanzar el reloj un segundo, asegurando que los valores de hora, minuto y segundo se mantengan correctos.
*/

public class Reloj {
    
    private int hora;
    private int minuto;
    private int segundo;
    private int nextHora;
    private int nextMinuto;
    private int nextSegundo;
    
    private static final int MAX_HORA = 23;
    private static final int MAX_MIN_SEG = 59;
    private static final int MIN_HMS = 0;
    
    private void validarHora(int valor) {
        if (valor < MIN_HMS || valor > MAX_HORA){
            throw new IllegalArgumentException("Valor invalido");
        }
    }

    private void validarMinSeg(int valor) {
        if (valor < MIN_HMS || valor > MAX_MIN_SEG) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    public void setHora(int hora) {
        validarHora(hora);
        this.hora = hora;
    }
    
    public void setMinuto(int minuto) {
        validarMinSeg(minuto);
        this.minuto = minuto;
    }
    
    public void setSegundo(int segundo) {
        validarMinSeg(segundo);
        this.segundo = segundo;
    }    
    
    public int getHora() {
        return hora;
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    public int getSegundo() {
        return segundo;
    }
    
    private void resetHora() {
        hora = MIN_HMS;
        nextHora = MIN_HMS;
    }
    
    private void resetMinuto() {
        minuto = MIN_HMS;
        nextMinuto = MIN_HMS;
    }
    
    private void resetSegundo() {
        segundo = MIN_HMS;
        nextSegundo = MIN_HMS;
    }
    
    private void avanzarMinuto() {
        nextMinuto = minuto + 1;
        if (nextMinuto > MAX_MIN_SEG) {
            resetMinuto();
            avanzarHora();
        }
        else minuto++;
    }
    
    private void avanzarHora() {
        nextHora = hora + 1;
        if (nextHora > MAX_HORA) {
            resetHora();
        }
        else hora++;
    }
    
    public void avanzarSegundo() {
        nextSegundo = segundo + 1;
        if (nextSegundo > MAX_MIN_SEG) {
            resetSegundo();
            avanzarMinuto();
        }
        else segundo++;
    }
    
}