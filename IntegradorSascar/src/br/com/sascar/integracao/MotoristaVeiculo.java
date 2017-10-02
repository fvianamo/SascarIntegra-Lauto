
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motoristaVeiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motoristaVeiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotoristaVeiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motoristaVeiculo", propOrder = {
    "idMotorista",
    "idMotoristaVeiculo",
    "idVeiculo"
})
public class MotoristaVeiculo {

    protected Integer idMotorista;
    protected Long idMotoristaVeiculo;
    protected String idVeiculo;

    /**
     * Gets the value of the idMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMotorista() {
        return idMotorista;
    }

    /**
     * Sets the value of the idMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMotorista(Integer value) {
        this.idMotorista = value;
    }

    /**
     * Gets the value of the idMotoristaVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMotoristaVeiculo() {
        return idMotoristaVeiculo;
    }

    /**
     * Sets the value of the idMotoristaVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMotoristaVeiculo(Long value) {
        this.idMotoristaVeiculo = value;
    }

    /**
     * Gets the value of the idVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * Sets the value of the idVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVeiculo(String value) {
        this.idVeiculo = value;
    }

}
