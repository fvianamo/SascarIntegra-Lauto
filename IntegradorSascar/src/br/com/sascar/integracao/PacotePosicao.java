
package br.com.sascar.integracao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pacotePosicao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pacotePosicao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anguloReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bloqueio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conteudoMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPacote" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="direcao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="embreagem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estadoLimpadorParabrisa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eventoFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoSeqFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoSequenciamento" type="{http://webservice.web.integracao.sascar.com.br/}eventoSequenciamento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventos" type="{http://webservice.web.integracao.sascar.com.br/}evento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="freio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="horimetro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idPacote" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="integradoraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jamming" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memoria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="motorFuncionando" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomeMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pontoEntrada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pontoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pontoSaida" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saida1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="satelite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperatura1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperatura2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperatura3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tensao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="textoMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTeclado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="velocidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacotePosicao", propOrder = {
    "anguloReferencia",
    "bloqueio",
    "ccid",
    "cidade",
    "codigoMacro",
    "conteudoMensagem",
    "dataPacote",
    "dataPosicao",
    "direcao",
    "distanciaReferencia",
    "embreagem",
    "entrada1",
    "entrada2",
    "entrada3",
    "entrada4",
    "entrada5",
    "entrada6",
    "entrada7",
    "entrada8",
    "estadoLimpadorParabrisa",
    "eventoFormatado",
    "eventoSeqFormatado",
    "eventoSequenciamento",
    "eventos",
    "freio",
    "gps",
    "horimetro",
    "idPacote",
    "idReferencia",
    "idVeiculo",
    "ignicao",
    "integradoraId",
    "jamming",
    "latitude",
    "longitude",
    "memoria",
    "motorFuncionando",
    "nomeMensagem",
    "odometro",
    "pontoEntrada",
    "pontoReferencia",
    "pontoSaida",
    "rf",
    "rpm",
    "rua",
    "saida1",
    "saida2",
    "saida3",
    "saida4",
    "saida5",
    "saida6",
    "saida7",
    "saida8",
    "satelite",
    "temperatura1",
    "temperatura2",
    "temperatura3",
    "tensao",
    "textoMensagem",
    "tipoTeclado",
    "uf",
    "velocidade"
})
public class PacotePosicao {

    protected Integer anguloReferencia;
    protected Integer bloqueio;
    protected String ccid;
    protected String cidade;
    protected Integer codigoMacro;
    protected String conteudoMensagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPacote;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPosicao;
    protected Integer direcao;
    protected Integer distanciaReferencia;
    protected Integer embreagem;
    protected Integer entrada1;
    protected Integer entrada2;
    protected Integer entrada3;
    protected Integer entrada4;
    protected Integer entrada5;
    protected Integer entrada6;
    protected Integer entrada7;
    protected Integer entrada8;
    protected Integer estadoLimpadorParabrisa;
    protected String eventoFormatado;
    protected String eventoSeqFormatado;
    @XmlElement(nillable = true)
    protected List<EventoSequenciamento> eventoSequenciamento;
    @XmlElement(nillable = true)
    protected List<Evento> eventos;
    protected Integer freio;
    protected Integer gps;
    protected Integer horimetro;
    protected long idPacote;
    protected Integer idReferencia;
    protected Integer idVeiculo;
    protected Integer ignicao;
    protected Integer integradoraId;
    protected Integer jamming;
    protected Double latitude;
    protected Double longitude;
    protected Integer memoria;
    protected Integer motorFuncionando;
    protected String nomeMensagem;
    protected Integer odometro;
    protected Integer pontoEntrada;
    protected String pontoReferencia;
    protected Integer pontoSaida;
    protected Long rf;
    protected Integer rpm;
    protected String rua;
    protected Integer saida1;
    protected Integer saida2;
    protected Integer saida3;
    protected Integer saida4;
    protected Integer saida5;
    protected Integer saida6;
    protected Integer saida7;
    protected Integer saida8;
    protected Integer satelite;
    protected Integer temperatura1;
    protected Integer temperatura2;
    protected Integer temperatura3;
    protected Integer tensao;
    protected String textoMensagem;
    protected Integer tipoTeclado;
    protected String uf;
    protected Integer velocidade;

