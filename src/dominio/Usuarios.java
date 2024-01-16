
package dominio;

public class Usuarios {
    
    public int id;
    public String usuario, nombre, contrasenia, email;
    
    public Usuarios(){
        
    }
    
    public Usuarios(int id, String contrasenia, String usuario){
        this.id= id; 
        this.contrasenia= contrasenia;
        this.usuario= usuario;
    }

    public Usuarios(String usuario, String nombre, String contrasenia, String email) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

 
    
    
    
}