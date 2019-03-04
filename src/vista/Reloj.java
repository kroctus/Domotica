/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author gabriel
 */
public class Reloj {
    
 
    
    //Métodos
    
    public static void mostarHoraActual(){
      LocalTime horaActual= LocalTime.now();
        System.out.println(horaActual);
    }
    
    public static void mostarFecha(){
        LocalDate fecha= LocalDate.now();
        System.out.println(fecha);
    }
    
}
