/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.models;

/**
 *
 * @author Camila
 */
public class Autor extends Persona {
    /*
    * Atributos 
    */
    String editorial;
    String profesion;
    
    /*
     
    */
    public Autor(String nombre, String documentoDeIdentidad, String correoElectronico, String editorial, String profesion){
        super (nombre, documentoDeIdentidad, correoElectronico);
        this.editorial = editorial;
        this.profesion = profesion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    } 
}
