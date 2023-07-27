//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.26 a las 11:39:09 PM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.mensajehacienda;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="NombreEmisor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TipoIdentificacionEmisor">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
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
 *         &lt;element name="NombreReceptor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *               &lt;minLength value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TipoIdentificacionReceptor" minOccurs="0">
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
 *         &lt;element name="NumeroCedulaReceptor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *               &lt;pattern value="\d{9,12}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Mensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DetalleMensaje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
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
 *         &lt;element name="TotalFactura">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="18"/>
 *               &lt;fractionDigits value="5"/>
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
    "nombreEmisor",
    "tipoIdentificacionEmisor",
    "numeroCedulaEmisor",
    "nombreReceptor",
    "tipoIdentificacionReceptor",
    "numeroCedulaReceptor",
    "mensaje",
    "detalleMensaje",
    "montoTotalImpuesto",
    "totalFactura",
    "signature"
})
@XmlRootElement(name = "MensajeHacienda")
public class MensajeHacienda {

    @XmlElement(name = "Clave", required = true)
    protected String clave;
    @XmlElement(name = "NombreEmisor", required = true)
    protected String nombreEmisor;
    @XmlElement(name = "TipoIdentificacionEmisor", required = true)
    protected String tipoIdentificacionEmisor;
    @XmlElement(name = "NumeroCedulaEmisor", required = true)
    protected String numeroCedulaEmisor;
    @XmlElement(name = "NombreReceptor")
    protected String nombreReceptor;
    @XmlElementRef(name = "TipoIdentificacionReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeHacienda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoIdentificacionReceptor;
    @XmlElementRef(name = "NumeroCedulaReceptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeHacienda", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCedulaReceptor;
    @XmlElement(name = "Mensaje", required = true)
    protected BigInteger mensaje;
    @XmlElement(name = "DetalleMensaje", required = true)
    protected String detalleMensaje;
    @XmlElement(name = "MontoTotalImpuesto")
    protected BigDecimal montoTotalImpuesto;
    @XmlElement(name = "TotalFactura", required = true)
    protected BigDecimal totalFactura;
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
     * Obtiene el valor de la propiedad nombreEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmisor() {
        return nombreEmisor;
    }

    /**
     * Define el valor de la propiedad nombreEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmisor(String value) {
        this.nombreEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionEmisor() {
        return tipoIdentificacionEmisor;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionEmisor(String value) {
        this.tipoIdentificacionEmisor = value;
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
     * Obtiene el valor de la propiedad nombreReceptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreReceptor() {
        return nombreReceptor;
    }

    /**
     * Define el valor de la propiedad nombreReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreReceptor(String value) {
        this.nombreReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionReceptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoIdentificacionReceptor() {
        return tipoIdentificacionReceptor;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoIdentificacionReceptor(JAXBElement<String> value) {
        this.tipoIdentificacionReceptor = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCedulaReceptor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCedulaReceptor() {
        return numeroCedulaReceptor;
    }

    /**
     * Define el valor de la propiedad numeroCedulaReceptor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCedulaReceptor(JAXBElement<String> value) {
        this.numeroCedulaReceptor = value;
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
