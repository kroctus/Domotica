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
public class Luz {

    private boolean estado;
    private double consumo;

    //Constructor
    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }

    //Método para apagar y encender las luces en caso de que el estado seleeccioando sea en el que se encuentren las luces, 
    // se le preguntará al usuario si quiere pasar al estado contrario.
    public void apagarLuces() {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        if (estado == false) {
            System.out.println("Las luces ya estan apagadas, ¿desea encenderlas? s/n");
            opcion = teclado.nextLine();
            if (opcion.equalsIgnoreCase("s")) {

            } else {
                this.estado = false;
            }

        } else {
            estado = false;
        }

    }

    public void encenderLuces() {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        if (estado == true) {
            System.out.println("Las luces ya estan encendidas, ¿desea apagarlas? s/n");
            opcion = teclado.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                apagarLuces();
            } else {
                this.estado = true;
            }

        } else {
            estado = true;
        }
    }
    
     //Método que apaga las luces de la centralita sin preguntar por el estado anterior
    public void apagadoGeneral(){
        this.estado=false;
    }
}
