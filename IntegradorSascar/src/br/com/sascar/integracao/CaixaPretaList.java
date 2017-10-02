
package br.com.sascar.integracao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for caixaPretaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="caixaPretaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caixaPreta" type="{http://webservice.web.integracao.sascar.com.br/}caixaPreta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caixaPretaList", propOrder = {
    "caixaPreta"
})
public class CaixaPretaList {

    protected List<CaixaPreta> caixaPreta;

    /**
     * Gets the value of the caixaPreta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caixaPreta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCaixaPreta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CaixaPreta }
     * 
     * 
     */
    public List<CaixaPreta> getCaixaPreta() {
        if (caixaPreta == null) {
            caixaPreta = new ArrayList<CaixaPreta>();
        }
        return this.caixaPreta;
    }

}
