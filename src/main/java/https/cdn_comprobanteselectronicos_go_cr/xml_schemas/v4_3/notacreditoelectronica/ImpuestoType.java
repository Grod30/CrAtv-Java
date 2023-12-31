//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.27 a las 10:17:15 AM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.notacreditoelectronica;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImpuestoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImpuestoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *               &lt;enumeration value="07"/>
 *               &lt;enumeration value="08"/>
 *               &lt;enumeration value="12"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodigoTarifa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;minLength value="2"/>
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *               &lt;enumeration value="07"/>
 *               &lt;enumeration value="08"/>
 *               &lt;enumeration value="09"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Tarifa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FactorIVA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Monto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType"/>
 *         &lt;element name="MontoExportacion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}DecimalDineroType" minOccurs="0"/>
 *         &lt;element name="Exoneracion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaCreditoElectronica}ExoneracionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpuestoType", propOrder = {
    "codigo",
    "codigoTarifa",
    "tarifa",
    "factorIVA",
    "monto",
    "montoExportacion",
    "exoneracion"
})
public class ImpuestoType {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "CodigoTarifa")
    protected String codigoTarifa;
    @XmlElement(name = "Tarifa")
    protected BigDecimal tarifa;
    @XmlElement(name = "FactorIVA")
    protected BigDecimal factorIVA;
    @XmlElement(name = "Monto", required = true)
    protected BigDecimal monto;
    @XmlElement(name = "MontoExportacion")
    protected BigDecimal montoExportacion;
    @XmlElement(name = "Exoneracion")
    protected ExoneracionType exoneracion;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTarifa() {
        return codigoTarifa;
    }

    /**
     * Define el valor de la propiedad codigoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTarifa(String value) {
        this.codigoTarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad tarifa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarifa() {
        return tarifa;
    }

    /**
     * Define el valor de la propiedad tarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarifa(BigDecimal value) {
        this.tarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad factorIVA.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFactorIVA() {
        return factorIVA;
    }

    /**
     * Define el valor de la propiedad factorIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFactorIVA(BigDecimal value) {
        this.factorIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoExportacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoExportacion() {
        return montoExportacion;
    }

    /**
     * Define el valor de la propiedad montoExportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoExportacion(BigDecimal value) {
        this.montoExportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad exoneracion.
     * 
     * @return
     *     possible object is
     *     {@link ExoneracionType }
     *     
     */
    public ExoneracionType getExoneracion() {
        return exoneracion;
    }

    /**
     * Define el valor de la propiedad exoneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link ExoneracionType }
     *     
     */
    public void setExoneracion(ExoneracionType value) {
        this.exoneracion = value;
    }

}
