/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.models;
import java.util.ArrayList;
/**
 *
 * @author Nico
 */
public class Biblioteca {
    
    ArrayList<Libro> libros = new ArrayList<Libro>(); 
       
    
    public void mostrarLibros(){
        for(int i=0 ; i< this.libros.size() ; i++){
            System.out.println(this.libros.get(i).getTitulo());
        }
    }
    
    public void agregarLibro(Libro nuevoLibro){
        this.libros.add(nuevoLibro);
    }
    
    public void buscarLibro(long idBuscar){
         for(int i=0 ; i< this.libros.size() ; i++){
            if(this.libros.get(i).getId() == idBuscar){
                System.out.println("libro encontrado!! \n "+ this.libros.get(i).getTitulo());
                break; 
            }
        }
    }
    
    
    public void actualizarLibro(long idBuscar, Libro libroActualizado){
        for(int i=0 ; i< this.libros.size() ; i++){
            if(this.libros.get(i).getId() == idBuscar){
                this.libros.set(i, libroActualizado);
                break; 
            }
        }
    }
    
    public void eliminarLibro(long idBuscar){
        for(int i=0 ; i< this.libros.size() ; i++){
            if(this.libros.get(i).getId() == idBuscar){
                this.libros.remove(i);
                break; 
            }
        }
    }
    
    public ArrayList<Libro> obtenerLibrosAlfabeticamente(){
        ArrayList<Libro> librosOrdenados = new ArrayList<Libro>();
        for(char i= 'a' ; i<'z'; i++){
            for(int j=0 ; j< this.libros.size() ; i++){
            if(this.libros.get(i).getTitulo().charAt(0) == i){
                librosOrdenados.add(this.libros.get(i));
                break; 
            }
        }
        }
        return librosOrdenados;
    }
}
