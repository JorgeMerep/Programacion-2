
package com.mycompany.estacionsubtes;

public abstract class Tarjeta {
    
 private CentralSubtes central;

    public Tarjeta(CentralSubtes central) {
        this.central = central;
    }

    public CentralSubtes getCentral() {
        return central;
    }
    
    protected abstract boolean puedoViajar();
    
    protected abstract void descontarViaje();
   
    public abstract void realizarViaje();
}

