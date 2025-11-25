
package Logica;


public class POO {

   
    public static void main(String[] args) {
      
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Matias", "Oro");
        
        Condicion cond1 = new Condicion();
        Condicion cond2 = new Condicion(8, "Aprobado", "Excelente");
        
        
        
        System.out.println("LA id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre() + " " + alu2.getApellido());
        System.out.println("LA nota del alumno es: " + cond2.getNota()+ ". Su condicion es "+ cond2.getCond()+ " y su desempeño fue "+ cond2.getDesempeño());
        
        System.out.println("------------------------");
        
        alu1.setId(8);
        alu1.setNombre("Julieta");
        alu1.setApellido("Senstiu");
        
        cond1.setNota(4);
        cond1.setCond("Desaprobado");
        cond1.setDesempeño("Desastroso");
        
        System.out.println("LA id del alumno 2 es: " + alu1.getId());
        System.out.println("El nombre es: "+ alu1.getNombre() + " " + alu1.getApellido());
        System.out.println("La nota del alumno es: "+cond1.getNota()+ ". Su condicion es " + cond1.getCond()+" y su desempeño fue "+ cond1.getDesempeño());
        
        
        System.out.println("------------------------");
        
        alu2.setId(35);
        
        System.out.println("------------------------");
        
        System.out.println("LA id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: "+ alu2.getNombre() + " " + alu2.getApellido());
        
        
        
    }
    
}
