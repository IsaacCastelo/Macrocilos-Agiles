
package persistence;

import dominio.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos A. Valle Encinas. 
 */
public class UsuariosDAO extends Conexion {
    
    public boolean registrar(Usuarios log){
        
        PreparedStatement pst= null;
        
        try{
            String sql = "INSERT INTO usuarios (nombre, contrasena) VALUES (?, ?)";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, log.contrasenia);
            pst.setString(2, log.usuario);
            
            if (pst.executeUpdate() == 1) {
                return true;
            }
            
        }catch (SQLException e) {
            System.out.println("Error en: " + e);
        } finally {
            try {
                if (getConexion() != null) {
                    getConexion().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println("Error en: " + e);
            }
        }
        return false;
    }   
    
    public boolean registrarEntrenador(Usuarios log) {
        String sql = "INSERT INTO usuarios (nombre, usuario, contrasena, email) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConexion(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, log.getNombre()); 
            pst.setString(2, log.getUsuario()); 
            pst.setString(3, log.getContrasenia()); 
            pst.setString(4, log.getEmail());
            return pst.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        }
        return false;
    }
    
    public boolean validarInicioSesion(String nombreUsuario, String contrasena) {
        
          PreparedStatement pst= null;
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, nombreUsuario);
            pst.setString(2, contrasena);

            try (ResultSet rs = pst.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
