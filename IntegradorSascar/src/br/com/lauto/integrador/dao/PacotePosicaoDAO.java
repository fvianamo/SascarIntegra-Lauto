
package br.com.lauto.integrador.dao;

import br.com.sascar.integracao.*;
import br.com.lauto.integrador.db.DBManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date.*;

public class PacotePosicaoDAO {
    
    public static Connection conn;
    public static Statement st;
    
    public PacotePosicaoDAO(DBManager dbManager){
        this.conn = dbManager.conn;
        this.st = dbManager.st;
    }
    
    public static boolean insertPacotePosicao(PacotePosicao pacote){
        if (!checkPacotePosicaoByID(pacote.getIdPacote())){
            try {
                String query = "INSERT INTO pacotePosicoes (idPacote, idVeiculo, latitude, longitude, rua, cidade, uf, ignicao, velocidade, bloqueio, dataPosicao, dataPacote) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);

                ps.setLong(1, pacote.getIdPacote());
                ps.setInt(2, pacote.getIdVeiculo());
                ps.setDouble(3, pacote.getLatitude());
                ps.setDouble(4, pacote.getLongitude());
                
                ps.setString(5, pacote.getRua());
                ps.setString(6, pacote.getCidade());
                ps.setString(7, pacote.getUf());
                
                ps.setInt(8, pacote.getIgnicao());
                ps.setInt(9, pacote.getVelocidade());
                ps.setInt(10, pacote.getBloqueio());
            
                //Transformando de XMLGregorianDate to Timestamp
                Timestamp dataPosicao = new Timestamp(pacote.getDataPosicao().toGregorianCalendar().getTimeInMillis());
                Timestamp dataPacote  = new Timestamp(pacote.getDataPacote().toGregorianCalendar().getTimeInMillis());
                
                ps.setTimestamp(11, dataPosicao);
                ps.setTimestamp(12, dataPacote);
                
                ps.executeUpdate();
                ps.close();

                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public static boolean checkPacotePosicaoByID(long id){
        try{
            String query = "SELECT * FROM pacotePosicoes WHERE idPacote=" + id;
            ResultSet rs = st.executeQuery(query);
            
            //isBeforeFirst retorna false se ResultSet for vazio e true se não
            return rs.isBeforeFirst();
        }catch (SQLException ex){
            return false;
        }
    }
    
}
