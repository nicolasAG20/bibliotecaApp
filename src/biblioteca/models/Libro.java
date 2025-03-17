
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
    * Autor del libro
    */
    Autor autor;

    /**
     * Inicializa los atributos de la clase Libro
     *
     * @param     id    
     * @param     titulo
     * @param     autor
    */
    public Libro(Long id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
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
    
    /**
     * Retorna el autor del libro
     * @return    titulo del libro
    */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Modificar el autor del libro
     * @param     autor
    */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
