/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import dominio.Usuarios;
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
            String sql= "INSER INTO login (usuario, contrasenia) VALUES (?,?)"; 
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, log.contrasenia);
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
