
package clase_07_impresiones;

public class Impresora {
    
    private boolean online;
    
    public void setOnline() {
        online = true;
    }
    
    private void validarOnline() {
        if (!online) {
            throw new IllegalStateException("Impresora offline");
        }
    }
    
    public void imprimir(Documento doc) {
        validarOnline();
        System.out.println(doc.getTitulo());
        System.out.println(doc.getCuerpo());
    }
    
    public Documento escanear() {
        validarOnline();
        return new Documento("Titulo escaneado", "Cuerpo del documento escaneado");
    }
    
    public void copiar() {
        imprimir(escanear());
    }
    
}
