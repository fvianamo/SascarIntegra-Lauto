
package br.com.sascar.integracao;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SasIntegraFault", targetNamespace = "http://webservice.web.integracao.sascar.com.br/")
public class SasIntegraNotification
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SasIntegraFaultBean faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SasIntegraNotification(String message, SasIntegraFaultBean faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SasIntegraNotification(String message, SasIntegraFaultBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: br.com.sascar.integracao.SasIntegraFaultBean
     */
    public SasIntegraFaultBean getFaultInfo() {
        return faultInfo;
    }

}
