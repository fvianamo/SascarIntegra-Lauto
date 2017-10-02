
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enviarParametrizacaoTelemetria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enviarParametrizacaoTelemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="telemetriaParametrizacao" type="{http://webservice.web.integracao.sascar.com.br/}telemetriaConfiguracao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarParametrizacaoTelemetria", propOrder = {
    "usuario",
    "senha",
    "idVeiculo",
    "telemetriaParametrizacao"
})
public class EnviarParametrizacaoTelemetria {

    protected String usuario;
    protected String senha;
    protected Integer idVeiculo;
    protected TelemetriaConfiguracao telemetriaParametrizacao;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Gets the value of the idVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * Sets the value of the idVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVeiculo(Integer value) {
        this.idVeiculo = value;
    }

    /**
     * Gets the value of the telemetriaParametrizacao property.
     * 
     * @return
     *     possible object is
     *     {@link TelemetriaConfiguracao }
     *     
     */
    public TelemetriaConfiguracao getTelemetriaParametrizacao() {
        return telemetriaParametrizacao;
    }

    /**
     * Sets the value of the telemetriaParametrizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelemetriaConfiguracao }
     *     
     */
    public void setTelemetriaParametrizacao(TelemetriaConfiguracao value) {
        this.telemetriaParametrizacao = value;
    }

}
