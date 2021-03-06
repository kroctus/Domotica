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
//La clase Garaje es un subtipo o subclase de Estancias
//Garaje extiende a Estancia ,es decir, hereda de Estancias.
public class Garaje extends Estancias {

    private int capacidadVehiculos;
    private Puerta puertaAutomatica;


    //Los constructores son los únicos métodos que no se heredan.
    //Todo se hereda salvo eso  y lo que esta en private.
    public Garaje(int capacidadVehiculos, Puerta puertaAutomatica, int m2) {
        // Llamada al constructor de la clase padre.
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puertaAutomatica = puertaAutomatica;
    }

    //Constructor por defecto
    public Garaje() {
        super();// Crea la instancia con m2 a 0
        this.capacidadVehiculos = 0;
        this.puertaAutomatica = new Puerta();
        
    }

    //Métodos que simula la apertura y cierre de la puerta del garaje cambiando su estado entre true si esta abierta o false si esta cerrada
    //En caso de que la puerta ya esta en el estado que el usuario seleccione se le preguntará si desea cambiar al otro estado
    public void subirPuertaGaraje() {

        Garaje garajeAux = new Garaje();
        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        if (!this.puertaAutomatica.isEstado() == true) {
            this.puertaAutomatica.setEstado(true);
        } else {
            System.out.println("La puerta ya esta abierta ¿desea cerrarla? s/n");
            opcion = teclado.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                cerrarPuertaGaraje();
            } else {
                this.puertaAutomatica.setEstado(true);
                System.out.println("La puerta del garaje ahora esta abierta");
            }

        }
    }

    public void cerrarPuertaGaraje() {

        Scanner teclado = new Scanner(System.in);
        String opcion = "";
        if (!this.puertaAutomatica.isEstado() == false) {
            this.puertaAutomatica.setEstado(false);
            System.out.println("La puerta del garaje ahora esta cerrada");
        } else {
            System.out.println("La puerta ya esta cerrada, ¿desea abrirla?:  s/n");
            opcion = teclado.nextLine();
            if (opcion.equalsIgnoreCase("s")) {
                subirPuertaGaraje();
            }
        }
    }

    //Getters and setters
    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public Puerta getPuertaAutomatica() {
        return puertaAutomatica;
    }

    public void setPuertaAutomatica(Puerta puertaAutomatica) {
        this.puertaAutomatica = puertaAutomatica;
    }

    //Traducir estado persiana
    //Método que traduce el estado de la persiana a uno más natural para el usuario
    //Para ello toma el valor del atributo estado y lanza un mensaje en base a este.
    public void traEstadoPuerta() {

        if (this.puertaAutomatica.isEstado() == true) {
            System.out.println("Puerta: abierta");
        } else {
            System.out.println("Puerta: cerrada");
        }
    }

 

    public void mostrarEstado() {

        System.out.println("------------------Estado Garaje---------------------------------");
        System.out.println("Garaje");
        this.traEstadoPuerta();
     

    }

    // Ejemplo de acceso a Método heredado usando el puntero super, que apunt a la clase padre de la clase en la que estoy.
    @Override
    public String toString() {
        return super.toString() + "\n Garaje{" + "capacidadVehiculos=" + capacidadVehiculos + ",\n puertaAutomatica=" + puertaAutomatica + '}';
    }

    public static void main(String[] args) {
        
        Garaje aux = new Garaje();
        
        aux.mostrarEstado();
        
    }
}
