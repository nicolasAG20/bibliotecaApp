/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.main;

import biblioteca.models.Biblioteca;
import biblioteca.views.VentanaPrincipal;

/**
 * Modelo que permite representar la biblioteca
 * @author Nico
 * @since 20250312
 * @version 1.0
 */

public class BibliotecaMain {
    public static void main(String[] args){
        
        /**
        * Instancia de biblioteca
        */
        Biblioteca biblioteca = new Biblioteca();
        
        /**
        * Instancia de ventana principal
        */
        VentanaPrincipal ventana = new VentanaPrincipal (biblioteca);
        ventana.setVisible (true);
    }
}
