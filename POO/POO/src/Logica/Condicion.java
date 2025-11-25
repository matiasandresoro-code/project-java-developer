
package Logica;


public class Condicion {
    
    // ATRIBUTOS
    int nota;
    String cond;
    String desempeño;

    // CONSTRUCTOR VACIO
    public Condicion (){
        
    }
    
    // CONSTRUCTOR CON PARAMETROs
    public Condicion (int n, String c, String d){
        nota = n;
        cond = c;
        desempeño = d;
       
    }
    
    public int getNota (){
        return nota;
    }
    
    public void setNota(int n){
        nota = n;
    }
    
    public String getCond (){
        return cond;
    }
    
    public void setCond (String c){
        cond = c;
    }
    
    public String getDesempeño(){
        return desempeño;
    }
    
    public void setDesempeño(String d){
        desempeño = d;
    }
}
