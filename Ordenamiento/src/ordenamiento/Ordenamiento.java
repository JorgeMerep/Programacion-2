package ordenamiento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>(List.of(3,2,7,5,9,3,1));
        List<String> nombres = new ArrayList<>(List.of("Juan", "Analia", "Luis", "Daniela"));
        List<Persona> personas = new ArrayList<>(List.of(
            new Persona(9234, "Juan", 'M', 1.6, new Fecha(1,1,1986), Nacionalidad.ARGENTINA),
            new Persona(8567, "Maria", 'F', 1.7, new Fecha(5,6,1987), Nacionalidad.URUGUAYA),
            new Persona(6985, "Ana", 'F', 1.65, new Fecha(10,11,1988), Nacionalidad.CHILENA)));
        
        
        //numeros.sort(null);    // 1ra forma
        //Collections.sort(numeros);   // 2da forma con compareTo natural
        //Collections.sort(personas);   // 2da forma con compareTo personalizado
        //Collections.sort(personas, new ComparadorPersonaNombre());   // 3ra forma
        Collections.sort(personas, new ComparadorPersonaGenNom());   // 4ta forma
        
        //Comparator<Persona> c = new ComparadorPersonaNombre();
        //ComparadorPersonaNombre c = new ComparadorPersonaNombre();
        
        //mostrarLista(numeros);
        mostrarLista(personas);
    }
    
    public static void mostrarLista(List<?> lista) {
        for(Object o : lista)
        System.out.println(o);
    }
    
}
