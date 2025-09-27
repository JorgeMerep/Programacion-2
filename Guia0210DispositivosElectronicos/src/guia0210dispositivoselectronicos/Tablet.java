package guia0210dispositivoselectronicos;

public class Tablet extends DispositivoElectronico {
    private boolean lapizActivo;
    
    public Tablet(String marca, String modelo){
        super(marca, modelo);
    }
    
    public void activarLapiz() {
        lapizActivo = !lapizActivo;
    }
}
