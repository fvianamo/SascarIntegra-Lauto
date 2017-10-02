
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for atualizarSenha complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atualizarSenha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senhaAtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="novaSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atualizarSenha", propOrder = {
    "usuario",
    "senhaAtual",
    "novaSenha"
})
public class AtualizarSenha {

    protected String usuario;
    protected String senhaAtual;
    protected String novaSenha;

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
     * Gets the value of the senhaAtual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaAtual() {
        return senhaAtual;
    }

    /**
     * Sets the value of the senhaAtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaAtual(String value) {
        this.senhaAtual = value;
    }

    /**
     * Gets the value of the novaSenha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovaSenha() {
        return novaSenha;
    }

    /**
     * Sets the value of the novaSenha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovaSenha(String value) {
        this.novaSenha = value;
    }

}
