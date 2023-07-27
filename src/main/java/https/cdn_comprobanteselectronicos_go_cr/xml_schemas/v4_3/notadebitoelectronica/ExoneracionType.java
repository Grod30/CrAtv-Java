//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.27 a las 10:18:13 AM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.notadebitoelectronica;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ExoneracionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExoneracionType">
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
 *         &lt;element name="NumeroDocumento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NombreInstitucion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="160"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PorcentajeExoneracion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="4"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MontoExoneracion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}DecimalDineroType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExoneracionType", propOrder = {
    "tipoDocumento",
    "numeroDocumento",
    "nombreInstitucion",
    "fechaEmision",
    "porcentajeExoneracion",
    "montoExoneracion"
})
public class ExoneracionType {

    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true)
    protected String numeroDocumento;
    @XmlElement(name = "NombreInstitucion", required = true)
    protected String nombreInstitucion;
    @XmlElement(name = "FechaEmision", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "PorcentajeExoneracion", required = true)
    protected BigDecimal porcentajeExoneracion;
    @XmlElement(name = "MontoExoneracion", required = true)
    protected BigDecimal montoExoneracion;

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
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    /**
     * Define el valor de la propiedad nombreInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreInstitucion(String value) {
        this.nombreInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeExoneracion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeExoneracion() {
        return porcentajeExoneracion;
    }

    /**
     * Define el valor de la propiedad porcentajeExoneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeExoneracion(BigDecimal value) {
        this.porcentajeExoneracion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoExoneracion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoExoneracion() {
        return montoExoneracion;
    }

    /**
     * Define el valor de la propiedad montoExoneracion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoExoneracion(BigDecimal value) {
        this.montoExoneracion = value;
    }

}
