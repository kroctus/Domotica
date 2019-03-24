/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author gabriel
 */
public class Salon extends Habitacion {
    
    private boolean terraza;
    private Persiana persiana;
    private Luz luces;
     private Camara camara;
     
     
     //Constructor por defecto

    public Salon() {
        this.terraza=true;
        this.persiana= new Persiana();
        this.luces= new Luz();
        this.camara= new Camara();
    }
    
    //Parametrizado

    public Salon(boolean terraza, Persiana persiana, Luz luces, Camara camara) {
        this.terraza = terraza;
        this.persiana = persiana;
        this.luces = luces;
        this.camara = camara;
    }
    
    
     
     

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }

    public Luz getLuces() {
        return luces;
    }

    public void setLuces(Luz luces) {
        this.luces = luces;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }
    
     public void mostrarEstado(){
        
        System.out.println("------------------Estado Salon---------------------------------");
        System.out.println("Salon");
        this.persiana.traEstadoPersiana();
        this.luces.traEstadoLuces();
        this.camara.traEstadoCamara();
        
    }
    
    
    
    
   
    
    
    
    
}
