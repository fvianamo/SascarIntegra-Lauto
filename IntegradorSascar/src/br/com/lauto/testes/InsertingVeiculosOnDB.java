
package br.com.lauto.testes;

import br.com.lauto.integrador.dao.*;
import br.com.lauto.integrador.db.*;
import br.com.sascar.integracao.*;
import java.sql.SQLException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertingVeiculosOnDB {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBManager dbManager = new DBManager();
        VeiculoDAO veiculoManager = new VeiculoDAO(dbManager);
        
        List<Veiculo> veiculos = null;
        
        SasIntegraWSService service = new SasIntegraWSService();
        SasIntegraWS port = service.getSasIntegraWSPort();
        
        try {
            veiculos = port.obterVeiculos("lauto", "lauto2017", Integer.MAX_VALUE, 0);
            System.out.println("Data Retrieved from webservice: " + veiculos.size() + " veiculos");
        } catch (SasIntegraNotification ex) {
            System.out.println("Error retrieving data from webservice...");
        }
        
        for(int i = 0; i < veiculos.size(); i++){
            boolean result = veiculoManager.insertVeiculo(veiculos.get(i));
            if (!result)
                System.out.println("falha ao gravar/atualizar veiculo");
            else
                System.out.println("Veiculo adicionado/atualizado!");
            System.out.println("done!");        
        }
        
    }
    
}
