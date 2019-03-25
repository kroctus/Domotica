/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.time.LocalDate;
import static vista.Comando.APAGAR_SISTEMA;
import static vista.Comando.CONSULTAR_HORA;

/**
 *
 * @author gabriel
 */
public class Domotica {

    public static void main(String[] args) {

        /*En el main creamos cada uno de los objetos necesarios para la instanciación de la centralita
            Este proceso puede hacerse también directamente pasando estas instanciaciones al constructor de la centralita
            pero de cara a una mejor lectura hemos decidido realizarlo c/u por separado*/
        Garaje g1 = new Garaje();
//        System.out.println(g1);
        //Garajes
        Garaje g2 = new Garaje(2, new Puerta(), 50);
//        System.out.println(g2);
        //USUARIO
        Usuario user = new Usuario("GabrielPayano", "12345gp");
        //SALON
        Salon salon1 = new Salon();
        //DORMITORIO
        Dormitorio dormitorio1 = new Dormitorio();
        //RELOJ

        Reloj relojAux = new Reloj();
        //Creamos nuestra centralita con los objetos que creamos antes
        Centralita mainCentral = new Centralita("centralitaPrincipal",
                LocalDate.now(), relojAux, user, g2, salon1, dormitorio1);
        //Ejecutamos el método login() para iniciar sesión en la centralita
        Vista.login(mainCentral);

        //Ejecutamos el método ejecutarComando() dentro de un bucle que mostrará el menú
        // y realizará los comandos que seleccione el usuario hasta que esté apague el sistema.
        Comando aux = CONSULTAR_HORA;
        while (aux != APAGAR_SISTEMA) {
            aux = Vista.menu();
            mainCentral.ejecutarOrden(aux);
        }

    }

}
