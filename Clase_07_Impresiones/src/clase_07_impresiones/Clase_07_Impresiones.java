
package clase_07_impresiones;


public class Clase_07_Impresiones {

 
    public static void main(String[] args) {
      
        Impresora impresora = new Impresora();
        
        Documento d = new Documento("Titulo del documento", "Primera linea\nSegunda linea\nTercera linea");
        
        impresora.setOnline();
        impresora.imprimir(d);
        
        Documento escaneado = impresora.escanear();
        
        impresora.imprimir(escaneado);
        
        
    }
    
}
