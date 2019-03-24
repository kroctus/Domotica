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

    public String mostarEstadoCentralita() {
        return toString();

    }

    @Override
    public String toString() {
        return identificador + "\t fecha de Instanciación=" + fechaInstanciacion
                + " \t reloj: =" + reloj + ", "
                + ", garaje=" + garaje
                + ", salon=" + salon
                + ", dormitorio=" + dormitorio + '}';
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

    public void ejecutarOrden(Comando comando) {

        switch (comando) {

            case APAGAR_SISTEMA:
                System.out.println("El sistema se ha apagado");
                break;

            case CONSULTAR_HORA:
                Reloj.mostarHoraActual();
                break;
                
            case MODIFICAR_HORA:
                Reloj.modificarHora();
                break;

            case SUBIR_PUERTA_GARJE:
                System.out.println("La puerta del garaje se ha subido");
                break;
            case CIERRAR_PERSIANA_SALON:
                System.out.println("LAs persianas del salon se han cerrado");
                break;
            case ABRIR_PERSIANA_DORMITORIO:
                System.out.println("Las persianas del dormitorio de han abierto");
                break;
            case CERRAR_PERSIANA_DORMITORIO:
                System.out.println("Las persianas del dormitorio se han cerrado");
                break;

            case ABRIR_PERSIANA_SALON:
                System.out.println("Las persianas del salon se han abierto");
                break;

            // case 8:
            //  return Comando.CIERRAR_PERSIANA_SALON;
            case REVISAR_CAMARA_DORMITORIO:
                System.out.println("Estas en la camara del dormitorio");
                break;

            case REVISAR_CAMARA_SALON:
                System.out.println("Estas en la camara del salón");
                break;

            case REVISAR_CAMARA_GARAJE:
                System.out.println("Estas en la camara del garaje");
                break;

            case MOSTRAR_ESTADO_SALON:
                System.out.println("Se muestra el estado del salon");
                break;

            case MOSTRAR_ESTADO_GARAJE:
                System.out.println("Se muestra el estado del garaje");
                break;

            case MOSTRAR_ESTADO_DORMITORIO:
                System.out.println("Se muestra el estado del dormitorio");
                break;

            case MOSTAR_ESTADO_GENERAL:
                System.out.println("Se muestra el estado general");
                break;

            case ENCENDER_LUCES:
                System.out.println("Se han encendido las luces");
                break;

            case APAGAR_LUCES:
                System.out.println("Se han apagado las luces");
                break;

            case APAGAR_LUCES_DORMITORIO:
                System.out.println("se han apagado las luces del dormitorio");
                break;
            case APAGAR_LUCES_SALON:
                System.out.println("Se han apagado las luces del salon");
                break;

            case APAGAR_LUCES_GARAJE:
                System.out.println("Se han apagado las luces del garaje");
                break;
        }

    }

}
