
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pacotePosicaoRFNacional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pacotePosicaoRFNacional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPacote" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idPacote" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="integradoraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jamming" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacotePosicaoRFNacional", propOrder = {
    "ccid",
    "cidade",
    "dataPacote",
    "dataPosicao",
    "idPacote",
    "idVeiculo",
    "integradoraId",
    "jamming",
    "latitude",
    "longitude",
    "rf",
    "rua",
    "uf"
})
public class PacotePosicaoRFNacional {

    protected String ccid;
    protected String cidade;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPacote;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPosicao;
    protected long idPacote;
    protected Integer idVeiculo;
    protected Integer integradoraId;
    protected Integer jamming;
    protected Double latitude;
    protected Double longitude;
    protected Long rf;
    protected String rua;
    protected String uf;

    /**
     * Gets the value of the ccid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcid() {
        return ccid;
    }

    /**
     * Sets the value of the ccid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcid(String value) {
        this.ccid = value;
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the dataPacote property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPacote() {
        return dataPacote;
    }

    /**
     * Sets the value of the dataPacote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPacote(XMLGregorianCalendar value) {
        this.dataPacote = value;
    }

    /**
     * Gets the value of the dataPosicao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Sets the value of the dataPosicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPosicao(XMLGregorianCalendar value) {
        this.dataPosicao = value;
    }

    /**
     * Gets the value of the idPacote property.
     * 
     */
    public long getIdPacote() {
        return idPacote;
    }

    /**
     * Sets the value of the idPacote property.
     * 
     */
    public void setIdPacote(long value) {
        this.idPacote = value;
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
     * Gets the value of the integradoraId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegradoraId() {
        return integradoraId;
    }

    /**
     * Sets the value of the integradoraId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegradoraId(Integer value) {
        this.integradoraId = value;
    }

    /**
     * Gets the value of the jamming property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJamming() {
        return jamming;
    }

    /**
     * Sets the value of the jamming property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJamming(Integer value) {
        this.jamming = value;
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
     * Gets the value of the rf property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRf() {
        return rf;
    }

    /**
     * Sets the value of the rf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRf(Long value) {
        this.rf = value;
    }

    /**
     * Gets the value of the rua property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRua() {
        return rua;
    }

    /**
     * Sets the value of the rua property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRua(String value) {
        this.rua = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
