/*
 * Carlos A. Valle Encinas 
ITSON ISW 228219
 */ 

import java.sql.PreparedStatement;
import java.sql.Exception; 
import java.sql.Connection;

public class CalcularEtapasDAO implements DAOEtapas{

    Conexion conexion= Conexion.getInstance(); 

    @override
    public void registrar(CalcularEtapas etapa){

        try{
            Connection conectar= conexion.conectar();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO CalcularEtapas (semanas, ins, min, max, prom, volumenEtapa, tipoEtapa) VALUES (?, ?, ?, ?, ?, ?, ?)");

            insertar.setInt(1, etapa.getSemanas);
            insertar.setInt(2, etapa.getIns);
            insertar.setFloat(3, etapa.getMin);
            insertar.setFloat(4, etapa.getMax);
            insertar.setFloat(5, etapa.getProm);
            insertar.setFloat(6, etapa.getVolumenEtapa);
            insertar.setString(7, etapa.getTipoEtapa);

            insertar.executeUpdate();
            
        } 
        catch (SQLException e){
            e.printStackTrace(); 
        }
    }
}