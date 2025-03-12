/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.models;

/**
 *
 * @author Nicolas Agudelo
 */
public class Persona {
    
    private String nombre; 
    
    private String documentoDeIdentidad; 
    
    private String correoElectronico; 

    public Persona(String nombre, String DocumentoDeIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoDeIdentidad = DocumentoDeIdentidad;
        this.correoElectronico = correoElectronico;
    }
    
    
}
