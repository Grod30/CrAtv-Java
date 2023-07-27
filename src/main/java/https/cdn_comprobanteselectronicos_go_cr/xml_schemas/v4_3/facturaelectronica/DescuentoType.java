//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.26 a las 11:02:36 PM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.facturaelectronica;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DescuentoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DescuentoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MontoDescuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronica}DecimalDineroType"/>
 *         &lt;element name="NaturalezaDescuento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescuentoType", propOrder = {
    "montoDescuento",
    "naturalezaDescuento"
})
public class DescuentoType {

    @XmlElement(name = "MontoDescuento", required = true)
    protected BigDecimal montoDescuento;
    @XmlElement(name = "NaturalezaDescuento", required = true)
    protected String naturalezaDescuento;

    /**
     * Obtiene el valor de la propiedad montoDescuento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDescuento() {
        return montoDescuento;
    }

    /**
     * Define el valor de la propiedad montoDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDescuento(BigDecimal value) {
        this.montoDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad naturalezaDescuento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaturalezaDescuento() {
        return naturalezaDescuento;
    }

    /**
     * Define el valor de la propiedad naturalezaDescuento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaturalezaDescuento(String value) {
        this.naturalezaDescuento = value;
    }

}
