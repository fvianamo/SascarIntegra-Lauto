
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telemetria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="embreagem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estadoLimpadorParabrisa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="motorFuncionando" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetria", propOrder = {
    "embreagem",
    "estadoLimpadorParabrisa",
    "freio",
    "motorFuncionando"
})
public class Telemetria {

    protected Integer embreagem;
    protected Integer estadoLimpadorParabrisa;
    protected Integer freio;
    protected Integer motorFuncionando;

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

}
