package ordenamiento;

import java.util.Comparator;


public class ComparadorPersonaGenNom implements Comparator<Persona>{

    @Override
    public int compare(Persona p1, Persona p2) {
        int cmp = Character.compare(p1.getGenero(), p2.getGenero());
        if(cmp == 0) {
            cmp = p1.getNombre().compareTo(p2.getNombre());
        }
        return cmp;
    }
}
