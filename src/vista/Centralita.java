/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;

/**
 *
 * @author gabriel
 */
public class Centralita {
    
    private String identificador;
    private LocalDate fechaInstanciacion;
    private Reloj reloj;
    private Usuario usuario;
    private Estancias garaje;
    private Estancias salon;
    private Estancias dormitorio;
    
    
    //Constructor

    public Centralita(String identificador, LocalDate fechaInstanciacion, Reloj reloj, Usuario usuario, Estancias garaje, Estancias salon, Estancias dormitorio) {
        this.identificador = identificador;
        this.fechaInstanciacion = fechaInstanciacion;
        this.reloj = reloj;
        this.usuario = usuario;
        this.garaje = garaje;
        this.salon = salon;
        this.dormitorio = dormitorio;
        
    }

    public Centralita() {
    }

  
    
    //Getters

    public String getIdentificador() {
        return identificador;
    }

    public LocalDate getFechaInstanciacion() {
        return fechaInstanciacion;
    }

    public Reloj getReloj() {
        return reloj;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Estancias getGaraje() {
        return garaje;
    }

    public Estancias getSalon() {
        return salon;
    }

    public Estancias getDormitorio() {
        return dormitorio;
    }

    

    //Setters

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setFechaInstanciacion(LocalDate fechaInstanciacion) {
        this.fechaInstanciacion = fechaInstanciacion;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setGaraje(Estancias garaje) {
        this.garaje = garaje;
    }

    public void setSalon(Estancias salon) {
        this.salon = salon;
    }

    public void setDormitorio(Estancias dormitorio) {
        this.dormitorio = dormitorio;
    }

   public void ejecutarOrden(Comando comando){
       
       switch(comando){

           case APAGAR_SISTEMA:
               
               break;
               
           case CONSULTAR_HORA:
               Reloj.mostarHoraActual();
               break;
       }
       
   }
    
    
    
}
