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
public class Puerta {
    
    private boolean estado;
    private int retardo; //Lo que tarda en abrir y cerrar en segundos
    
    //Constructor

    public Puerta() {
        this.estado=false;
        this.retardo=4;
    }
    //Constructor parametrizado
        public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }
    
    
    
    
    
    //Getters

    public boolean isEstado() {
        return estado;
    }

    public int getRetardo() {
        return retardo;
    }
    
    //Setters

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }
    
    //   //Traducir estado Puerta
    //Método que traduce el estado de las puertas a uno más natural para el usuario
    //Para ello toma el valor del atributo estado y lanza un mensaje en base a este.
    //Si es true esta encendida, false apagada
    
    public void traEstadoPuerta(){
        if (estado==false) {
            System.out.println("Puerta: cerrada");
        }else{
            System.out.println("Estado: Abierta");
        }
    }
    
    
}
