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
public class Domotica {

    public static void main(String[] args) {

        Garaje g1 = new Garaje();
        System.out.println(g1);

        Garaje g2 = new Garaje(2, new Puerta(), 50);
        System.out.println(g2);
        
        

    }

}
