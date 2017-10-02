
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caixaPreta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caixaPreta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="velocidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limpador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caixaPreta", propOrder = {
    "dataEvento",
    "latitude",
    "longitude",
    "operador",
    "velocidade",
    "rpm",
    "ignicao",
    "freio",
    "limpador",
    "descricaoEvento"
})
public class CaixaPreta {

    protected String dataEvento;
    protected String latitude;
    protected String longitude;
    protected String operador;
    protected String velocidade;
    protected String rpm;
    protected String ignicao;
    protected String freio;
    protected String limpador;
    protected String descricaoEvento;

    /**
     * Gets the value of the dataEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEvento() {
        return dataEvento;
    }

    /**
     * Sets the value of the dataEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEvento(String value) {
        this.dataEvento = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the operador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Sets the value of the operador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperador(String value) {
        this.operador = value;
    }

    /**
     * Gets the value of the velocidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocidade() {
        return velocidade;
    }

    /**
     * Sets the value of the velocidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocidade(String value) {
        this.velocidade = value;
    }

    /**
     * Gets the value of the rpm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpm() {
        return rpm;
    }

    /**
     * Sets the value of the rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpm(String value) {
        this.rpm = value;
    }

    /**
     * Gets the value of the ignicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnicao() {
        return ignicao;
    }

    /**
     * Sets the value of the ignicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnicao(String value) {
        this.ignicao = value;
    }

    /**
     * Gets the value of the freio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreio() {
        return freio;
    }

    /**
     * Sets the value of the freio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreio(String value) {
        this.freio = value;
    }

    /**
     * Gets the value of the limpador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimpador() {
        return limpador;
    }

    /**
     * Sets the value of the limpador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimpador(String value) {
        this.limpador = value;
    }

    /**
     * Gets the value of the descricaoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    /**
     * Sets the value of the descricaoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEvento(String value) {
        this.descricaoEvento = value;
    }

}
