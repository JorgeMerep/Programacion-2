package almacengenerico;


public interface GestionAlmacenable {
    
    static void mostrarContenido(Almacenable<?> almacenable) {
        if(almacenable.estaVacio()) {
            System.out.println("Almacen vacio");
        } else {
            System.out.println("Items del almacen");
            for(Object item : almacenable) {
                System.out.println(item);
            }
        }
    };
}
