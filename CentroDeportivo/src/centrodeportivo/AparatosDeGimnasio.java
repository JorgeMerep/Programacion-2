
package centrodeportivo;


public class AparatosDeGimnasio extends Equipamiento implements UsableADiario{

    private double pesoMaximoSoportado;

    public AparatosDeGimnasio(String nombre, String sector, IntensidadDeUsoRecomendada nivelUso, double pesoMaximoSoportado) {
        super(nombre, sector, nivelUso);
        this.pesoMaximoSoportado = pesoMaximoSoportado;
    }
    
    
   
    @Override
    public void prepararParaUsoDiario() {
        System.out.println("Preparando equipos de gimnasio");
    }

    @Override
    public String toString() {
        return super.toString() + " AparatosDeGimnasio{" + "pesoMaximoSoportado=" + pesoMaximoSoportado + '}';
    }
    
    
    
}
