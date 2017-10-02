
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eventoTelemetria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eventoTelemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horimetro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="loginMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempoDuracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventoTelemetria", propOrder = {
    "dataPosicao",
    "horimetro",
    "idEvento",
    "idMotorista",
    "idVeiculo",
    "latitude",
    "loginMotorista",
    "longitude",
    "odometro",
    "tempoDuracao"
})
public class EventoTelemetria {

    protected String dataPosicao;
    protected Integer horimetro;
    protected Integer idEvento;
    protected Integer idMotorista;
    protected Integer idVeiculo;
    protected Double latitude;
    protected Integer loginMotorista;
    protected Double longitude;
    protected String odometro;
    protected Integer tempoDuracao;

    /**
     * Gets the value of the dataPosicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Sets the value of the dataPosicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPosicao(String value) {
        this.dataPosicao = value;
    }

    /**
     * Gets the value of the horimetro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorimetro() {
        return horimetro;
    }

    /**
     * Sets the value of the horimetro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorimetro(Integer value) {
        this.horimetro = value;
    }

    /**
     * Gets the value of the idEvento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEvento() {
        return idEvento;
    }

    /**
     * Sets the value of the idEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEvento(Integer value) {
        this.idEvento = value;
    }

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
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the loginMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginMotorista() {
        return loginMotorista;
    }

    /**
     * Sets the value of the loginMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginMotorista(Integer value) {
        this.loginMotorista = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the odometro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdometro() {
        return odometro;
    }

    /**
     * Sets the value of the odometro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdometro(String value) {
        this.odometro = value;
    }

    /**
     * Gets the value of the tempoDuracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracao() {
        return tempoDuracao;
    }

    /**
     * Sets the value of the tempoDuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracao(Integer value) {
        this.tempoDuracao = value;
    }

}
