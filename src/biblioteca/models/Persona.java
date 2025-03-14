/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.models;

/**
 * Modelo que permite representar una persona como una clase abstracta
 * @author Nicolas Agudelo
 * @since 20250312
 * @version 1.0
 */
public class Persona {
    //Atributos
    /**
    * Nombre de la persona
    */
    private String nombre; 
    
    /**
    * Documento de identidad de la persona
    */
    private String documentoDeIdentidad; 
    
    /**
    * Correo electronico de la persona
    */
    private String correoElectronico; 
    
    /**
     * Inicializa los atributos de la clase Persona
     *
     * @param     nombre    
     * @param     documentoDeIdentidad
     * @param     correoElectronico
    */
    public Persona(String nombre, String documentoDeIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoDeIdentidad = documentoDeIdentidad;
        this.correoElectronico = correoElectronico;
    }
}
