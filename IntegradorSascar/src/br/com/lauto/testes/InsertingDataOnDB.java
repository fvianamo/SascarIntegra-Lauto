
package br.com.lauto.testes;

import br.com.lauto.integrador.dao.*;
import br.com.lauto.integrador.db.*;
import br.com.sascar.integracao.*;
import java.sql.SQLException;

import java.util.List;

public class InsertingDataOnDB {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBManager dbManager = new DBManager();
        PacotePosicaoDAO pacoteManager = new PacotePosicaoDAO(dbManager);
        
        List<PacotePosicao> posicao = null;
        
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();
        
        try {
            posicao = port.obterPacotePosicoes("lauto", "lauto2017", 10000);
            System.out.println("Data Retrieved from webservice: " + posicao.size() + " pacotes");
        } catch (SasIntegraNotification ex) {
            System.out.println("Error retrieving data from webservice...");
        }
        
        for(int i = 0; i < posicao.size(); i++){
            //System.out.println("Inserting pacote " + i + " into data base...");
            boolean result;
            result = pacoteManager.insertPacotePosicao(posicao.get(i));
            /*
            if(result)
                System.out.println("Done!");
            else
                System.out.println("Failed");
            */
            if(!result)
                System.out.println("Failed");
        }
        System.out.println("Done!");
    }
    
}
