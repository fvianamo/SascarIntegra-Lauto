
package br.com.lauto.integrador.dao;

import br.com.sascar.integracao.*;
import br.com.lauto.integrador.db.DBManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacotePosicaoDAO {
    
    public static Connection conn;
    public static Statement st;
    
    public PacotePosicaoDAO(DBManager dbManager){
        this.conn = dbManager.conn;
        this.st = dbManager.st;
    }
    
    public static boolean insertPacotePosicao(PacotePosicao pacote){
        try {
            String query = "INSERT INTO pacotePosicoes (idPacote, idVeiculo, latitude, longitude) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setLong(1, pacote.getIdPacote());
            ps.setInt(2, pacote.getIdVeiculo());
            ps.setDouble(3, pacote.getLatitude());
            ps.setDouble(4, pacote.getLongitude());
            
            ps.executeUpdate();
            ps.close();
            
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean checkPacotePosicaoByID(int id){
        return true;
    }
    
}
