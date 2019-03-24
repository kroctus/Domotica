/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Centralita {

    private String identificador;
    private LocalDate fechaInstanciacion;
    private Reloj reloj;
    private Usuario usuario;
    private Garaje garaje;
    private Salon salon;
    private Dormitorio dormitorio;

    //Constructor
    public Centralita(String identificador, LocalDate fechaInstanciacion, Reloj reloj, Usuario usuario, Garaje garaje, Salon salon, Dormitorio dormitorio) {
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

    public void encenderLuces() {
        System.out.println("¿De qué estancia quiere encender las luces?");
        System.out.println("1-Dormitorio");
        System.out.println("2-Salon");
        System.out.println("3-Garaje");

        int opcion = 4;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();

        switch (opcion) {

            case 1:
                this.dormitorio.getLuces().encenderLuces();
                break;
            case 2:
                this.salon.getLuces().encenderLuces();
                break;
            case 3:
                this.garaje.getLuces().encenderLuces();
                break;
            default:
                throw new AssertionError();
        }

    }

    //Método que apaga todas las luces de de la centralita
    public void apagadoGeneralCentralita() {

        this.dormitorio.getLuces().apagadoGeneral();
        this.garaje.getLuces().apagadoGeneral();;
        this.salon.getLuces().apagadoGeneral();

    }

    //método que gestiona el apagado de las luces en la centralita diferenciando entre las opciones de apagado manual, general o ECO.
    public void apagarLuces() {
        System.out.println("¿Qué tipo de apagado desea?");
        System.out.println("1-Apagado manual");
        System.out.println("2-Apàgado general");
        System.out.println("3-Apagado ECO");

        int opcion = 4;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("¿De cuál estancia deseas apagar las luces?");
                System.out.println("1-Dormitoio");
                System.out.println("2-Salon");
                System.out.println("3-garaje");

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        this.dormitorio.getLuces().apagarLuces();
                        break;
                    case 2:
                        this.dormitorio.getLuces().apagarLuces();
                        break;
                    case 3:
                        this.dormitorio.getLuces().apagarLuces();
                        break;
                }
                break;
            case 2:
                apagadoGeneralCentralita();
                break;
        }

    }

    //Actua dependiendo de la estancia que selecciona el usuario en el método vigilancia
    //En caso de que la hora en que se active este método sea entre las 20:00 y las 8:00 (por la noche) el método encenderá las luces de la estancia seleccionada
    // y las mantendrá así hasta que el usuario decida salir en cuyo caso las luces de apagaran de nuevo
    public void vigilanciaInteligente(int opcionVigilancia) {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        switch (opcionVigilancia) {

            //En caso de que seleccione el salón en el método vigilancia
            case 1:
                //Si es de noche:

                if (this.reloj.getHoraCentralita().isAfter(LocalTime.of(20, 0))
                        && this.reloj.getHoraCentralita().isBefore(LocalTime.of(8, 0))
                        || this.reloj.getHoraActual().isAfter(LocalTime.of(20, 0)) && this.reloj.getHoraActual().isBefore(LocalTime.of(8, 0))
                        && this.salon.getLuces().isEstado() == false) {

                    this.salon.getLuces().setEstado(true);
                    System.out.println("Estas en la camara de vigilancia del salon");

                } else {
                    System.out.println("Estas en la camara del salon");
                }
                preguntarSalidaSalon();

                // si es de día
                if (this.reloj.getHoraCentralita().isAfter(LocalTime.of(8, 0))
                        && this.reloj.getHoraCentralita().isBefore(LocalTime.of(18, 0))
                        || this.reloj.getHoraActual().isAfter(LocalTime.of(8, 0)) && this.reloj.getHoraActual().isBefore(LocalTime.of(18, 0))
                        && this.salon.getPersiana().getEstado() == 0) {

                    this.salon.getLuces().setEstado(true);//Enciende las luces
                    System.out.println("Estas en la camara de vigilancia del salon");
                } else {
                    System.out.println("Estas en la camara de vigilancia del salon");
                }

                //Método preguntar
                preguntarSalidaSalon();
                break;

            //En caso de que seleccione el dormitorio en el método vigilancia
            case 2:

                // si elige el dormitorio y es de noche:
                if (this.reloj.getHoraCentralita().isAfter(LocalTime.of(20, 0))
                        && this.reloj.getHoraCentralita().isBefore(LocalTime.of(8, 0))
                        || this.reloj.getHoraActual().isAfter(LocalTime.of(20, 0)) && this.reloj.getHoraActual().isBefore(LocalTime.of(8, 0))
                        && this.dormitorio.getLuces().isEstado() == false) {

                    this.dormitorio.getLuces().setEstado(true);
                    System.out.println("Estas en la camara de vigilancia del dormitorio");

                } else {
                    System.out.println("Estas en la camara de vigilancia del dormitorio");
                }

                preguntarSalidaDormitorio();

                //si es de dia
                if (this.reloj.getHoraCentralita().isAfter(LocalTime.of(8, 0))
                        && this.reloj.getHoraCentralita().isBefore(LocalTime.of(18, 0))
                        || this.reloj.getHoraActual().isAfter(LocalTime.of(8, 0)) && this.reloj.getHoraActual().isBefore(LocalTime.of(18, 0))
                        && this.dormitorio.getPersiana().getEstado() == 0) {

                    this.dormitorio.getLuces().setEstado(true);//Enciende las luces
                    System.out.println("Estas en la camara de vigilancia del dormitorio");
                } else {
                    System.out.println("Estas en la camara de vigilancia del dormitorio");
                }

                preguntarSalidaDormitorio();

                break;
        }

    }

    //Método que sirve para preguntar al usuario si quiere salir de la vigilancia inteligente
    //En caso de que seleccione "s" (salir) se volverá a ejecutar el método menu()
    //Si selecciona "n" (no salir) se volverá a ajecutar le método vigilancia
    //Uno para el salon y otro para el dormitorio
    public void preguntarSalidaSalon() {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        System.out.println("¿Deseas salir? s/n");
        opcion = teclado.nextLine();

        if (opcion.equalsIgnoreCase("s")) {
            this.salon.getLuces().setEstado(false);
            Vista.menu();
        } else if (opcion.equalsIgnoreCase("n")) {
            vigilanciaInteligente(1);
        }
    }

    public void preguntarSalidaDormitorio() {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        System.out.println("¿Deseas salir? s/n");
        opcion = teclado.nextLine();

        if (opcion.equals("s")) {
            Vista.menu();
        } else if (opcion.equalsIgnoreCase("n")) {
            vigilanciaInteligente(2);
        }

    }

    //Método que se encarga de de acceder a las camaras de las estancias que las tengan bajo la selección del usuario
    //Este método se apoya en el método vigilanciaInteligente para realizar acciones especificas en caso de ser necesario
    public void vigilancia() {
        System.out.println("Bienvenido al apartado de vigilancia, ¿qué estancia desea revisar?");
        System.out.println("1-Salon");
        System.out.println("2-Dormitorio");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                vigilanciaInteligente(1);
                break;
            case 2:
                vigilanciaInteligente(2);
        }
    }

    //Método que recibe y ejecuta las ordenes que selecciona el usuario en el menú
    //Este método recibe un comando y en base a este hace llamadas a los diferentes métodos que realizan la acción que se ajusta al comando.
    public void ejecutarOrden(Comando comando) {

        switch (comando) {

            case APAGAR_SISTEMA:
                System.out.println("El sistema se ha apagado");
                break;

            case CONSULTAR_HORA:
                Reloj.mostarHoraActual();
                break;

            case MODIFICAR_HORA:
                this.reloj.modificarHora();
                break;

            case SUBIR_PUERTA_GARJE:
                this.garaje.subirPuertaGaraje();
                break;
            case CERRAR_PUERTA_GARAJE:
                this.garaje.cerrarPuertaGaraje();

            case CIERRAR_PERSIANA_SALON:
                this.salon.getPersiana().subirPersiana();
                break;
            case ABRIR_PERSIANA_DORMITORIO:
                this.dormitorio.getPersiana().subirPersiana();
                break;
            case CERRAR_PERSIANA_DORMITORIO:
                this.dormitorio.getPersiana().subirPersiana();
                break;

            case ABRIR_PERSIANA_SALON:
                this.salon.getPersiana().subirPersiana();
                break;

            case REVISAR_CAMARA_DORMITORIO:
                vigilancia();
                break;

            case REVISAR_CAMARA_SALON:
               vigilancia();
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
                encenderLuces();
                break;

            case APAGAR_LUCES:
                System.out.println("Se han apagado las luces");
                break;

        }

    }

}
