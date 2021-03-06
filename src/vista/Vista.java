/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Vista {

    //Identificar las distintas acciones que realiza el usuario
    private static Scanner teclado = new Scanner(System.in);

    public static Usuario login(Centralita aux) {

        //Método que recibre una centralita y que se encarga de realizar un login a dicha centralita, comparando el usuario y contraseña de la centralita en cuestion
        //con los que introduce el usuario, en caso de ser coreecto realizará una llamada al método menu(), por el contrario preguntará el usuario hasta que los datos sean correctos
        // o se acaben sus oportunidades en este caso 5
        int contadorOportunidades = 0;//Se encarga de guardar el número de oportunidades que tiene el usuario para introducir bien los datos
        System.out.println("Introduce el usuario: ");
        String user = teclado.nextLine();
        System.out.println("Introduce la contraseña: ");
        String contra = teclado.nextLine();
        Usuario user1 = new Usuario(user, contra);
        Usuario user2= new Usuario ();
        if (!(user.equals(aux.getUsuario().getUsuario()) && contra.equals(aux.getUsuario().getContraseña()))) {
            System.out.println("El usuario o la contraseña no son corrector por favor introduzaca de nuevo:");

            do {
                System.out.println("Usuario: ");
                user = teclado.nextLine();
                System.out.println("Contraseña: ");
                contra = teclado.nextLine();

                if (!(user.equals(aux.getUsuario().getUsuario()) && contra.equals(aux.getUsuario().getContraseña()))) {
                    System.out.println("El usuario o la contraseña no son corrector por favor introduzaca de nuevo:");
                    contadorOportunidades++;
                    System.out.println("Intentos restantes: " + (5 - contadorOportunidades));
                    
                } else {
                    System.out.println("Login completado con exito");
                    System.out.println("");

                }

            } while (!(user.equals(aux.getUsuario().getUsuario()) && contra.equals(aux.getUsuario().getContraseña())) && contadorOportunidades < 5);

        } else {
            System.out.println("Login completado con exito");

        }

        return user1;

    }

    public static Comando menu() {

        int numero;

        System.out.println("¡Bienvenido a la centralita de tu hogar!");

        System.out.println("------------Menú----------------------");
        System.out.println("¿Qué quieres hacer? :D  : ");
        System.out.println("");
        System.out.println("0 -Apagar Sistema");//
        System.out.println("1-Consultar hora Actual");//
        System.out.println("2-modificar hora centralita");//
        System.out.println("3-subir la puerta del garaje");//
        System.out.println("4-Cierra puertas garaje");//
        System.out.println("5-abre la persianas del dormitorio");//
        System.out.println("6-cierra las persinas del dormitorio");//
        System.out.println("7-abre la persianas del salón");//
        System.out.println("8-cierra las persinas del salón");//
        System.out.println("9-revisar camara del dormitorio");
        System.out.println("10-Revisa la camara del salon");
        System.out.println("11-mostrar estado salon");
        System.out.println("12-Muestra el estado garaje");
        System.out.println("13-Muestra el estado dormitorio");
        System.out.println("14-Muestra el estado general de la vivienda");
        System.out.println("15-Enciende las luces");
        System.out.println("16-Apaga las luces");
        System.out.println("17-Activar las camaras");
        
    

        numero = teclado.nextInt();

        switch (numero) {

            case 0:
                return Comando.APAGAR_SISTEMA;
            case 1:
                return Comando.CONSULTAR_HORA;
            case 2:
                return Comando.MODIFICAR_HORA;
            case 3: 
                return Comando.SUBIR_PUERTA_GARJE;
            case 4:
                return Comando.CERRAR_PUERTA_GARAJE;
            case 5:
                return Comando.ABRIR_PERSIANA_DORMITORIO;
            case 6: 
                return Comando.CERRAR_PERSIANA_DORMITORIO;
            case 7:
                return Comando.ABRIR_PERSIANA_SALON;
            case 8: 
                return Comando.CIERRAR_PERSIANA_SALON;
            case 9: 
                return Comando.REVISAR_CAMARA_DORMITORIO;
            case 10:
                return Comando.REVISAR_CAMARA_SALON;
        
            case 11:
                return Comando.MOSTRAR_ESTADO_SALON;
            case 12:
                return Comando.MOSTRAR_ESTADO_GARAJE;
            case 13:
                return Comando.MOSTRAR_ESTADO_DORMITORIO;
            case 14:
                return Comando.MOSTAR_ESTADO_GENERAL;
            case 15:
                return Comando.ENCENDER_LUCES;
            case 16:  
                return Comando.APAGAR_LUCES;
            case 17:
                return Comando.ACTIVAR_CAMARAS;
            
            default:
                throw new AssertionError();

        }

    }

}
