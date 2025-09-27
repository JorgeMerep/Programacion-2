
package guia_01_08_producto;

/* Clase Producto:
o Desarrolla una clase Producto con atributos nombre, precio, y cantidadEnStock.
o Crea un método para aplicar un descuento al precio del producto.
o Implementa un método para realizar una venta, */

public class Producto {
    
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    
    
    public Producto(String nombre, double precio, int cantidadEnStock) {
        validarPositivo(precio);
        validarPositivo(cantidadEnStock);
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }
    
    private void validarPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    public int getStock() {
        return cantidadEnStock;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    private void validarPorcentaje(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new IllegalArgumentException("Valor invalido");
        }
    }
    
    public void aplicarDescuento(double porcentaje) {
        validarPorcentaje(porcentaje);
        precio = precio * (1 - (porcentaje / 100));
    }
    
    private void validarStock(int cantidad) {
        if (cantidad > cantidadEnStock) {
            throw new IllegalArgumentException("Valor invalido");     
        }
    }
    
    private void actualizarStock(int cantidad) {
        cantidadEnStock -= cantidad;
    }
    
    public void venderProducto(int cantidad) {
        validarPositivo(cantidad);
        validarStock(cantidad);
        actualizarStock(cantidad);
    }
    
}
