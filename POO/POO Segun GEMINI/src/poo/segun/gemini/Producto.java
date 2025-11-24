
package poo.segun.gemini;


public class Producto {
    
    // ATRIBUTOS (VARIABLES/CARACTERISTICAS)
    
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPrecio(double precio){
        if (precio > 0){
            this.precio = precio;
        }
    }
    
    public void mostrarDetalle(){
        System.out.println("El precio del producto " + nombre + " es "+ precio + " y hay en stock " + stock + " unidades.");
    }
    
}
