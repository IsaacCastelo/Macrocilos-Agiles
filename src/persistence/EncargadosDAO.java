/*
 * Luis Fernando Aguilar Ortiz 
ITSON ISW 228419
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;


import dominio.Encargados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Fernando Aguilar Ortiz 228419 ITSON ISW obregon-Camp-Nainari
 */
public class EncargadosDAO extends Conexion{
      
    public boolean registrar(Encargados enc) {
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO encargados (   deporte,  rama,  jefeRama,  EntAuxPrepFis,  metodologo,  inicioPlan,  finPlan,  totalSemanas,  MediosFisicos_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
            pst = getConexion().prepareStatement(sql);
           pst.setString(1, enc.deporte);
            pst.setString(2, enc.rama);
            pst.setString(3, enc.jefeRama);
            pst.setString(4, enc.EntAuxPrepFis);
             pst.setString(5, enc.metodologo);
             java.sql.Date fechaInicioSql = new java.sql.Date(enc.inicioPlan.getTime());
            java.sql.Date fechaFinSql = new java.sql.Date(enc.finPlan.getTime());
           pst.setDate(6, fechaInicioSql);
            pst.setDate(7, fechaFinSql);
            pst.setInt(8, enc.totalSemanas);
            pst.setInt(9, enc.MediosFisicos_id);
          
            

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


    public boolean editar(int id, Encargados enc) {
        PreparedStatement pst = null;
        try {
            String sql = "UPDATE encargados SET deporte=?, rama=?, jefeRama=?, EntAuxPrepFis=?, metodologo=?, inicioPlan=?, finPlan=?, totalSemanas=?, MediosFisicos_id=? WHERE id=?";
            pst.setString(1, enc.deporte);
            pst.setString(2, enc.rama);
            pst.setString(3, enc.jefeRama);
            pst.setString(4, enc.EntAuxPrepFis);
             pst.setString(5, enc.metodologo);
             java.sql.Date fechaInicioSql = new java.sql.Date(enc.inicioPlan.getTime());
            java.sql.Date fechaFinSql = new java.sql.Date(enc.finPlan.getTime());
           pst.setDate(6, fechaInicioSql);
            pst.setDate(7, fechaFinSql);
            pst.setInt(8, enc.totalSemanas);
            pst.setInt(9, enc.MediosFisicos_id);
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
            String sql = "DELETE FROM encargados WHERE MediosFisicos_id=?";
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

    public Encargados consultarPorId(int id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM encargados WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                Encargados enc = new Encargados();
                enc.setId(rs.getInt("id"));
                enc.setDeporte(rs.getString("deporte"));
                enc.setRama(rs.getString("rama"));
                enc.setJefeRama(rs.getString("jefeRama"));
                enc.setMetodologo(rs.getString("metodologo"));
                java.sql.Date fechaInicioSql = rs.getDate("inicioPlan");
                java.sql.Date fechaFinSql = rs.getDate("finPlan");
                enc.setInicioPlan(new java.sql.Date(fechaInicioSql.getTime()));
                enc.setFinPlan(new java.sql.Date(fechaFinSql.getTime()));
                enc.setTotalSemanas(rs.getInt("totalSemanas"));
                enc.setMediosFisicos_id(rs.getInt("mediosFisicos_id"));
                
                return enc;
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
    public List<Encargados> consulTodo(){
        List<Encargados> listaDistribucion = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM DistribucionVolumen  ";
            pst = getConexion().prepareStatement(sql);
          
            rs = pst.executeQuery();

            while (rs.next()) {
                Encargados enc = new Encargados();
                 enc.setId(rs.getInt("id"));
                enc.setDeporte(rs.getString("deporte"));
                enc.setRama(rs.getString("rama"));
                enc.setJefeRama(rs.getString("jefeRama"));
                enc.setMetodologo(rs.getString("metodologo"));
                java.sql.Date fechaInicioSql = rs.getDate("inicioPlan");
                java.sql.Date fechaFinSql = rs.getDate("finPlan");
                enc.setInicioPlan(new java.sql.Date(fechaInicioSql.getTime()));
                enc.setFinPlan(new java.sql.Date(fechaFinSql.getTime()));
                enc.setTotalSemanas(rs.getInt("totalSemanas"));
                enc.setMediosFisicos_id(rs.getInt("mediosFisicos_id"));
                
                listaDistribucion.add(enc);
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
