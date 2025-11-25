
package pooherencia;


public class Auto extends Vehiculo{
    
    private int cantidadPuertas;
    
    public Auto(){
        
    }
    
    public Auto(String marca, String modelo, int cantidadPuertas){
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarDatosBase(){
        super.mostrarDatosBase();
        System.out.println(cantidadPuertas);
    }
    
    

}
