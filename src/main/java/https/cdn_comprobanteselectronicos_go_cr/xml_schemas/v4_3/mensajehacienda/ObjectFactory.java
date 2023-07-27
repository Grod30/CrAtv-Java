//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.26 a las 11:39:09 PM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.mensajehacienda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.mensajehacienda package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MensajeHaciendaNumeroCedulaReceptor_QNAME = new QName("https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeHacienda", "NumeroCedulaReceptor");
    private final static QName _MensajeHaciendaTipoIdentificacionReceptor_QNAME = new QName("https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeHacienda", "TipoIdentificacionReceptor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.mensajehacienda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MensajeHacienda }
     * 
     */
    public MensajeHacienda createMensajeHacienda() {
        return new MensajeHacienda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeHacienda", name = "NumeroCedulaReceptor", scope = MensajeHacienda.class)
    public JAXBElement<String> createMensajeHaciendaNumeroCedulaReceptor(String value) {
        return new JAXBElement<String>(_MensajeHaciendaNumeroCedulaReceptor_QNAME, String.class, MensajeHacienda.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/mensajeHacienda", name = "TipoIdentificacionReceptor", scope = MensajeHacienda.class)
    public JAXBElement<String> createMensajeHaciendaTipoIdentificacionReceptor(String value) {
        return new JAXBElement<String>(_MensajeHaciendaTipoIdentificacionReceptor_QNAME, String.class, MensajeHacienda.class, value);
    }

}
