package almacengenerico;

public class PruebaAlmacen {

    public static void main(String[] args) {
        // ==== 1. Probar con Strings ====
        System.out.println("=== ALMACÉN DE STRINGS ===");
        Almacen<String> palabras = new Almacen<>();
        palabras.agregar("Java");
        palabras.agregar("Python");
        palabras.agregar("C++");
        GestionAlmacenable.mostrarContenido(palabras);

        System.out.println("Tamanio: " + palabras.tamanio());
        System.out.println("Contiene 'Python': " + palabras.contiene("Python"));
        System.out.println("Elemento en posicion 1: " + palabras.obtener(1));
        palabras.eliminar("Python");
        System.out.println("Luego de eliminar 'Python':");
        GestionAlmacenable.mostrarContenido(palabras);
        
        System.out.println("Esta vacio? " + palabras.estaVacio());
        palabras.limpiar();
        System.out.println("Luego de limpiar:");
        GestionAlmacenable.mostrarContenido(palabras);

// ==== 2. Probar con Integer ==== System.out.println("\n=== ALMACEN DE ENTEROS ===");
        Almacen<Integer> numeros = new Almacen<>();
        for (int i = 1; i <= 5; i++) {
            numeros.agregar(i * 10);
        }
        System.out.println("Recorrido con for-each:");
        for (Integer n : numeros) {
            System.out.println(" * " + n);
        }
        System.out.println("Contiene 30: " + numeros.contiene(30));
        numeros.eliminar(20);
        System.out.println("Despues de eliminar 20:");
        GestionAlmacenable.mostrarContenido(numeros);
// ==== 3. Probar con Productos ==== System.out.println("\n=== ALMACEN DE PRODUCTOS ===");
        Almacen<Producto> productos = new Almacen<>();
        productos.agregar(new Producto(1, "Leche", 1500, Tipo.ALIMENTO));
        productos.agregar(new Producto(2, "Celular", 250000, Tipo.ELECTRONICO));
        productos.agregar(new Producto(3, "Campera", 42000, Tipo.ROPA));
        GestionAlmacenable.mostrarContenido(productos);
        System.out.println("Tamanio: " + productos.tamanio());
        System.out.println("Contiene id=2: " + productos.contiene(new Producto(2, "X", 0, Tipo.ELECTRONICO)));
        productos.eliminar(new Producto(1, "X", 0, Tipo.ALIMENTO));
        System.out.println("Luego de eliminar id=1:");
        GestionAlmacenable.mostrarContenido(productos);
        System.out.println("Vacio? " + productos.estaVacio());
        productos.limpiar();
        System.out.println("Despues de limpiar:");
        GestionAlmacenable.mostrarContenido(productos);
    }
}