    /**
     * Gets the value of the anguloReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnguloReferencia() {
        return anguloReferencia;
    }

    /**
     * Sets the value of the anguloReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnguloReferencia(Integer value) {
        this.anguloReferencia = value;
    }

    /**
     * Gets the value of the bloqueio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBloqueio() {
        return bloqueio;
    }

    /**
     * Sets the value of the bloqueio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBloqueio(Integer value) {
        this.bloqueio = value;
    }

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
     * Gets the value of the codigoMacro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoMacro() {
        return codigoMacro;
    }

    /**
     * Sets the value of the codigoMacro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoMacro(Integer value) {
        this.codigoMacro = value;
    }

    /**
     * Gets the value of the conteudoMensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConteudoMensagem() {
        return conteudoMensagem;
    }

    /**
     * Sets the value of the conteudoMensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConteudoMensagem(String value) {
        this.conteudoMensagem = value;
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
     * Gets the value of the direcao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirecao() {
        return direcao;
    }

    /**
     * Sets the value of the direcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirecao(Integer value) {
        this.direcao = value;
    }

    /**
     * Gets the value of the distanciaReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaReferencia() {
        return distanciaReferencia;
    }

    /**
     * Sets the value of the distanciaReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaReferencia(Integer value) {
        this.distanciaReferencia = value;
    }

    /**
     * Gets the value of the embreagem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmbreagem() {
        return embreagem;
    }

    /**
     * Sets the value of the embreagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmbreagem(Integer value) {
        this.embreagem = value;
    }

    /**
     * Gets the value of the entrada1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada1() {
        return entrada1;
    }

    /**
     * Sets the value of the entrada1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada1(Integer value) {
        this.entrada1 = value;
    }

    /**
     * Gets the value of the entrada2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada2() {
        return entrada2;
    }

    /**
     * Sets the value of the entrada2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada2(Integer value) {
        this.entrada2 = value;
    }

    /**
     * Gets the value of the entrada3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada3() {
        return entrada3;
    }

    /**
     * Sets the value of the entrada3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada3(Integer value) {
        this.entrada3 = value;
    }

    /**
     * Gets the value of the entrada4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada4() {
        return entrada4;
    }

    /**
     * Sets the value of the entrada4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada4(Integer value) {
        this.entrada4 = value;
    }

    /**
     * Gets the value of the entrada5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada5() {
        return entrada5;
    }

    /**
     * Sets the value of the entrada5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada5(Integer value) {
        this.entrada5 = value;
    }

    /**
     * Gets the value of the entrada6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada6() {
        return entrada6;
    }

    /**
     * Sets the value of the entrada6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada6(Integer value) {
        this.entrada6 = value;
    }

    /**
     * Gets the value of the entrada7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada7() {
        return entrada7;
    }

    /**
     * Sets the value of the entrada7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada7(Integer value) {
        this.entrada7 = value;
    }

    /**
     * Gets the value of the entrada8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada8() {
        return entrada8;
    }

    /**
     * Sets the value of the entrada8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada8(Integer value) {
        this.entrada8 = value;
    }

    /**
     * Gets the value of the estadoLimpadorParabrisa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoLimpadorParabrisa() {
        return estadoLimpadorParabrisa;
    }

    /**
     * Sets the value of the estadoLimpadorParabrisa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoLimpadorParabrisa(Integer value) {
        this.estadoLimpadorParabrisa = value;
    }

    /**
     * Gets the value of the eventoFormatado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoFormatado() {
        return eventoFormatado;
    }

    /**
     * Sets the value of the eventoFormatado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoFormatado(String value) {
        this.eventoFormatado = value;
    }

    /**
     * Gets the value of the eventoSeqFormatado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoSeqFormatado() {
        return eventoSeqFormatado;
    }

    /**
     * Sets the value of the eventoSeqFormatado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoSeqFormatado(String value) {
        this.eventoSeqFormatado = value;
    }

    /**
     * Gets the value of the eventoSequenciamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventoSequenciamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventoSequenciamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventoSequenciamento }
     * 
     * 
     */
    public List<EventoSequenciamento> getEventoSequenciamento() {
        if (eventoSequenciamento == null) {
            eventoSequenciamento = new ArrayList<EventoSequenciamento>();
        }
        return this.eventoSequenciamento;
    }

    /**
     * Gets the value of the eventos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evento }
     * 
     * 
     */
    public List<Evento> getEventos() {
        if (eventos == null) {
            eventos = new ArrayList<Evento>();
        }
        return this.eventos;
    }

