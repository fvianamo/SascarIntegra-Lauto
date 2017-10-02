
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deltaTelemetria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deltaTelemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distanciaPercorrida" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaPercorridaEmbreagemAcionada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaPercorridaFreioAcionado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="horimetro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="loginMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpmMaximo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rpmMedia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaAzul" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVermelha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFreioMotor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoGiroMotor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoMovimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoParado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDelta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidadeMaximaFaixaAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidadeMedia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deltaTelemetria", propOrder = {
    "dataPosicao",
    "distanciaPercorrida",
    "distanciaPercorridaEmbreagemAcionada",
    "distanciaPercorridaFreioAcionado",
    "horimetro",
    "idMotorista",
    "idVeiculo",
    "latitude",
    "loginMotorista",
    "longitude",
    "odometro",
    "rpmMaximo",
    "rpmMedia",
    "tempoDuracaoFaixaAmarela",
    "tempoDuracaoFaixaAzul",
    "tempoDuracaoFaixaVerde",
    "tempoDuracaoFaixaVermelha",
    "tempoDuracaoFreioMotor",
    "tempoDuracaoGiroMotor",
    "tempoDuracaoMovimento",
    "tempoDuracaoParado",
    "tempoDuracaoTotal",
    "tipoDelta",
    "velocidadeMaximaFaixaAmarela",
    "velocidadeMedia"
})
public class DeltaTelemetria {

    protected String dataPosicao;
    protected Integer distanciaPercorrida;
    protected Integer distanciaPercorridaEmbreagemAcionada;
    protected Integer distanciaPercorridaFreioAcionado;
    protected Integer horimetro;
    protected Integer idMotorista;
    protected Integer idVeiculo;
    protected Double latitude;
    protected Integer loginMotorista;
    protected Double longitude;
    protected String odometro;
    protected Integer rpmMaximo;
    protected Integer rpmMedia;
    protected Integer tempoDuracaoFaixaAmarela;
    protected Integer tempoDuracaoFaixaAzul;
    protected Integer tempoDuracaoFaixaVerde;
    protected Integer tempoDuracaoFaixaVermelha;
    protected Integer tempoDuracaoFreioMotor;
    protected Integer tempoDuracaoGiroMotor;
    protected Integer tempoDuracaoMovimento;
    protected Integer tempoDuracaoParado;
    protected Integer tempoDuracaoTotal;
    protected Integer tipoDelta;
    protected Integer velocidadeMaximaFaixaAmarela;
    protected Integer velocidadeMedia;

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
     * Gets the value of the distanciaPercorrida property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    /**
     * Sets the value of the distanciaPercorrida property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaPercorrida(Integer value) {
        this.distanciaPercorrida = value;
    }

    /**
     * Gets the value of the distanciaPercorridaEmbreagemAcionada property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaPercorridaEmbreagemAcionada() {
        return distanciaPercorridaEmbreagemAcionada;
    }

    /**
     * Sets the value of the distanciaPercorridaEmbreagemAcionada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaPercorridaEmbreagemAcionada(Integer value) {
        this.distanciaPercorridaEmbreagemAcionada = value;
    }

    /**
     * Gets the value of the distanciaPercorridaFreioAcionado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaPercorridaFreioAcionado() {
        return distanciaPercorridaFreioAcionado;
    }

    /**
     * Sets the value of the distanciaPercorridaFreioAcionado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaPercorridaFreioAcionado(Integer value) {
        this.distanciaPercorridaFreioAcionado = value;
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
     * Gets the value of the rpmMaximo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRpmMaximo() {
        return rpmMaximo;
    }

    /**
     * Sets the value of the rpmMaximo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRpmMaximo(Integer value) {
        this.rpmMaximo = value;
    }

    /**
     * Gets the value of the rpmMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRpmMedia() {
        return rpmMedia;
    }

    /**
     * Sets the value of the rpmMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRpmMedia(Integer value) {
        this.rpmMedia = value;
    }

    /**
     * Gets the value of the tempoDuracaoFaixaAmarela property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaAmarela() {
        return tempoDuracaoFaixaAmarela;
    }

    /**
     * Sets the value of the tempoDuracaoFaixaAmarela property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaAmarela(Integer value) {
        this.tempoDuracaoFaixaAmarela = value;
    }

    /**
     * Gets the value of the tempoDuracaoFaixaAzul property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaAzul() {
        return tempoDuracaoFaixaAzul;
    }

    /**
     * Sets the value of the tempoDuracaoFaixaAzul property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaAzul(Integer value) {
        this.tempoDuracaoFaixaAzul = value;
    }

    /**
     * Gets the value of the tempoDuracaoFaixaVerde property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVerde() {
        return tempoDuracaoFaixaVerde;
    }

    /**
     * Sets the value of the tempoDuracaoFaixaVerde property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVerde(Integer value) {
        this.tempoDuracaoFaixaVerde = value;
    }

    /**
     * Gets the value of the tempoDuracaoFaixaVermelha property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVermelha() {
        return tempoDuracaoFaixaVermelha;
    }

    /**
     * Sets the value of the tempoDuracaoFaixaVermelha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVermelha(Integer value) {
        this.tempoDuracaoFaixaVermelha = value;
    }

    /**
     * Gets the value of the tempoDuracaoFreioMotor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFreioMotor() {
        return tempoDuracaoFreioMotor;
    }

    /**
     * Sets the value of the tempoDuracaoFreioMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFreioMotor(Integer value) {
        this.tempoDuracaoFreioMotor = value;
    }

    /**
     * Gets the value of the tempoDuracaoGiroMotor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoGiroMotor() {
        return tempoDuracaoGiroMotor;
    }

    /**
     * Sets the value of the tempoDuracaoGiroMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoGiroMotor(Integer value) {
        this.tempoDuracaoGiroMotor = value;
    }

    /**
     * Gets the value of the tempoDuracaoMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoMovimento() {
        return tempoDuracaoMovimento;
    }

    /**
     * Sets the value of the tempoDuracaoMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoMovimento(Integer value) {
        this.tempoDuracaoMovimento = value;
    }

    /**
     * Gets the value of the tempoDuracaoParado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoParado() {
        return tempoDuracaoParado;
    }

    /**
     * Sets the value of the tempoDuracaoParado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoParado(Integer value) {
        this.tempoDuracaoParado = value;
    }

    /**
     * Gets the value of the tempoDuracaoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoTotal() {
        return tempoDuracaoTotal;
    }

    /**
     * Sets the value of the tempoDuracaoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoTotal(Integer value) {
        this.tempoDuracaoTotal = value;
    }

    /**
     * Gets the value of the tipoDelta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDelta() {
        return tipoDelta;
    }

    /**
     * Sets the value of the tipoDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDelta(Integer value) {
        this.tipoDelta = value;
    }

    /**
     * Gets the value of the velocidadeMaximaFaixaAmarela property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidadeMaximaFaixaAmarela() {
        return velocidadeMaximaFaixaAmarela;
    }

    /**
     * Sets the value of the velocidadeMaximaFaixaAmarela property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidadeMaximaFaixaAmarela(Integer value) {
        this.velocidadeMaximaFaixaAmarela = value;
    }

    /**
     * Gets the value of the velocidadeMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidadeMedia() {
        return velocidadeMedia;
    }

    /**
     * Sets the value of the velocidadeMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidadeMedia(Integer value) {
        this.velocidadeMedia = value;
    }

}
