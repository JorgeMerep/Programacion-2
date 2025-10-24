package sistemaregistroproyectoslaboratorio;

public class SistemaRegistroProyectosLaboratorio {

    public static void main(String[] args) {

        Laboratorio laboratorio = new Laboratorio("Laboratorio Ciencia de Datos");

        cargarProyectos(laboratorio);

        //Escenario 1: Se intenta agregar un Proyecto de Analisis Estaditicos con mismo nombre y equipo responsable        
        try {
            laboratorio.agregarProyecto(new AnalisisEstadisticos("Comportamiento de Usuarios", "DataLab-B", EstadoActual.EN_DESARROLLO, TipoAnalisis.PREDICTIVO));
        } catch (ProyectoRepetidoException exception) {
            System.out.println(exception.getMessage());
        }

        //Escenario 2: Mostrar todos los proyectos registrados con atributos comunes y especificos        
        System.out.println(laboratorio.mostrarProyectos());

        //Escenario 3: Actualizar resultados de los proyectos que lo permiten.
        System.out.println(laboratorio.actualizarResultadosProyecto());

        //Escenario 4: Actualizar el EstadoActual de todos los proyectos
        laboratorio.actualizarEstadoProyectos(EstadoActual.FINALIZADO);

    }

    public static void cargarProyectos(Laboratorio laboratorio) {
        laboratorio.agregarProyecto(new AnalisisEstadisticos("Comportamiento de Usuarios", "DataLab-B", EstadoActual.EN_DESARROLLO, TipoAnalisis.PREDICTIVO));
        laboratorio.agregarProyecto(new AnalisisEstadisticos("Comportamiento de Votantes", "DataLab-C", EstadoActual.FINALIZADO, TipoAnalisis.DESCRIPTIVO));
        laboratorio.agregarProyecto(new MachineLearning("ChatGPT", "OpenIA", EstadoActual.ENTRENANDO_MODELO, 50));
        laboratorio.agregarProyecto(new MachineLearning("Gemini", "Google", EstadoActual.ENTRENANDO_MODELO, 70));
        laboratorio.agregarProyecto(new SistemasVisualizacion("Proyecto Sistema Visualizacion 1", "DataLab-D", EstadoActual.EN_DESARROLLO, 70));
        laboratorio.agregarProyecto(new SistemasVisualizacion("Proyecto Sistema Visualizacion 2", "DataLab-E", EstadoActual.FINALIZADO, 70));

    }

}
