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
public class Dormitorio extends Habitacion {

    private Orientacion orientacion;
    private Persiana persiana;
    private Luz luces;
    private Camara camara;

    //Constructor por defecto
    public Dormitorio() {
        this.orientacion = NORTE;
        this.luces = new Luz();
        this.camara = new Camara();
        this.persiana= new Persiana();
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
   //Traducir estado persiana
    //Método que traduce el estado de la persiana a uno más natural para el usuario
    //Para ello toma el valor del atributo estado y lanza un mensaje en base a este.

    public void traEstadoPersiana() {
 
        switch (this.persiana.getEstado()) {
     
            case 0:
                System.out.println("Persiana:  bajadas");
                break;
            case 1:
                System.out.println("Persiana: a media altura");
                break;
            case 2:
                System.out.println("Persiana: subidas");
                break;
        }

    }

    //Traducir estado luces
    //Método que traduce el estado de las luces a uno más natural para el usuario
    //Para ello toma el valor del atributo estado y lanza un mensaje en base a este.
    //Si es true esta encendida, false apagada
    
    public void traEstadoLuces() {

        if (this.luces.isEstado() == false) {
            System.out.println("Luces: encendidas");
        } else {
            System.out.println("Luces: apagadas.");
        }
    }
    
       //Traducir estado camara
    //Método que traduce el estado de la camara a uno más natural para el usuario
    //Para ello toma el valor del atributo estado y lanza un mensaje en base a este.
    //true=activada
    //False = no activada
     public void traEstadoCamara() {
        
        if (this.camara.isEstado()==true) {
            System.out.println("Camara: activa");
        }else{
            System.out.println("Camara: no activa");
        }
        
    }

    public void mostrarEstado() {

        System.out.println("------------------Estado Dormitorio---------------------------------");
        System.out.println("Dormitorio");
        this.traEstadoLuces();
        this.traEstadoCamara();
        this.traEstadoPersiana();
     

    }


}
