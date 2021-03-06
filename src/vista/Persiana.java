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
public class Persiana {

    private int estado ;
    private int largo;// cm
    private int ancho;// cm

    //Constructor por defecto
    public Persiana() {
        this.ancho=0;
        this.estado=0;
        this.largo=0;
        
    }
    
    //Constructor parametrizado

    public Persiana(int estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }
    
    
    
    

    //Método que simula la subida de una persiana, primero muestra al usuario el eatado actual de la ventana y luego solicita al usuario qué acción desea realizar
    //En caso de que la opción seleccionada sea en la que se encuentra la persiana, le indicará al usuario.
    public void subirPersiana() {

        Scanner teclado = new Scanner(System.in);
        int opcion = 3;

        switch (estado) {
            case 0:
                System.out.println("las persianas están bajadas ");
                break;
            case 1:
                System.out.println("Las persianas están a media altura");
                break;
            case 2:
                System.out.println("Las persianas están subidas");
                break;
        }

        System.out.println("¿Que deseas hacer con las ventanas?");
        System.out.println("0=Bajar ventanas");
        System.out.println("1=Dejar a media Altura");
        System.out.println("2=Subir ventanas");
        opcion = teclado.nextInt();

        if (opcion == estado) {
            System.out.println("La ventana ya se encuentra en ese estado");
        } else {

            switch (opcion) {
                case 0:
                    this.estado = opcion;
                    System.out.println("las persianas se han bajado ");
                    break;
                case 1:
                    this.estado = opcion;
                    System.out.println("Las persianas se han puesto a media altura: ");
                    break;
                case 2:
                    this.estado = opcion;
                    System.out.println("Las persianas se han subido");
                    break;
            }
        }

    }
    
 
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    
}
