
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for layoutAcaoEmbarcadaAVD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="layoutAcaoEmbarcadaAVD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLayoutAcaoEmbarcadaAVD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layoutAcaoEmbarcadaAVD", propOrder = {
    "idLayoutAcaoEmbarcadaAVD",
    "nome"
})
public class LayoutAcaoEmbarcadaAVD {

    protected Integer idLayoutAcaoEmbarcadaAVD;
    protected String nome;

    /**
     * Gets the value of the idLayoutAcaoEmbarcadaAVD property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLayoutAcaoEmbarcadaAVD() {
        return idLayoutAcaoEmbarcadaAVD;
    }

    /**
     * Sets the value of the idLayoutAcaoEmbarcadaAVD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLayoutAcaoEmbarcadaAVD(Integer value) {
        this.idLayoutAcaoEmbarcadaAVD = value;
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

}
