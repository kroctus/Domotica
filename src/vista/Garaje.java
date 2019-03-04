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
    
    public  Garaje(){
        super();// Crea la instancia con m2 a 0
        this.capacidadVehiculos=0;
        this.puertaAutomatica= new Puerta();
    }
    
    
    // Ejemplo de acceso a Método heredado usando el puntero super, que apunt a la clase padre de la clase en la que estoy.

    @Override
    public String toString() {
        return super.toString()+  "\n Garaje{" + "capacidadVehiculos=" + capacidadVehiculos + ",\n puertaAutomatica=" + puertaAutomatica + '}';
    }
    
    
    
    
}
