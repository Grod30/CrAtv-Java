//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.27 a las 10:16:02 AM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.mensajereceptor;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clave">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{50,50}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroCedulaEmisor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *               &lt;pattern value="\d{9,12}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FechaEmisionDoc" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Mensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DetalleMensaje" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="160"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MontoTotalImpuesto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodigoActividad" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CondicionImpuesto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MontoTotalImpuestoAcreditar" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor}DecimalDineroType" minOccurs="0"/>
 *         &lt;element name="MontoTotalDeGastoAplicable" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeReceptor}DecimalDineroType" minOccurs="0"/>
 *         &lt;element name="TotalFactura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroCedulaReceptor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *               &lt;pattern value="\d{9,12}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroConsecutivoReceptor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;pattern value="\d{20,20}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clave",
    "numeroCedulaEmisor",
    "fechaEmisionDoc",
    "mensaje",
    "detalleMensaje",
    "montoTotalImpuesto",
    "codigoActividad",
    "condicionImpuesto",
    "montoTotalImpuestoAcreditar",
    "montoTotalDeGastoAplicable",
    "totalFactura",
    "numeroCedulaReceptor",
    "numeroConsecutivoReceptor",
    "signature"
})
@XmlRootElement(name = "MensajeReceptor")
public class MensajeReceptor {

    @XmlElement(name = "Clave", required = true)
    protected String clave;
    @XmlElement(name = "NumeroCedulaEmisor", required = true)
    protected String numeroCedulaEmisor;
    @XmlElement(name = "FechaEmisionDoc", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmisionDoc;
    @XmlElement(name = "Mensaje", required = true)
    protected BigInteger mensaje;
    @XmlElement(name = "DetalleMensaje")
    protected String detalleMensaje;
    @XmlElement(name = "MontoTotalImpuesto")
    protected BigDecimal montoTotalImpuesto;
    @XmlElement(name = "CodigoActividad")
    protected String codigoActividad;
    @XmlElement(name = "CondicionImpuesto")
    protected String condicionImpuesto;
    @XmlElement(name = "MontoTotalImpuestoAcreditar")
    protected BigDecimal montoTotalImpuestoAcreditar;
    @XmlElement(name = "MontoTotalDeGastoAplicable")
    protected BigDecimal montoTotalDeGastoAplicable;
    @XmlElement(name = "TotalFactura", required = true)
    protected BigDecimal totalFactura;
    @XmlElement(name = "NumeroCedulaReceptor", required = true)
    protected String numeroCedulaReceptor;
    @XmlElement(name = "NumeroConsecutivoReceptor", required = true)
    protected String numeroConsecutivoReceptor;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCedulaEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaEmisor() {
        return numeroCedulaEmisor;
    }

    /**
     * Define el valor de la propiedad numeroCedulaEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaEmisor(String value) {
        this.numeroCedulaEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionDoc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmisionDoc() {
        return fechaEmisionDoc;
    }

    /**
     * Define el valor de la propiedad fechaEmisionDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmisionDoc(XMLGregorianCalendar value) {
        this.fechaEmisionDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMensaje(BigInteger value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleMensaje() {
        return detalleMensaje;
    }

    /**
     * Define el valor de la propiedad detalleMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleMensaje(String value) {
        this.detalleMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalImpuesto() {
        return montoTotalImpuesto;
    }

    /**
     * Define el valor de la propiedad montoTotalImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalImpuesto(BigDecimal value) {
        this.montoTotalImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoActividad() {
        return codigoActividad;
    }

    /**
     * Define el valor de la propiedad codigoActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoActividad(String value) {
        this.codigoActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad condicionImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondicionImpuesto() {
        return condicionImpuesto;
    }

    /**
     * Define el valor de la propiedad condicionImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondicionImpuesto(String value) {
        this.condicionImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalImpuestoAcreditar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalImpuestoAcreditar() {
        return montoTotalImpuestoAcreditar;
    }

    /**
     * Define el valor de la propiedad montoTotalImpuestoAcreditar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalImpuestoAcreditar(BigDecimal value) {
        this.montoTotalImpuestoAcreditar = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalDeGastoAplicable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalDeGastoAplicable() {
        return montoTotalDeGastoAplicable;
    }

    /**
     * Define el valor de la propiedad montoTotalDeGastoAplicable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalDeGastoAplicable(BigDecimal value) {
        this.montoTotalDeGastoAplicable = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFactura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalFactura() {
        return totalFactura;
    }

    /**
     * Define el valor de la propiedad totalFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalFactura(BigDecimal value) {
        this.totalFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCedulaReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaReceptor() {
        return numeroCedulaReceptor;
    }

    /**
     * Define el valor de la propiedad numeroCedulaReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaReceptor(String value) {
        this.numeroCedulaReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroConsecutivoReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConsecutivoReceptor() {
        return numeroConsecutivoReceptor;
    }

    /**
     * Define el valor de la propiedad numeroConsecutivoReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConsecutivoReceptor(String value) {
        this.numeroConsecutivoReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
