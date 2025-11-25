
package Logica;


public class Alumno {
    
    // ATRIBUTOS
    int id ;
    String nombre;
    String apellido;

    // CONSTRUCTOR VACIO
    public Alumno() {
        
    }

    // CONSTRUCTOR CON PARAMETROs
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    // METODOS GET Y SET. Se 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    
    // METODOS PROPIOS
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se decir mi nombre");
        
    }
    
    public void saberAprobado(double calificacion){
        if (calificacion >= 6){
            System.out.println("Aprobe la materia");
            
        }else {
            System.out.println("Uyy no aprobe");
        }
    }
}
