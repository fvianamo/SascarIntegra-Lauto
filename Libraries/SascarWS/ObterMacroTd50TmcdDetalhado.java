
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obterMacroTd50TmcdDetalhado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obterMacroTd50TmcdDetalhado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTeclado" type="{http://webservice.web.integracao.sascar.com.br/}tipoTeclado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterMacroTd50TmcdDetalhado", propOrder = {
    "usuario",
    "senha",
    "tipoTeclado"
})
public class ObterMacroTd50TmcdDetalhado {

    protected String usuario;
    protected String senha;
    @XmlSchemaType(name = "string")
    protected TipoTeclado tipoTeclado;

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
     * Gets the value of the tipoTeclado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTeclado }
     *     
     */
    public TipoTeclado getTipoTeclado() {
        return tipoTeclado;
    }

    /**
     * Sets the value of the tipoTeclado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTeclado }
     *     
     */
    public void setTipoTeclado(TipoTeclado value) {
        this.tipoTeclado = value;
    }

}
