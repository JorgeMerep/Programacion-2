package estacionamiento.auto;

import java.util.ArrayList;

public class Estacionamiento {

    private String nombre;
    private ArrayList<Auto> autos;

    public Estacionamiento(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    public void agregarAuto(Auto nuevoAuto) {
        checkNull(nuevoAuto, null);
        if (autos.contains(nuevoAuto)) {
            throw new IllegalArgumentException("Auto repetido");
        }
        autos.add(nuevoAuto);
    }

    private void checkNull(Object o, String mensaje) {
        if (o == null) {
            throw new IllegalArgumentException((mensaje == null) ? "Objeto nulo" : mensaje);
        }
    }

    public int cantidadAutos() {
        return autos.size();
    }

    public boolean estaVacio() {
        return autos.isEmpty();
    }

    public String autosString() {
        StringBuilder lista = new StringBuilder();
        for (Auto a : autos) {
            lista.append(a + "\n");
        }
        return lista.toString();
    }

    /*
    public ArrayList<Auto> getAutos() {
        return new ArrayList<>(autos); //se retorna una copia de la lista (NO la lista original).
    }*/
    private Auto buscarAuto(String patente) {
        for (Auto auto : autos) {
            if (auto.tienePatente(patente)) {
                return auto;
            }
        }
        return null;
    }

    public boolean estaAuto(String patente) {
        return buscarAuto(patente) != null;
    }

    public Auto sacarAuto(String patente) {
        return autos.remove(autos.indexOf(buscarAuto(patente)));
    }

    public void vaciarEstacionamiento() {
        autos.clear();
    }

}
