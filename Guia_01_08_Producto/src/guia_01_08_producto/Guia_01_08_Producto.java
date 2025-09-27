
package guia_01_08_producto;


public class Guia_01_08_Producto {

    
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Prod A", 500, 10);
        
        System.out.println("Precio: " + p1.getPrecio());
        
        p1.aplicarDescuento(50);
        System.out.println("Precio: " + p1.getPrecio());
        
        System.out.println("Stock: " + p1.getStock());
        p1.venderProducto(3);
        
        System.out.println("Stock: " + p1.getStock());
    }
    
}
