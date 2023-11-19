/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import dominio.MediosFisicos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Carlos A. Valle Encinas
 */
public class MediosFisicosDAO extends Conexion{
     public boolean registrar(MediosFisicos medio) {
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO MediosFisicos (nombre) VALUES (?)";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, medio.nombre);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
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


    public boolean editar(int id, MediosFisicos medio) {
        PreparedStatement pst = null;
        try {
            String sql = "UPDATE MediosFisicos SET nombre=? WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, medio.nombre);
            pst.setInt(2, id);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
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

    public boolean eliminar(int id) {
        PreparedStatement pst = null;
        try {
            String sql = "DELETE FROM MediosFisicos WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, id);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
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

    public MediosFisicos consultarPorId(int id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM MediosFisicos WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                MediosFisicos medios = new MediosFisicos();
                medios.setId(rs.getInt("id"));
                medios.setNombre(rs.getString("nombre"));
                return medios;
            }
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (getConexion() != null) {
                    getConexion().close();
                }
            } catch (Exception e) {
                System.out.println("Error en: " + e);
            }
        }
        return null; // Si no se encontró la etapa con el ID especificado
    }
   /**
    * consulta por nombre de medio fisico.
    * @param nombre nombre de medio fisico.
    * @return lista de medios fisicos
    */
    public MediosFisicos consulNombre(String nombre){
      PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM MediosFisicos WHERE nombre=?";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, nombre);
            rs = pst.executeQuery();

            if (rs.next()) {
                MediosFisicos medios = new MediosFisicos();
                medios.setId(rs.getInt("id"));
                medios.setNombre(rs.getString("nombre"));
                return medios;
            }
        } catch (SQLException e) {
            System.out.println("Error en: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (getConexion() != null) {
                    getConexion().close();
                }
            } catch (Exception e) {
                System.out.println("Error en: " + e);
            }
        }
        return null; // Si no se encontró la etapa con el ID especificado
   
}
}
