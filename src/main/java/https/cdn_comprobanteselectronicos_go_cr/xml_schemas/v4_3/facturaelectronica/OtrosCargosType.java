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
 * <p>Clase Java para OtrosCargosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OtrosCargosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *               &lt;enumeration value="07"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroIdentidadTercero" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NombreTercero" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Detalle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="160"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Porcentaje" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="5"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MontoCargo" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronica}DecimalDineroType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtrosCargosType", propOrder = {
    "tipoDocumento",
    "numeroIdentidadTercero",
    "nombreTercero",
    "detalle",
    "porcentaje",
    "montoCargo"
})
public class OtrosCargosType {

    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "NumeroIdentidadTercero")
    protected String numeroIdentidadTercero;
    @XmlElement(name = "NombreTercero")
    protected String nombreTercero;
    @XmlElement(name = "Detalle", required = true)
    protected String detalle;
    @XmlElement(name = "Porcentaje")
    protected BigDecimal porcentaje;
    @XmlElement(name = "MontoCargo", required = true)
    protected BigDecimal montoCargo;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
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
     * Define el valor de la propiedad tipoDocumento.
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
     * Obtiene el valor de la propiedad numeroIdentidadTercero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIdentidadTercero() {
        return numeroIdentidadTercero;
    }

    /**
     * Define el valor de la propiedad numeroIdentidadTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIdentidadTercero(String value) {
        this.numeroIdentidadTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTercero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreTercero() {
        return nombreTercero;
    }

    /**
     * Define el valor de la propiedad nombreTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreTercero(String value) {
        this.nombreTercero = value;
    }

    /**
     * Obtiene el valor de la propiedad detalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Define el valor de la propiedad detalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalle(String value) {
        this.detalle = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Define el valor de la propiedad porcentaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCargo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoCargo() {
        return montoCargo;
    }

    /**
     * Define el valor de la propiedad montoCargo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoCargo(BigDecimal value) {
        this.montoCargo = value;
    }

}
