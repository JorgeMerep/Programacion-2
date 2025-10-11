package com.mycompany.jardin;

import java.util.ArrayList;

public class JardinBotanico {

    private String nombre;
    private ArrayList<Planta> plantas;

    public JardinBotanico(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public void agregarPlantas(Planta planta) {
        validarPlanta(planta);
        plantas.add(planta);
    }

    private void validarPlanta(Planta planta) {
        if (plantas.contains(planta)) {
            throw new PlantaRepetidaException();
        }
    }

    public String mostrarPlantas() {

        StringBuilder sb = new StringBuilder();
        for (Planta planta : plantas) {
            sb.append(planta.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String podarPlantas() {

        StringBuilder sb = new StringBuilder();
        for (Planta planta : plantas) {
            if (planta instanceof Podable podable) {
                sb.append(podable.podar());
                sb.append("\n");
            } else {
                sb.append("La planta " + planta.getNombre() + " no puede ser podada.");
                sb.append("\n");

            }
        }
        return sb.toString();
    }
}
