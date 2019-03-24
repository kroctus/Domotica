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
public class Camara {

    private boolean estado;
    private String ip; //La direcció IP de la camara.
    
    //constructores

    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    public Camara() {
        this.estado=false;
        this.ip="0500.5452.054";
    }
    
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    //Traducir estado camara
    //Método que traduce el estado de la camara a uno más natural para el usuario
    //Para ello toma el valor del atributo estado y lanza un mensaje en base a este.
    //true=activada
    //False = no activada
    
    public void traEstadoCamara() {
        
        if (estado==true) {
            System.out.println("Camara: activa");
        }else{
            System.out.println("Camara: no activa");
        }
        
    }

}
