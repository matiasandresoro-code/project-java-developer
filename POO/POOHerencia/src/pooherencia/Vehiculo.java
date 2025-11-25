
package pooherencia;


public class Vehiculo {
    
    private String marca, modelo;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    public void mostrarDatosBase(){
        System.out.println(marca);
        System.out.println(modelo);
        
    }
    
    
}
