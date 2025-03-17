/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.models;

/**
 * Modelo que permite representar un autor, heredando atributos de la clase persona
 * @author Camila
 * @since 20250312
 * @version 1.0
 */
public class Autor extends Persona {
    //Atributos 
    /**
    * Editorial del autor
    */
    String editorial;
    /**
    * Profesion del autor
    */
    String profesion;
    
    /**
     * Inicializa los atributos de la clase Autor
     *
     * @param     nombre    
     * @param     documentoDeIdentidad
     * @param     correoElectronico
     * @param     editorial
     * @param     profesion
    */
    public Autor(String nombre, String documentoDeIdentidad, String correoElectronico, String editorial, String profesion){
        super (nombre, documentoDeIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }
    
    /**
     * Inicializa los atributos de la clase Autor
     *
     * @param     nombre    
     * @param     editorial
    */
    public Autor (String nombre, String editorial){
        super (nombre);
        this.editorial = editorial;
    }
    
    /**
     * Retorna la editorial del autor
     * @return    editorial del autor
    */
    public String getEditorial() {
        return editorial;
    }
    
    /**
     * Modificar el editorial del autor
     * @param     editorial
    */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    /**
     * Retorna la profesion del autor
     * @return    profesion del autor
    */
    public String getProfesion() {
        return profesion;
    }
    
    /**
     * Modificar la profesion del autor
     * @param     profesion
    */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    } 
}
