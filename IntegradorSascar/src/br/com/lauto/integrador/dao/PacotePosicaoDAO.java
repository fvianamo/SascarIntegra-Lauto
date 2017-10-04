
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
                
                ps.setTimestamp(11, new Timestamp(pacote.getDataPosicao().getYear(), pacote.getDataPosicao().getMonth(), pacote.getDataPosicao().getDay(),pacote.getDataPosicao().getHour(), pacote.getDataPosicao().getMinute(), pacote.getDataPosicao().getSecond(), pacote.getDataPosicao().getMillisecond()));
                ps.setTimestamp(12, new Timestamp(pacote.getDataPacote().getYear(), pacote.getDataPacote().getMonth(), pacote.getDataPacote().getDay(), pacote.getDataPacote().getHour(), pacote.getDataPacote().getMinute(), pacote.getDataPacote().getSecond(), pacote.getDataPacote().getMillisecond()));
                
                ps.executeUpdate();
                ps.close();

                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
        else{
            System.out.println("Pacote Repetido");
            return true;
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
