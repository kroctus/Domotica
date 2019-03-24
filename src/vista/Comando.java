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
public enum Comando {

    //Los tipos ENUM tienen 2 caracteristicas fundamentales:
    // 1- El constructor es privado
    // 2- Sólo pueden instanciarse con un tipo de objeto concreto
    APAGAR_SISTEMA(0, "Apagar Sistema"),
    CONSULTAR_HORA(1, "Consultar la hora del sistema"),
    MODIFICAR_HORA(2, "Moifica la hora de la centralita"),
    SUBIR_PUERTA_GARJE(3, "Subir puerta del garaje"),
    CERRAR_PUERTA_GARAJE(4, "Cierra la puerta del garaje"),
    ABRIR_PERSIANA_DORMITORIO(5, "Abre la persiana del dormitorio"),
    CERRAR_PERSIANA_DORMITORIO(6, "Cierra la persiana del dormmitorio"),
    ABRIR_PERSIANA_SALON(7, "Abre la persiana del salon"),
    CIERRAR_PERSIANA_SALON(8, "Cierra la persiana del salon"),
    REVISAR_CAMARA_DORMITORIO(9, "Revisa la camara del dormitorio"),
    REVISAR_CAMARA_SALON(10, "Revisa la camara del salon"),
    REVISAR_CAMARA_GARAJE(11, "Revisa la camara del garaje"),
    MOSTRAR_ESTADO_SALON(12, "Muestra el estado total del salón"),
    MOSTRAR_ESTADO_GARAJE(13, "Muestra el estado total del garaje"),
    MOSTRAR_ESTADO_DORMITORIO(14, "Muestra el estado total del dormitorio"),
    MOSTAR_ESTADO_GENERAL(15, "Muestra el estado total de la vivienda"),
    ENCENDER_LUCES(16, "Enciende todas las luces"),
    APAGAR_LUCES(17, "Apaga todas las luces"),
    APAGAR_LUCES_DORMITORIO(18, "Apaga las luces del dormitorio"),
    APAGAR_LUCES_SALON(19, "Apaga las luces del salón"),
    APAGAR_LUCES_GARAJE(20, "Apaga las luces del garaje"),
    ENCENDER_LUCES_DORMITORIO(21, "Enciende las luces del dormitorio"),
    ENCENDER_LUCES_SALON(22, "Enciende las luces del salon"),
    ENCENDER_LUCES_GARAJE(23, "Enciende las luces del garaje");

    ;

    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

}
