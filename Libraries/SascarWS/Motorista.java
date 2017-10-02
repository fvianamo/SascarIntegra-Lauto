
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motorista complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motorista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataContratacao" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="generico" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCNH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vencimentoCNH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motorista", propOrder = {
    "celular",
    "dataContratacao",
    "generico",
    "idMotorista",
    "login",
    "nome",
    "numeroDocumento",
    "senha",
    "telefone",
    "tipoCNH",
    "tipoDocumento",
    "tipoMotorista",
    "vencimentoCNH"
})
public class Motorista {

    protected String celular;
    @XmlSchemaType(name = "anySimpleType")
    protected Object dataContratacao;
    protected Boolean generico;
    protected Integer idMotorista;
    protected String login;
    protected String nome;
    protected String numeroDocumento;
    protected String senha;
    protected String telefone;
    protected String tipoCNH;
    protected String tipoDocumento;
    protected String tipoMotorista;
    @XmlSchemaType(name = "anySimpleType")
    protected Object vencimentoCNH;

    /**
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Gets the value of the dataContratacao property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDataContratacao() {
        return dataContratacao;
    }

    /**
     * Sets the value of the dataContratacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDataContratacao(Object value) {
        this.dataContratacao = value;
    }

    /**
     * Gets the value of the generico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerico() {
        return generico;
    }

    /**
     * Sets the value of the generico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerico(Boolean value) {
        this.generico = value;
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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
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
     * Gets the value of the telefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets the value of the telefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Gets the value of the tipoCNH property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCNH() {
        return tipoCNH;
    }

    /**
     * Sets the value of the tipoCNH property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCNH(String value) {
        this.tipoCNH = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the tipoMotorista property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMotorista() {
        return tipoMotorista;
    }

    /**
     * Sets the value of the tipoMotorista property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMotorista(String value) {
        this.tipoMotorista = value;
    }

    /**
     * Gets the value of the vencimentoCNH property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVencimentoCNH() {
        return vencimentoCNH;
    }

    /**
     * Sets the value of the vencimentoCNH property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVencimentoCNH(Object value) {
        this.vencimentoCNH = value;
    }

}
