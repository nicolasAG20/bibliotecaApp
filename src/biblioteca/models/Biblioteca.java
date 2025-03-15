/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.models;
import biblioteca.models.Libro;
import java.util.ArrayList;
/**
 * Modelo que permite representar la biblioteca
 * @author Nicolas Agudelo
 * @since 20250312
 * @version 1.0
 */

public class Biblioteca {
    //Atributos
    /**
    * Arreglo que almacena los libros
    */
    ArrayList<Libro> libros = new ArrayList<Libro>(); 
       
    /**
     * Muestra los libros existentes en la bilioteca
     * @return arreglo de libros
    */
    public ArrayList<Libro> mostrarLibros(){
        /*for(int i=0 ; i< this.libros.size() ; i++){
            System.out.println(this.libros.get(i).getTitulo());
        }*/
        return this.libros;
    }
    
    /**
     * Agrega un nuevo libro a la biblioteca
     * @Param nuevoLibro
    */
    public void agregarLibro(Libro nuevoLibro){
        this.libros.add(nuevoLibro);
    }
    
    /**
     * Busca un libro en el arreglo de libros 
     * @param idBuscar
     * @return libro
     * @return null, si no fue encontrado el libro
    */
    public Libro buscarLibro(long idBuscar){
        for(int i=0 ; i< this.libros.size() ; i++){
            if(this.libros.get(i).getId() == idBuscar){
                return this.libros.get(i);
            }
        }
        return null;
    }

    /**
     * Actualiza la informacion de un libro
     * @param idBuscar
     * @param libroActualizado
    */
    public void actualizarLibro(long idBuscar, Libro libroActualizado){
        for(int i=0 ; i< this.libros.size() ; i++){
            if(this.libros.get(i).getId() == idBuscar){
                this.libros.set(i, libroActualizado);
                break; 
            }
        }
    }
    
    /**
     * Elimina un libro del arreglo
     * @param idBuscar
    */
    public void eliminarLibro(long idBuscar){
        for(int i=0 ; i< this.libros.size() ; i++){
            if(this.libros.get(i).getId() == idBuscar){
                this.libros.remove(i);
                break; 
            }
        }
    }
    
    /**
     * Elimina un libro del arreglo
     * @return librosOrdenados
    */
    public ArrayList<Libro> obtenerLibrosAlfabeticamente(){
        ArrayList<Libro> librosOrdenados = new ArrayList<Libro>();
        for(char i= 'a' ; i<'z'; i++){
            for(int j=0 ; j < this.libros.size() ; j++){
                if(this.libros.get(i).getTitulo().charAt(0) == i){
                    librosOrdenados.add(this.libros.get(i));
                    break; 
                }
            }
        }
        return librosOrdenados;
    }
}
