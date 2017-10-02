
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for veiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="veiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAtuador1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idEquipamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idLayout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idProjeto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSerial0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSerial1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portaBloqueio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portaPanico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="satelital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="telemetria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "veiculo", propOrder = {
    "descricao",
    "esn",
    "idAtuador1",
    "idAtuador2",
    "idAtuador3",
    "idAtuador4",
    "idAtuador5",
    "idAtuador6",
    "idAtuador7",
    "idAtuador8",
    "idCliente",
    "idEquipamento",
    "idLayout",
    "idProjeto",
    "idSensor1",
    "idSensor2",
    "idSensor3",
    "idSensor4",
    "idSensor5",
    "idSensor6",
    "idSensor7",
    "idSensor8",
    "idSerial0",
    "idSerial1",
    "idVeiculo",
    "placa",
    "portaBloqueio",
    "portaPanico",
    "satelital",
    "telemetria"
})
public class Veiculo {

    protected String descricao;
    protected String esn;
    protected Integer idAtuador1;
    protected Integer idAtuador2;
    protected Integer idAtuador3;
    protected Integer idAtuador4;
    protected Integer idAtuador5;
    protected Integer idAtuador6;
    protected Integer idAtuador7;
    protected Integer idAtuador8;
    protected Integer idCliente;
    protected Long idEquipamento;
    protected Integer idLayout;
    protected Integer idProjeto;
    protected Integer idSensor1;
    protected Integer idSensor2;
    protected Integer idSensor3;
    protected Integer idSensor4;
    protected Integer idSensor5;
    protected Integer idSensor6;
    protected Integer idSensor7;
    protected Integer idSensor8;
    protected Integer idSerial0;
    protected Integer idSerial1;
    protected Integer idVeiculo;
    protected String placa;
    protected Integer portaBloqueio;
    protected Integer portaPanico;
    protected boolean satelital;
    protected boolean telemetria;

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the esn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Gets the value of the idAtuador1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador1() {
        return idAtuador1;
    }

    /**
     * Sets the value of the idAtuador1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador1(Integer value) {
        this.idAtuador1 = value;
    }

    /**
     * Gets the value of the idAtuador2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador2() {
        return idAtuador2;
    }

    /**
     * Sets the value of the idAtuador2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador2(Integer value) {
        this.idAtuador2 = value;
    }

    /**
     * Gets the value of the idAtuador3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador3() {
        return idAtuador3;
    }

    /**
     * Sets the value of the idAtuador3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador3(Integer value) {
        this.idAtuador3 = value;
    }

    /**
     * Gets the value of the idAtuador4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador4() {
        return idAtuador4;
    }

    /**
     * Sets the value of the idAtuador4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador4(Integer value) {
        this.idAtuador4 = value;
    }

    /**
     * Gets the value of the idAtuador5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador5() {
        return idAtuador5;
    }

    /**
     * Sets the value of the idAtuador5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador5(Integer value) {
        this.idAtuador5 = value;
    }

    /**
     * Gets the value of the idAtuador6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador6() {
        return idAtuador6;
    }

    /**
     * Sets the value of the idAtuador6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador6(Integer value) {
        this.idAtuador6 = value;
    }

    /**
     * Gets the value of the idAtuador7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador7() {
        return idAtuador7;
    }

    /**
     * Sets the value of the idAtuador7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador7(Integer value) {
        this.idAtuador7 = value;
    }

    /**
     * Gets the value of the idAtuador8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador8() {
        return idAtuador8;
    }

    /**
     * Sets the value of the idAtuador8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador8(Integer value) {
        this.idAtuador8 = value;
    }

    /**
     * Gets the value of the idCliente property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the idEquipamento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEquipamento() {
        return idEquipamento;
    }

    /**
     * Sets the value of the idEquipamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEquipamento(Long value) {
        this.idEquipamento = value;
    }

    /**
     * Gets the value of the idLayout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLayout() {
        return idLayout;
    }

    /**
     * Sets the value of the idLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLayout(Integer value) {
        this.idLayout = value;
    }

    /**
     * Gets the value of the idProjeto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProjeto() {
        return idProjeto;
    }

    /**
     * Sets the value of the idProjeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProjeto(Integer value) {
        this.idProjeto = value;
    }

    /**
     * Gets the value of the idSensor1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor1() {
        return idSensor1;
    }

    /**
     * Sets the value of the idSensor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor1(Integer value) {
        this.idSensor1 = value;
    }

    /**
     * Gets the value of the idSensor2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor2() {
        return idSensor2;
    }

    /**
     * Sets the value of the idSensor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor2(Integer value) {
        this.idSensor2 = value;
    }

    /**
     * Gets the value of the idSensor3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor3() {
        return idSensor3;
    }

    /**
     * Sets the value of the idSensor3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor3(Integer value) {
        this.idSensor3 = value;
    }

    /**
     * Gets the value of the idSensor4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor4() {
        return idSensor4;
    }

    /**
     * Sets the value of the idSensor4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor4(Integer value) {
        this.idSensor4 = value;
    }

    /**
     * Gets the value of the idSensor5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor5() {
        return idSensor5;
    }

    /**
     * Sets the value of the idSensor5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor5(Integer value) {
        this.idSensor5 = value;
    }

    /**
     * Gets the value of the idSensor6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor6() {
        return idSensor6;
    }

    /**
     * Sets the value of the idSensor6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor6(Integer value) {
        this.idSensor6 = value;
    }

    /**
     * Gets the value of the idSensor7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor7() {
        return idSensor7;
    }

    /**
     * Sets the value of the idSensor7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor7(Integer value) {
        this.idSensor7 = value;
    }

    /**
     * Gets the value of the idSensor8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor8() {
        return idSensor8;
    }

    /**
     * Sets the value of the idSensor8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor8(Integer value) {
        this.idSensor8 = value;
    }

    /**
     * Gets the value of the idSerial0 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSerial0() {
        return idSerial0;
    }

    /**
     * Sets the value of the idSerial0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSerial0(Integer value) {
        this.idSerial0 = value;
    }

    /**
     * Gets the value of the idSerial1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSerial1() {
        return idSerial1;
    }

    /**
     * Sets the value of the idSerial1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSerial1(Integer value) {
        this.idSerial1 = value;
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
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the portaBloqueio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortaBloqueio() {
        return portaBloqueio;
    }

    /**
     * Sets the value of the portaBloqueio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortaBloqueio(Integer value) {
        this.portaBloqueio = value;
    }

    /**
     * Gets the value of the portaPanico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortaPanico() {
        return portaPanico;
    }

    /**
     * Sets the value of the portaPanico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortaPanico(Integer value) {
        this.portaPanico = value;
    }

    /**
     * Gets the value of the satelital property.
     * 
     */
    public boolean isSatelital() {
        return satelital;
    }

    /**
     * Sets the value of the satelital property.
     * 
     */
    public void setSatelital(boolean value) {
        this.satelital = value;
    }

    /**
     * Gets the value of the telemetria property.
     * 
     */
    public boolean isTelemetria() {
        return telemetria;
    }

    /**
     * Sets the value of the telemetria property.
     * 
     */
    public void setTelemetria(boolean value) {
        this.telemetria = value;
    }

}
