package clase_04_tv;

public class ControlRemoto {
    
    private Televisor tv;
    
    public ControlRemoto() {
        
    }
    
    public void setTv(Televisor tv) {
        this.tv = tv;
    }
    
    public void encender() {
        if (tv != null) {
            tv.power();
        }
    }
    
    public void subirCanal() {
        if (tv != null) {
            tv.subirCanal();
    }
    
}
