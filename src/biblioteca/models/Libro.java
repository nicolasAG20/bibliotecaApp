
package biblioteca.models;

/**
 *
 * @author Salo
 */
public class Libro {
    
    //Atributos
    Long id;
    String titulo;

    //Metoodo Contructor 
    public Libro(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    //set y get
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
}
