
package pooherencia;


public class Motocicleta extends Vehiculo{
    
    private int cilindradaCC;
    
    public Motocicleta(){
        
    }
    
    public Motocicleta(String marca, String modelo, int cilindradaCC){
        super(marca, modelo);
        this.cilindradaCC = cilindradaCC;
        
    }
    
    @Override
    public void mostrarDatosBase(){
        super.mostrarDatosBase();
        System.out.println(cilindradaCC);
    }
    
}
