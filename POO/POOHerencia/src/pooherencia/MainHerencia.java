
package pooherencia;

public class MainHerencia {

 
    public static void main(String[] args) {
        
       FlotaVehicular flota = new FlotaVehicular();
       
       Camion camion1 = new Camion("Volvo", "VH12", 32.00);
       Camion camion2 = new Camion("Mercedez Benz", "1636", 31.97);
       Auto auto1 = new Auto("VolksWagen", "Polo", 5);
       Auto auto2 = new Auto("Chevrolet", "Onix", 4);
       Motocicleta moto1 = new Motocicleta("Yamaha", "YBR 125", 250);
       Motocicleta moto2 = new Motocicleta("Kawasaki", "ZLR", 600);
       
       
       flota.agregarVehiculo(camion1);
       flota.agregarVehiculo(camion2);
       flota.agregarVehiculo(auto1);
       flota.agregarVehiculo(auto2);
       flota.agregarVehiculo(moto1);
       flota.agregarVehiculo(moto2);
       
       flota.mostrarFlota();
        
        
        
        
        
       
        
    }
    
}
