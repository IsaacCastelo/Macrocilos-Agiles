/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import dominio.DistribucionVolumen;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos A. Valle Encinas
 */
public class DistribucionVolumenDAO extends Conexion {
    
    public boolean registrar(DistribucionVolumen vol) {
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO DistribucionVolumen (etapa, semana, mesociclo, fechaInicio, fechaFin, ciclicidad, acentos, esfuerzo, mediosFisicos) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = getConexion().prepareStatement(sql);
            pst.setString(1, vol.etapa);
            pst.setInt(2, vol.semana);
            pst.setInt(3, vol.mesociclo);
            java.sql.Date fechaInicioSql = new java.sql.Date(vol.fechaInicio.getTime());
            java.sql.Date fechaFinSql = new java.sql.Date(vol.fechaFin.getTime());
            pst.setDate(4, fechaInicioSql);
            pst.setDate(5, fechaFinSql);
            pst.setFloat(6, vol.ciclicidad);
            pst.setFloat(7, vol.acentos);
            pst.setFloat(8, vol.esfuerzo);
            pst.setString(9, vol.mediosFisicos);
           

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


    public boolean editar(int id, DistribucionVolumen vol) {
        PreparedStatement pst = null;
        try {
            String sql = "UPDATE DistribucionVolumen SET etapa=?, semana=?, mesociclo=?, fechaInicio=?, fechaFin=?, ciclicidad=?, acentos=?, esfierzo=?, mediosFisicos=? WHERE id=?";
            pst = getConexion().prepareStatement(sql);
             pst.setString(1, vol.etapa);
            pst.setInt(2, vol.semana);
            pst.setInt(3, vol.mesociclo);
            java.sql.Date fechaInicioSql = new java.sql.Date(vol.fechaInicio.getTime());
            java.sql.Date fechaFinSql = new java.sql.Date(vol.fechaFin.getTime());
            pst.setDate(4, fechaInicioSql);
            pst.setDate(5, fechaFinSql);
            pst.setFloat(6, vol.ciclicidad);
            pst.setFloat(7, vol.acentos);
            pst.setFloat(8, vol.esfuerzo);
            pst.setString(9, vol.mediosFisicos);
            pst.setInt(10, id);

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
            String sql = "DELETE FROM DistribucionVolumen WHERE MediosFisicos_id=?";
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

    public DistribucionVolumen consultarPorId(int id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM DistribucionVolumen WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                DistribucionVolumen vol = new DistribucionVolumen();
                vol.setId(rs.getInt("id"));
                vol.setEtapa(rs.getString("etapa"));
                vol.setSemanaa(rs.getInt("semana"));
                vol.setMesociclo(rs.getInt("mesociclo"));
                java.sql.Date fechaInicioSql = rs.getDate("fechaInicio");
                java.sql.Date fechaFinSql = rs.getDate("fechaFin");
                vol.setFechaInicio(new java.sql.Date(fechaInicioSql.getTime()));
                vol.setFechaFin(new java.sql.Date(fechaFinSql.getTime()));
                vol.setCiclicidad(rs.getFloat("ciclicidad"));
                vol.setAcentos(rs.getFloat("acentos"));
                vol.setEsfuerzo(rs.getFloat("esfuerzo"));
                vol.setMediosFisicos(rs.getString("mediosFisicos"));
                return vol;
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
    public List<DistribucionVolumen> consulTodo(){
        List<DistribucionVolumen> listaDistribucion = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM DistribucionVolumen  ";
            pst = getConexion().prepareStatement(sql);
          
            rs = pst.executeQuery();

            while (rs.next()) {
                DistribucionVolumen vol = new DistribucionVolumen();
                vol.setId(rs.getInt("id"));
                vol.setEtapa(rs.getString("etapa"));
                vol.setSemanaa(rs.getInt("semana"));
                vol.setMesociclo(rs.getInt("mesociclo"));
                java.sql.Date fechaInicioSql = rs.getDate("fechaInicio");
                java.sql.Date fechaFinSql = rs.getDate("fechaFin");
                vol.setFechaInicio(new java.sql.Date(fechaInicioSql.getTime()));
                vol.setFechaFin(new java.sql.Date(fechaFinSql.getTime()));
                vol.setCiclicidad(rs.getFloat("ciclicidad"));
                vol.setAcentos(rs.getFloat("acentos"));
                vol.setEsfuerzo(rs.getFloat("esfuerzo"));
                vol.setMediosFisicos(rs.getString("mediosFisicos"));
                
                listaDistribucion.add(vol);
            }
            
            return listaDistribucion;
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
