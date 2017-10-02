
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telemetriaConfiguracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telemetriaConfiguracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrancadaBruscaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="banguelaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="banguelaVelocidadeMinima" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="buzzerEstadoEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorTensaoMaxima" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorTensaoMinima" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorTensaoNormalOperacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoTempoParadoSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaRodoviarioComChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaRodoviarioSemChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaTrechoUrbanoComChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaTrechoUrbanoSemChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaAzulLimitSuperior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaAzulLimiteInferior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaVerdeLimiteInferior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaVerdeLimiteSuperior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaVermelhaLimite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fimChuvaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freadaBruscaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignicaoExessivaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inicioChuvaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="marchaLentaExessivaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="peEmbreagemSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pressaoOleoSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rotacaoSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetriaConfiguracao", propOrder = {
    "arrancadaBruscaSensibilidadeInfracao",
    "banguelaSensibilidadeInfracao",
    "banguelaVelocidadeMinima",
    "buzzerEstadoEvento",
    "defeitoAlternadorSensibilidadeInfracao",
    "defeitoAlternadorTensaoMaxima",
    "defeitoAlternadorTensaoMinima",
    "defeitoAlternadorTensaoNormalOperacao",
    "excessoTempoParadoSensibilidadeInfracao",
    "excessoVelocidadeMaximaRodoviarioComChuva",
    "excessoVelocidadeMaximaRodoviarioSemChuva",
    "excessoVelocidadeMaximaTrechoUrbanoComChuva",
    "excessoVelocidadeMaximaTrechoUrbanoSemChuva",
    "excessoVelocidadeSensibilidadeInfracao",
    "faixaAzulLimitSuperior",
    "faixaAzulLimiteInferior",
    "faixaVerdeLimiteInferior",
    "faixaVerdeLimiteSuperior",
    "faixaVermelhaLimite",
    "fimChuvaSensibilidadeInfracao",
    "freadaBruscaSensibilidadeInfracao",
    "ignicaoExessivaSensibilidadeInfracao",
    "inicioChuvaSensibilidadeInfracao",
    "marchaLentaExessivaSensibilidadeInfracao",
    "peEmbreagemSensibilidadeInfracao",
    "pressaoOleoSensibilidadeInfracao",
    "rotacaoSensibilidadeInfracao",
    "tipoVeiculo"
})
public class TelemetriaConfiguracao {

    protected Integer arrancadaBruscaSensibilidadeInfracao;
    protected Integer banguelaSensibilidadeInfracao;
    protected Integer banguelaVelocidadeMinima;
    protected Integer buzzerEstadoEvento;
    protected Integer defeitoAlternadorSensibilidadeInfracao;
    protected Float defeitoAlternadorTensaoMaxima;
    protected Float defeitoAlternadorTensaoMinima;
    protected Integer defeitoAlternadorTensaoNormalOperacao;
    protected Integer excessoTempoParadoSensibilidadeInfracao;
    protected Integer excessoVelocidadeMaximaRodoviarioComChuva;
    protected Integer excessoVelocidadeMaximaRodoviarioSemChuva;
    protected Integer excessoVelocidadeMaximaTrechoUrbanoComChuva;
    protected Integer excessoVelocidadeMaximaTrechoUrbanoSemChuva;
    protected Integer excessoVelocidadeSensibilidadeInfracao;
    protected Integer faixaAzulLimitSuperior;
    protected Integer faixaAzulLimiteInferior;
    protected Integer faixaVerdeLimiteInferior;
    protected Integer faixaVerdeLimiteSuperior;
    protected Integer faixaVermelhaLimite;
    protected Integer fimChuvaSensibilidadeInfracao;
    protected Integer freadaBruscaSensibilidadeInfracao;
    protected Integer ignicaoExessivaSensibilidadeInfracao;
    protected Integer inicioChuvaSensibilidadeInfracao;
    protected Integer marchaLentaExessivaSensibilidadeInfracao;
    protected Integer peEmbreagemSensibilidadeInfracao;
    protected Integer pressaoOleoSensibilidadeInfracao;
    protected Integer rotacaoSensibilidadeInfracao;
    protected String tipoVeiculo;

