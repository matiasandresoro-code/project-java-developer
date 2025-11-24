
package poo.segun.gemini;

import java.util.ArrayList;


public class Tienda {

   
    public static void main(String[] args) {
//        
//        Producto prod1 = new Producto("Leche", 1500, 4);
//        Producto prod2 = new Producto("Laptop", 130000.41, 7);
//        
//        
//        prod1.mostrarDetalle();
//        prod2.mostrarDetalle();
//        
//        System.out.println("-----------------------------");
//        
//        prod1.setPrecio(1700);
//        
//        prod1.mostrarDetalle();
//        
//      
//        System.out.println("-----------------------------");
//        
//        prod1.setPrecio(-1500);
//        prod1.mostrarDetalle();
//        System.out.println("-----------------------------");
        
        ArrayList<Producto> inventario = new ArrayList<>();
        
        Producto prod1 = new Producto("Leche", 1500, 4);
        Producto prod2 = new Producto("Laptop", 130000.41, 7);
        
        
        inventario.add(prod1);
        inventario.add(prod2);
        
        for(Producto p : inventario){
            p.mostrarDetalle();
        }
        
        
        
        
        
                

        
        
        
        
        
    }
    
    
    
}
