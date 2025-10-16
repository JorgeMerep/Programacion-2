package gimnasio;
import java.util.ArrayList;


public class Gimnasio {
    
    private String nombre;
    private String direccion;
    private ArrayList<Entrenador> entrenadores;

    public Gimnasio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.entrenadores = new ArrayList<>();
    }
    
    private void validarEntrenador(Entrenador e) {
        if(e == null) {
            throw new IllegalArgumentException("NO ES ENTRENADOR");
        }
    }
    
    public void agregarEntrenador(Entrenador e) {
        validarEntrenador(e);
        entrenadores.add(e);
    }
    
    public void mostrarSueldos() {
        StringBuilder strBuilder = new StringBuilder();
        
        strBuilder.append(Utils.getHeaderTable());
        strBuilder.append(Utils.obtenerSepHorizontal(39));
        
        for(Entrenador e : entrenadores) {
            strBuilder.append(e.mostrarSueldo());
        }
        
        strBuilder.append(Utils.obtenerSepHorizontal(39));
        System.out.println(strBuilder.toString());
    }
    
    public PersonalTrainer entrenadorConMasClientes() {
        PersonalTrainer p1 = null;
        
        for(Entrenador e : entrenadores) {
            if(e instanceof PersonalTrainer p2) {
                if(p1 == null || p1.getCantClientes() < p2.getCantClientes()) {
                    p1 = p2;
                }
            }
        }
        return p1;
    }
    
}
