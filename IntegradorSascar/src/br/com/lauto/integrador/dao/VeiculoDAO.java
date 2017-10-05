
package br.com.lauto.integrador.dao;

import static br.com.lauto.integrador.dao.PacotePosicaoDAO.conn;
import br.com.sascar.integracao.*;
import br.com.lauto.integrador.db.DBManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeiculoDAO {
    
    public static Connection conn;
    public static Statement st;
    
    public VeiculoDAO(DBManager dbManager){
        this.conn = dbManager.conn;
        this.st = dbManager.st;
    }
    
    public static boolean insertVeiculo(Veiculo veiculo){
        //se veiculo nao esta no banco insere
        if(!checkVeiculoByID(veiculo.getIdVeiculo())){

            try {
                //String query = "INSERT INTO Veiculo (idVeiculo, placa, idEquipamento, descricao) VALUES (?,?,?,?)";
                String query = "INSERT INTO Veiculo (idVeiculo, placa, descricao) VALUES (?,?,?)";
                PreparedStatement ps = conn.prepareStatement(query);
                
                ps.setInt(1, veiculo.getIdVeiculo());
                ps.setString(2, veiculo.getPlaca());
                //ps.setLong(3, veiculo.getIdEquipamento());
                ps.setString(3, veiculo.getDescricao());
                
                ps.executeUpdate();
                ps.close();
                
                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
        //se veiculo esta no banco atualiza
        else{
            try {
                String query = "UPDATE Veiculo SET placa = ?, descricao = ? WHERE idVeiculo=?";
                PreparedStatement ps = conn.prepareStatement(query);
                
                ps.setString(1, veiculo.getPlaca());
                //ps.setLong(2, veiculo.getIdEquipamento());
                ps.setString(2, veiculo.getDescricao());
                ps.setInt(3, veiculo.getIdVeiculo());
                
                ps.executeUpdate();
                ps.close();
                return true;
            } catch (SQLException ex) {
                return false;
            }
        }
    }
    
    //retorna true se veiculo já esta no banco
    public static boolean checkVeiculoByID(int id){
        try{
            String query = "SELECT * FROM Veiculo WHERE idVeiculo=" + id;
            ResultSet rs = st.executeQuery(query);
            
            //isBeforeFirst retorna false se ResultSet for vazio e true se não
            return rs.isBeforeFirst();
        }catch (SQLException ex){
            return false;
        }
    }
    
}
