
package pooherencia;


public class Camion extends Vehiculo{
    
    private double capacidadCarga;
    
    public Camion (){
    }

    public Camion (String marca, String modelo, double capacidadCarga){
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
        
    }
    
    @Override
    public void mostrarDatosBase() {
        super.mostrarDatosBase();
        System.out.println(capacidadCarga);
    }

    
    
    
    
    
}
