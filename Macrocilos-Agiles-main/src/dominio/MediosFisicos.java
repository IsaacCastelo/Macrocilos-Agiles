
package dominio;

/**
 *
 * @author Kevin
 */
public class MediosFisicos {
    public int id;
    public String nombre;

    public MediosFisicos() {
    }

    public MediosFisicos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
