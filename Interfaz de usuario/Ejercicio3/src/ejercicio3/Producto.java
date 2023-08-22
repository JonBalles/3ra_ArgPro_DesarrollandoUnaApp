package ejercicio3;


public class Producto {
    private String producto;
    private double precio;
    private String categoria;

    public Producto(String producto, double precio, String categoria) {
        this.producto = producto;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }
    
   @Override
   public String toString(){
       return "Producto: " + producto + " | Precio: " + precio; 
   }
    
}
