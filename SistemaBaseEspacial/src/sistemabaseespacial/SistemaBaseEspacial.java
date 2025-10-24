package sistemabaseespacial;

public class SistemaBaseEspacial {

    public static void main(String[] args) {
        BaseEspacial base = new BaseEspacial("Base Z-2025");
        
        cargarBaseEspacial(base);
        
        //Escenario 1: Se intenta agregar un astronauta con mismo nombre y modulo que otro ya registrado.
        try {
            base.agregarUnidadOperativa(new Astronauta("Cmdr. Vega", "M1", TipoAtmosfera.PRESURIZADA, 20));
        } catch (UnidadRepetidaException ex){
            System.out.println(ex.getMessage());
        }
        
        //Escenario 2: Listar todas las unidades operativas registradas.
        System.out.println(base.mostrarUnidades());
        
        //Escenario 3: Mover unidades operativas que pueden trasladarse.
        System.out.println(base.moverUnidades());
        
        //Escenario 4: Todas las entidades ejecutan sus tareas básicas de operación.
        System.out.println(base.realizarFuncionesBase());
        
        //Escenario 5: Filtra entidades por tipo de atmósfera en el que operan.
        System.out.println(base.filtrarPorTipoAtmosfera(TipoAtmosfera.PRESURIZADA));
        
    }
    
    public static void cargarBaseEspacial(BaseEspacial b){
        b.agregarUnidadOperativa(new Astronauta("Cmdr. Vega", "M1", TipoAtmosfera.PRESURIZADA, 20));
        b.agregarUnidadOperativa(new Experimento("Colonia de hormigas", "M1", TipoAtmosfera.PRESURIZADA, 16));
        b.agregarUnidadOperativa(new Robot("Genius 2", "M1", TipoAtmosfera.PRESURIZADA, 15));
        b.agregarUnidadOperativa(new Astronauta("Dr. Perez", "M2", TipoAtmosfera.VACIO, 18));
        b.agregarUnidadOperativa(new Robot("Big Mars", "M2", TipoAtmosfera.VACIO, 25));
        b.agregarUnidadOperativa(new Astronauta("Lic. Gutierrez", "M1", TipoAtmosfera.PRESURIZADA, 16)); 
        b.agregarUnidadOperativa(new Experimento("Hidro X", "M2", TipoAtmosfera.VACIO, 10));
        b.agregarUnidadOperativa(new Robot("Explorer", "M2", TipoAtmosfera.VACIO, 12));
        b.agregarUnidadOperativa(new Experimento("Hiper Alimento", "M1", TipoAtmosfera.PRESURIZADA, 7));     
        
    }
    
}