    /**
     * Gets the value of the freio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreio() {
        return freio;
    }

    /**
     * Sets the value of the freio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreio(Integer value) {
        this.freio = value;
    }

    /**
     * Gets the value of the gps property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGps() {
        return gps;
    }

    /**
     * Sets the value of the gps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGps(Integer value) {
        this.gps = value;
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
     * Gets the value of the idReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdReferencia() {
        return idReferencia;
    }

    /**
     * Sets the value of the idReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdReferencia(Integer value) {
        this.idReferencia = value;
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
     * Gets the value of the ignicao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnicao() {
        return ignicao;
    }

    /**
     * Sets the value of the ignicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnicao(Integer value) {
        this.ignicao = value;
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
     * Gets the value of the memoria property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemoria() {
        return memoria;
    }

    /**
     * Sets the value of the memoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemoria(Integer value) {
        this.memoria = value;
    }

    /**
     * Gets the value of the motorFuncionando property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotorFuncionando() {
        return motorFuncionando;
    }

    /**
     * Sets the value of the motorFuncionando property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotorFuncionando(Integer value) {
        this.motorFuncionando = value;
    }

    /**
     * Gets the value of the nomeMensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMensagem() {
        return nomeMensagem;
    }

    /**
     * Sets the value of the nomeMensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMensagem(String value) {
        this.nomeMensagem = value;
    }

    /**
     * Gets the value of the odometro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdometro() {
        return odometro;
    }

    /**
     * Sets the value of the odometro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdometro(Integer value) {
        this.odometro = value;
    }

    /**
     * Gets the value of the pontoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPontoEntrada() {
        return pontoEntrada;
    }

    /**
     * Sets the value of the pontoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPontoEntrada(Integer value) {
        this.pontoEntrada = value;
    }

    /**
     * Gets the value of the pontoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontoReferencia() {
        return pontoReferencia;
    }

    /**
     * Sets the value of the pontoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontoReferencia(String value) {
        this.pontoReferencia = value;
    }

    /**
     * Gets the value of the pontoSaida property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPontoSaida() {
        return pontoSaida;
    }

    /**
     * Sets the value of the pontoSaida property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPontoSaida(Integer value) {
        this.pontoSaida = value;
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
     * Gets the value of the rpm property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRpm() {
        return rpm;
    }

    /**
     * Sets the value of the rpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRpm(Integer value) {
        this.rpm = value;
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
     * Gets the value of the saida1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida1() {
        return saida1;
    }

    /**
     * Sets the value of the saida1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida1(Integer value) {
        this.saida1 = value;
    }

    /**
     * Gets the value of the saida2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida2() {
        return saida2;
    }

    /**
     * Sets the value of the saida2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida2(Integer value) {
        this.saida2 = value;
    }

    /**
     * Gets the value of the saida3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida3() {
        return saida3;
    }

    /**
     * Sets the value of the saida3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida3(Integer value) {
        this.saida3 = value;
    }

    /**
     * Gets the value of the saida4 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida4() {
        return saida4;
    }

    /**
     * Sets the value of the saida4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida4(Integer value) {
        this.saida4 = value;
    }

    /**
     * Gets the value of the saida5 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida5() {
        return saida5;
    }

    /**
     * Sets the value of the saida5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida5(Integer value) {
        this.saida5 = value;
    }

    /**
     * Gets the value of the saida6 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida6() {
        return saida6;
    }

    /**
     * Sets the value of the saida6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida6(Integer value) {
        this.saida6 = value;
    }

    /**
     * Gets the value of the saida7 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida7() {
        return saida7;
    }

    /**
     * Sets the value of the saida7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida7(Integer value) {
        this.saida7 = value;
    }

    /**
     * Gets the value of the saida8 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida8() {
        return saida8;
    }

    /**
     * Sets the value of the saida8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida8(Integer value) {
        this.saida8 = value;
    }

    /**
     * Gets the value of the satelite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSatelite() {
        return satelite;
    }

    /**
     * Sets the value of the satelite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSatelite(Integer value) {
        this.satelite = value;
    }

    /**
     * Gets the value of the temperatura1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperatura1() {
        return temperatura1;
    }

    /**
     * Sets the value of the temperatura1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperatura1(Integer value) {
        this.temperatura1 = value;
    }

    /**
     * Gets the value of the temperatura2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperatura2() {
        return temperatura2;
    }

    /**
     * Sets the value of the temperatura2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperatura2(Integer value) {
        this.temperatura2 = value;
    }

    /**
     * Gets the value of the temperatura3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperatura3() {
        return temperatura3;
    }

    /**
     * Sets the value of the temperatura3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperatura3(Integer value) {
        this.temperatura3 = value;
    }

    /**
     * Gets the value of the tensao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTensao() {
        return tensao;
    }

    /**
     * Sets the value of the tensao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTensao(Integer value) {
        this.tensao = value;
    }

    /**
     * Gets the value of the textoMensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoMensagem() {
        return textoMensagem;
    }

    /**
     * Sets the value of the textoMensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoMensagem(String value) {
        this.textoMensagem = value;
    }

    /**
     * Gets the value of the tipoTeclado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoTeclado() {
        return tipoTeclado;
    }

    /**
     * Sets the value of the tipoTeclado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoTeclado(Integer value) {
        this.tipoTeclado = value;
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

    /**
     * Gets the value of the velocidade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidade() {
        return velocidade;
    }

    /**
     * Sets the value of the velocidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidade(Integer value) {
        this.velocidade = value;
    }

}
