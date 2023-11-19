package persistence;


import dominio.CalcularEtapas;
import java.sql.PreparedStatement;
import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;

public class CalcularEtapasDAO extends Conexion{
   
    public boolean registrar(CalcularEtapas etapa) {
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO CalcularEtapas (semanas, ins, min, max, prom, volumenEtapa, tipoEtapa) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, etapa.semanas);
            pst.setInt(2, etapa.ins);
            pst.setFloat(3, etapa.min);
            pst.setFloat(4, etapa.max);
            pst.setFloat(5, etapa.prom);
            pst.setFloat(6, etapa.volumenEtapa);
            pst.setString(7, etapa.tipoEtapa);

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


    public boolean editar(int id, CalcularEtapas etapa) {
        PreparedStatement pst = null;
        try {
            String sql = "UPDATE CalcularEtapas SET semanas=?, ins=?, min=?, max=?, prom=?, volumenEtapa=?, tipoEtapa=? WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, etapa.semanas);
            pst.setInt(2, etapa.ins);
            pst.setFloat(3, etapa.min);
            pst.setFloat(4, etapa.max);
            pst.setFloat(5, etapa.prom);
            pst.setFloat(6, etapa.volumenEtapa);
            pst.setString(7, etapa.tipoEtapa);
            pst.setInt(8, id);

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
            String sql = "DELETE FROM CalcularEtapas WHERE id=?";
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

    public CalcularEtapas consultarPorId(int id) {
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM CalcularEtapas WHERE id=?";
            pst = getConexion().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();

            if (rs.next()) {
                CalcularEtapas etapa = new CalcularEtapas();
                etapa.setId(rs.getInt("id"));
                etapa.setSemanas(rs.getInt("semanas"));
                etapa.setIns(rs.getInt("ins"));
                etapa.setMin(rs.getFloat("min"));
                etapa.setMax(rs.getFloat("max"));
                etapa.setProm(rs.getFloat("prom"));
                etapa.setVolumenEtapa(rs.getFloat("volumenEtapa"));
                etapa.setTipoEtapa(rs.getString("tipoEtapa"));
                return etapa;
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