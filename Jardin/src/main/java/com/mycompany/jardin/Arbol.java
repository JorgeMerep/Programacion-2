
package com.mycompany.jardin;


public class Arbol extends Planta implements Podable{
    private double alturaMaxima;

    public Arbol(String nombre, String ubicacion, String clima, double alturaMaxima) {
        super(nombre, ubicacion, clima);
        validarAltura(alturaMaxima);
        this.alturaMaxima = alturaMaxima;
    }
    
    
    private void validarAltura(double altura){
        if (altura < 0){
            throw new IllegalArgumentException("Altura invalida");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Arbol{" + "alturaMaxima=" + alturaMaxima + '}';
    }
    
    
    @Override
    public String podar(){
        return "El arbol " + getNombre() + " esta siendo podado";
        
    }
       
}
