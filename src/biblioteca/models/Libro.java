
package biblioteca.models;

/**
 * Modelo que permite representar un libro
 * @author Salo
 * @since 20250312
 * @version 1.0
 */
public class Libro {
    //Atributos
    /**
    * Id del libro
    */
    Long id;
    /**
    * Titulo del libro
    */
    String titulo;

    /**
     * Inicializa los atributos de la clase Libro
     *
     * @param     id    
     * @param     titulo
    */
    public Libro(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    /**
     * Retorna el id del libro
     * @param     id
     * @return    id del libro
    */
    public Long getId() {
        return id;
    }
    
    /**
     * Modificar el id del libro
     * @param     id
    */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Retorna el titulo del libro
     * @param     titulo
     * @return    titulo del libro
    */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Modificar el titulo del libro
     * @param     titulo
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
