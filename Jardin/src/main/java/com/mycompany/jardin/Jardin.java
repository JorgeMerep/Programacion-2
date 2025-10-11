/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jardin;


public class Jardin {

    public static void main(String[] args) {
        
        JardinBotanico jardin = new JardinBotanico("BaussGarden");
        
        Planta arbol1 = new Arbol("Roble", "Norte", "Frio", 3.5);
        Planta arbol2 = new Arbol("Nogal", "Sur", "Calor", 7.5);
        
        Planta arbusto1 = new Arbusto("Arbustin", "Oeste", "Templado", 5);
        Planta arbusto2 = new Arbusto("Arbustobulo", "Este", "Humedo", 2);
      
        Planta flor1 = new Flor("Rosa", "Noreste", "Calor", TemporadaFlorecimiento.VERANO);
        Planta flor2 = new Flor("Jazmin", "Sudeste", "Frio", TemporadaFlorecimiento.OTONIO);
        
        
        jardin.agregarPlantas(arbol1);
        jardin.agregarPlantas(arbol2);
        jardin.agregarPlantas(arbusto1);
        jardin.agregarPlantas(arbusto2);
        jardin.agregarPlantas(flor1);
        jardin.agregarPlantas(flor2);
        
        System.out.println(jardin.mostrarPlantas());
        
        System.out.println(jardin.podarPlantas());
        
  
    }
}