    /**
     * Gets the value of the arrancadaBruscaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrancadaBruscaSensibilidadeInfracao() {
        return arrancadaBruscaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the arrancadaBruscaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrancadaBruscaSensibilidadeInfracao(Integer value) {
        this.arrancadaBruscaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the banguelaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBanguelaSensibilidadeInfracao() {
        return banguelaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the banguelaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBanguelaSensibilidadeInfracao(Integer value) {
        this.banguelaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the banguelaVelocidadeMinima property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBanguelaVelocidadeMinima() {
        return banguelaVelocidadeMinima;
    }

    /**
     * Sets the value of the banguelaVelocidadeMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBanguelaVelocidadeMinima(Integer value) {
        this.banguelaVelocidadeMinima = value;
    }

    /**
     * Gets the value of the buzzerEstadoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuzzerEstadoEvento() {
        return buzzerEstadoEvento;
    }

    /**
     * Sets the value of the buzzerEstadoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuzzerEstadoEvento(Integer value) {
        this.buzzerEstadoEvento = value;
    }

    /**
     * Gets the value of the defeitoAlternadorSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefeitoAlternadorSensibilidadeInfracao() {
        return defeitoAlternadorSensibilidadeInfracao;
    }

    /**
     * Sets the value of the defeitoAlternadorSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefeitoAlternadorSensibilidadeInfracao(Integer value) {
        this.defeitoAlternadorSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the defeitoAlternadorTensaoMaxima property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefeitoAlternadorTensaoMaxima() {
        return defeitoAlternadorTensaoMaxima;
    }

    /**
     * Sets the value of the defeitoAlternadorTensaoMaxima property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefeitoAlternadorTensaoMaxima(Float value) {
        this.defeitoAlternadorTensaoMaxima = value;
    }

    /**
     * Gets the value of the defeitoAlternadorTensaoMinima property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefeitoAlternadorTensaoMinima() {
        return defeitoAlternadorTensaoMinima;
    }

    /**
     * Sets the value of the defeitoAlternadorTensaoMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefeitoAlternadorTensaoMinima(Float value) {
        this.defeitoAlternadorTensaoMinima = value;
    }

    /**
     * Gets the value of the defeitoAlternadorTensaoNormalOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefeitoAlternadorTensaoNormalOperacao() {
        return defeitoAlternadorTensaoNormalOperacao;
    }

    /**
     * Sets the value of the defeitoAlternadorTensaoNormalOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefeitoAlternadorTensaoNormalOperacao(Integer value) {
        this.defeitoAlternadorTensaoNormalOperacao = value;
    }

    /**
     * Gets the value of the excessoTempoParadoSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoTempoParadoSensibilidadeInfracao() {
        return excessoTempoParadoSensibilidadeInfracao;
    }

    /**
     * Sets the value of the excessoTempoParadoSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoTempoParadoSensibilidadeInfracao(Integer value) {
        this.excessoTempoParadoSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the excessoVelocidadeMaximaRodoviarioComChuva property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaRodoviarioComChuva() {
        return excessoVelocidadeMaximaRodoviarioComChuva;
    }

    /**
     * Sets the value of the excessoVelocidadeMaximaRodoviarioComChuva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaRodoviarioComChuva(Integer value) {
        this.excessoVelocidadeMaximaRodoviarioComChuva = value;
    }

    /**
     * Gets the value of the excessoVelocidadeMaximaRodoviarioSemChuva property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaRodoviarioSemChuva() {
        return excessoVelocidadeMaximaRodoviarioSemChuva;
    }

    /**
     * Sets the value of the excessoVelocidadeMaximaRodoviarioSemChuva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaRodoviarioSemChuva(Integer value) {
        this.excessoVelocidadeMaximaRodoviarioSemChuva = value;
    }

    /**
     * Gets the value of the excessoVelocidadeMaximaTrechoUrbanoComChuva property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaTrechoUrbanoComChuva() {
        return excessoVelocidadeMaximaTrechoUrbanoComChuva;
    }

    /**
     * Sets the value of the excessoVelocidadeMaximaTrechoUrbanoComChuva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaTrechoUrbanoComChuva(Integer value) {
        this.excessoVelocidadeMaximaTrechoUrbanoComChuva = value;
    }

    /**
     * Gets the value of the excessoVelocidadeMaximaTrechoUrbanoSemChuva property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaTrechoUrbanoSemChuva() {
        return excessoVelocidadeMaximaTrechoUrbanoSemChuva;
    }

    /**
     * Sets the value of the excessoVelocidadeMaximaTrechoUrbanoSemChuva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaTrechoUrbanoSemChuva(Integer value) {
        this.excessoVelocidadeMaximaTrechoUrbanoSemChuva = value;
    }

    /**
     * Gets the value of the excessoVelocidadeSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeSensibilidadeInfracao() {
        return excessoVelocidadeSensibilidadeInfracao;
    }

    /**
     * Sets the value of the excessoVelocidadeSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeSensibilidadeInfracao(Integer value) {
        this.excessoVelocidadeSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the faixaAzulLimitSuperior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaAzulLimitSuperior() {
        return faixaAzulLimitSuperior;
    }

    /**
     * Sets the value of the faixaAzulLimitSuperior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaAzulLimitSuperior(Integer value) {
        this.faixaAzulLimitSuperior = value;
    }

    /**
     * Gets the value of the faixaAzulLimiteInferior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaAzulLimiteInferior() {
        return faixaAzulLimiteInferior;
    }

    /**
     * Sets the value of the faixaAzulLimiteInferior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaAzulLimiteInferior(Integer value) {
        this.faixaAzulLimiteInferior = value;
    }

    /**
     * Gets the value of the faixaVerdeLimiteInferior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaVerdeLimiteInferior() {
        return faixaVerdeLimiteInferior;
    }

    /**
     * Sets the value of the faixaVerdeLimiteInferior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaVerdeLimiteInferior(Integer value) {
        this.faixaVerdeLimiteInferior = value;
    }

    /**
     * Gets the value of the faixaVerdeLimiteSuperior property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaVerdeLimiteSuperior() {
        return faixaVerdeLimiteSuperior;
    }

    /**
     * Sets the value of the faixaVerdeLimiteSuperior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaVerdeLimiteSuperior(Integer value) {
        this.faixaVerdeLimiteSuperior = value;
    }

    /**
     * Gets the value of the faixaVermelhaLimite property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaVermelhaLimite() {
        return faixaVermelhaLimite;
    }

    /**
     * Sets the value of the faixaVermelhaLimite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaVermelhaLimite(Integer value) {
        this.faixaVermelhaLimite = value;
    }

    /**
     * Gets the value of the fimChuvaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFimChuvaSensibilidadeInfracao() {
        return fimChuvaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the fimChuvaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFimChuvaSensibilidadeInfracao(Integer value) {
        this.fimChuvaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the freadaBruscaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreadaBruscaSensibilidadeInfracao() {
        return freadaBruscaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the freadaBruscaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreadaBruscaSensibilidadeInfracao(Integer value) {
        this.freadaBruscaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the ignicaoExessivaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnicaoExessivaSensibilidadeInfracao() {
        return ignicaoExessivaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the ignicaoExessivaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnicaoExessivaSensibilidadeInfracao(Integer value) {
        this.ignicaoExessivaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the inicioChuvaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInicioChuvaSensibilidadeInfracao() {
        return inicioChuvaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the inicioChuvaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInicioChuvaSensibilidadeInfracao(Integer value) {
        this.inicioChuvaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the marchaLentaExessivaSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarchaLentaExessivaSensibilidadeInfracao() {
        return marchaLentaExessivaSensibilidadeInfracao;
    }

    /**
     * Sets the value of the marchaLentaExessivaSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarchaLentaExessivaSensibilidadeInfracao(Integer value) {
        this.marchaLentaExessivaSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the peEmbreagemSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeEmbreagemSensibilidadeInfracao() {
        return peEmbreagemSensibilidadeInfracao;
    }

    /**
     * Sets the value of the peEmbreagemSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeEmbreagemSensibilidadeInfracao(Integer value) {
        this.peEmbreagemSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the pressaoOleoSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPressaoOleoSensibilidadeInfracao() {
        return pressaoOleoSensibilidadeInfracao;
    }

    /**
     * Sets the value of the pressaoOleoSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPressaoOleoSensibilidadeInfracao(Integer value) {
        this.pressaoOleoSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the rotacaoSensibilidadeInfracao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRotacaoSensibilidadeInfracao() {
        return rotacaoSensibilidadeInfracao;
    }

    /**
     * Sets the value of the rotacaoSensibilidadeInfracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotacaoSensibilidadeInfracao(Integer value) {
        this.rotacaoSensibilidadeInfracao = value;
    }

    /**
     * Gets the value of the tipoVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * Sets the value of the tipoVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVeiculo(String value) {
        this.tipoVeiculo = value;
    }

}
