package centrodeportivo;

public class CentroDeportivo {

    public static void main(String[] args) {

        CentroEntrenamientoDeportivo gimnasio = new CentroEntrenamientoDeportivo("GYM");
        cargandoCentroDeportivo(gimnasio);
        gimnasio.mostrarEquipos();
        gimnasio.prepararEquipos();
        gimnasio.filtrarPorNivelDeUso(IntensidadDeUsoRecomendada.BAJA);
        gimnasio.filtrarPorNivelDeUso(IntensidadDeUsoRecomendada.MEDIA);
        gimnasio.filtrarPorNivelDeUso(IntensidadDeUsoRecomendada.ALTA);
    }

    public static void cargandoCentroDeportivo(CentroEntrenamientoDeportivo gimnasio) {

        Equipamiento equipo1 = new AparatosDeGimnasio("Bicicleta Estatica", "Cardio", IntensidadDeUsoRecomendada.MEDIA, 500);
        Equipamiento equipo2 = new AparatosDeGimnasio("Prensa", "Pesas", IntensidadDeUsoRecomendada.ALTA, 200);

        Equipamiento equipo3 = new InstrumentosParaDeportesDeEquipo("Paleta", "Final", IntensidadDeUsoRecomendada.MEDIA, "Tenis");
        Equipamiento equipo4 = new InstrumentosParaDeportesDeEquipo("Pelota", "Entrada", IntensidadDeUsoRecomendada.BAJA, "Futbol");

        Equipamiento equipo5 = new EquiposDeEntramientoAlAireLibre("Colchoneta", "Patio", IntensidadDeUsoRecomendada.ALTA, 10);
        Equipamiento equipo6 = new EquiposDeEntramientoAlAireLibre("Guantes", "Patio", IntensidadDeUsoRecomendada.MEDIA, 5);

        Equipamiento equipo7 = new AparatosDeGimnasio("Bicicleta Estatica", "Cardio", IntensidadDeUsoRecomendada.MEDIA, 500);
        Equipamiento equipo8 = null;

        try {
            gimnasio.agregarEquipos(equipo1);
            gimnasio.agregarEquipos(equipo2);
            gimnasio.agregarEquipos(equipo3);
            gimnasio.agregarEquipos(equipo4);
            gimnasio.agregarEquipos(equipo5);
            gimnasio.agregarEquipos(equipo6);
            gimnasio.agregarEquipos(equipo7);
            gimnasio.agregarEquipos(equipo8);
        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

    }

}
