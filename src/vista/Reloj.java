/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Reloj {
    
    private LocalTime horaActual;
    private LocalTime HoraCentralita;

    //Métodos
    //Método que muestra la hora actual a través de un LocalTime.now
    public static void mostarHoraActual() {
        LocalTime horaActual = LocalTime.now();
        System.out.println(horaActual);
    }

    //Método que muestra la fecha actual a través de un LocalDate
    public static void mostarFecha() {
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
    }

    //Método que modifica la hora de la centralita con los valores que desee el usuario 
    // controlando que los valores sean correctos
    public void modificarHora() {
        
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas: ");
        int horas = teclado.nextInt();
        while (horas > 23 || horas < 0) {
            System.out.println("Las horas no tienen un valor correcto porfavor introduce un valor correcto:");
            horas = teclado.nextInt();
        }
        System.out.println("Introduce los minutos: ");
        int minutos = teclado.nextInt();
        while (minutos > 59 || minutos < 0) {
            System.out.println("Los minutos no tienen un valor correctos porfavor introduce un valor correcto:");
            minutos = teclado.nextInt();
        }
        System.out.println("Introduce los segundos: ");
        int segundos = teclado.nextInt();
        while (segundos > 59 || segundos < 0) {
            System.out.println("Los segundos no tienen un valor correcto porfavor introduce un valor correcto: ");
            segundos = teclado.nextInt();
        }
        System.out.println("La hora ha sido modificada a las : " + horas + ":" + minutos + ":" + segundos + ":");
        this.HoraCentralita= LocalTime.of(horas, minutos, segundos);
       
        
    }

    public LocalTime getHoraActual() {
        return horaActual;
    }

    public void setHoraActual(LocalTime horaActual) {
        this.horaActual = horaActual;
    }

    public LocalTime getHoraCentralita() {
        return HoraCentralita;
    }

    public void setHoraCentralita(LocalTime HoraCentralita) {
        this.HoraCentralita = HoraCentralita;
    }
    
    
    
}
