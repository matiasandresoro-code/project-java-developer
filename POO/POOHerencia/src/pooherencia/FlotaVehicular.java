
package pooherencia;

import java.util.ArrayList;


public class FlotaVehicular {
    
    private ArrayList<Vehiculo> flota;
    
    
 
    
    public FlotaVehicular(){
        
        this.flota = new ArrayList<>();
        
       
    }
    
    public void agregarVehiculo (Vehiculo v){
        this.flota.add(v);
        System.out.println("Vehiculo agregado a la flota: " + v.getClass().getSimpleName());
    }
    
    public void mostrarFlota(){
        System.out.println("\n----DETALLE COMPLETO DE LA FLOTA----");
        for(Vehiculo v : flota){
            v.mostrarDatosBase();
            System.out.println("---------------");
        }
        
    }
    
    
    
}
