
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoLayout.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoLayout">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAYOUT_TD40"/>
 *     &lt;enumeration value="LAYOUT_TD50"/>
 *     &lt;enumeration value="LAYOUT_TMCD"/>
 *     &lt;enumeration value="LAYOUT_SEQUENCIAMENTO_TD50"/>
 *     &lt;enumeration value="LAYOUT_TMS3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoLayout")
@XmlEnum
public enum TipoLayout {

    @XmlEnumValue("LAYOUT_TD40")
    LAYOUT_TD_40("LAYOUT_TD40"),
    @XmlEnumValue("LAYOUT_TD50")
    LAYOUT_TD_50("LAYOUT_TD50"),
    LAYOUT_TMCD("LAYOUT_TMCD"),
    @XmlEnumValue("LAYOUT_SEQUENCIAMENTO_TD50")
    LAYOUT_SEQUENCIAMENTO_TD_50("LAYOUT_SEQUENCIAMENTO_TD50"),
    @XmlEnumValue("LAYOUT_TMS3")
    LAYOUT_TMS_3("LAYOUT_TMS3");
    private final String value;

    TipoLayout(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoLayout fromValue(String v) {
        for (TipoLayout c: TipoLayout.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
