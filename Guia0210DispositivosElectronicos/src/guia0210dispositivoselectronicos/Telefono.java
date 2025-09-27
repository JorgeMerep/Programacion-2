package guia0210dispositivoselectronicos;

public class Telefono extends DispositivoElectronico {
      
    public Telefono(String marca, String modelo){
        super(marca, modelo);
    }
    
    public String llamarTelefono(String numero) {
        return "Llamando a " + numero;
    }
    
}
