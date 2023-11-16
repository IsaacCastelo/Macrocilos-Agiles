
package persistence;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    protected Connection conn = null;
    protected ResultSet resultado = null;
    protected Statement stm = null;
    protected PreparedStatement pst = null;

    /**
     * Importante cambiar las constantes en caso de necesitarse
     */
    private final String USER = "root";
    private final String PASSWORD = "123456";
    private final String DATABASE = "mesociclos";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    /**
     * Creamos un metodo para conectarnos a la base de datos
     */
    public Conexion() {
        try {
            Class.forName(DRIVER);
            String url = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conn = DriverManager.getConnection(url, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Connection getConexion(){
        return conn;
    }

    /**
     * Creamos un metodo para desconectarnos a la base de datos
     */
    protected void desconectarDB() throws SQLException {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) { 
                conn.close();
            }
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }
    
    
    /** BORRAMOS ESTE METODO PARA MEJORAR EL CODIGO
     * Creamos un metodo para para insertar, modificar o eliminar registros de la base de datos
     */
//    protected void impactoDB(String sql) throws Exception {
//        try {
//            conectarDB();
//            stm = conn.createStatement();
//            stm.execute(sql);
//        } catch (SQLException | ClassNotFoundException ex) {
//            //conn.rollback();
//            /*
//             ** Pendiente tener en cuenta el rollback, en caso de,
//             ** agregar este script en workbench : SET autocommit=1; COMMIT;
//             */
//
//            throw ex;
//        }finally{
//            desconectarDB();
//        }
//    }

}
