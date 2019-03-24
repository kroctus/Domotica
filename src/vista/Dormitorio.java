/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static vista.Orientacion.NORTE;

/**
 *
 * @author gabriel
 */
public class Dormitorio  extends Habitacion{
    
    private Orientacion orientacion;
    private Persiana persiana;
    private Luz luces;
    private Camara camara;
    
    //Constructor por defecto

    public Dormitorio() {
        this.orientacion=NORTE;
        this.luces=new Luz();
        this.camara= new Camara();
    }
    

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
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
        
        System.out.println("------------------Estado Dormitorio---------------------------------");
        System.out.println("Dormitorio");
        this.persiana.traEstadoPersiana();
        this.luces.traEstadoLuces();
        this.camara.traEstadoCamara();
        
    }
   
 
    
   

}
