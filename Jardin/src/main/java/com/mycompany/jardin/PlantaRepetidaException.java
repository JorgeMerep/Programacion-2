
package com.mycompany.jardin;

public class PlantaRepetidaException extends RuntimeException {
    
    private static final String MENSAJE = "Planta repetida";
    
    public PlantaRepetidaException(){
        this(MENSAJE);
    }
    
    public PlantaRepetidaException(String mensaje){
        super(mensaje);
    }   
}
