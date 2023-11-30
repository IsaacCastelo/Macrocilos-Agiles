/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Carlos A. Valle Encinas.
 */
public class Usuarios {
    
    public int id, contrasenia;
    public String usuario;
    
    public Usuarios(){
        
    }
    
    public Usuarios(int id, int contrasenia, String usuario){
        this.id= id; 
        this.contrasenia= contrasenia;
        this.usuario= usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
