package br.com.lauto.testes;

import br.com.sascar.integracao.*;

import java.util.List;

public class OpenConectionWS {


    public static SasIntegraWS port;   
    public static List<PacotePosicao> posicao = null;
    public static String retorno = "";
    
    public static void main(String[] args) {
        
        SasIntegraWSService service = new SasIntegraWSService();
        port = service.getSasIntegraWSPort();
        
        try{
            posicao = port.obterPacotePosicoes("lauto", "lauto2017", 10);
        } catch(SasIntegraNotification e){
            e.printStackTrace();
        }
        System.out.println(retorno);
        
        System.out.println("Tamanho da lista: " + posicao.size());
    }
    
}
