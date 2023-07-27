//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.26 a las 11:02:36 PM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.facturaelectronica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.facturaelectronica package. 
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

    private final static QName _EmisorTypeFax_QNAME = new QName("https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronica", "Fax");
    private final static QName _EmisorTypeTelefono_QNAME = new QName("https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronica", "Telefono");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.facturaelectronica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FacturaElectronica }
     * 
     */
    public FacturaElectronica createFacturaElectronica() {
        return new FacturaElectronica();
    }

    /**
     * Create an instance of {@link FacturaElectronica.Otros }
     * 
     */
    public FacturaElectronica.Otros createFacturaElectronicaOtros() {
        return new FacturaElectronica.Otros();
    }

    /**
     * Create an instance of {@link FacturaElectronica.DetalleServicio }
     * 
     */
    public FacturaElectronica.DetalleServicio createFacturaElectronicaDetalleServicio() {
        return new FacturaElectronica.DetalleServicio();
    }

    /**
     * Create an instance of {@link EmisorType }
     * 
     */
    public EmisorType createEmisorType() {
        return new EmisorType();
    }

    /**
     * Create an instance of {@link ReceptorType }
     * 
     */
    public ReceptorType createReceptorType() {
        return new ReceptorType();
    }

    /**
     * Create an instance of {@link OtrosCargosType }
     * 
     */
    public OtrosCargosType createOtrosCargosType() {
        return new OtrosCargosType();
    }

    /**
     * Create an instance of {@link FacturaElectronica.ResumenFactura }
     * 
     */
    public FacturaElectronica.ResumenFactura createFacturaElectronicaResumenFactura() {
        return new FacturaElectronica.ResumenFactura();
    }

    /**
     * Create an instance of {@link FacturaElectronica.InformacionReferencia }
     * 
     */
    public FacturaElectronica.InformacionReferencia createFacturaElectronicaInformacionReferencia() {
        return new FacturaElectronica.InformacionReferencia();
    }

    /**
     * Create an instance of {@link ImpuestoType }
     * 
     */
    public ImpuestoType createImpuestoType() {
        return new ImpuestoType();
    }

    /**
     * Create an instance of {@link DescuentoType }
     * 
     */
    public DescuentoType createDescuentoType() {
        return new DescuentoType();
    }

    /**
     * Create an instance of {@link IdentificacionType }
     * 
     */
    public IdentificacionType createIdentificacionType() {
        return new IdentificacionType();
    }

    /**
     * Create an instance of {@link TelefonoType }
     * 
     */
    public TelefonoType createTelefonoType() {
        return new TelefonoType();
    }

    /**
     * Create an instance of {@link CodigoMonedaType }
     * 
     */
    public CodigoMonedaType createCodigoMonedaType() {
        return new CodigoMonedaType();
    }

    /**
     * Create an instance of {@link CodigoType }
     * 
     */
    public CodigoType createCodigoType() {
        return new CodigoType();
    }

    /**
     * Create an instance of {@link UbicacionType }
     * 
     */
    public UbicacionType createUbicacionType() {
        return new UbicacionType();
    }

    /**
     * Create an instance of {@link ExoneracionType }
     * 
     */
    public ExoneracionType createExoneracionType() {
        return new ExoneracionType();
    }

    /**
     * Create an instance of {@link FacturaElectronica.Otros.OtroTexto }
     * 
     */
    public FacturaElectronica.Otros.OtroTexto createFacturaElectronicaOtrosOtroTexto() {
        return new FacturaElectronica.Otros.OtroTexto();
    }

    /**
     * Create an instance of {@link FacturaElectronica.Otros.OtroContenido }
     * 
     */
    public FacturaElectronica.Otros.OtroContenido createFacturaElectronicaOtrosOtroContenido() {
        return new FacturaElectronica.Otros.OtroContenido();
    }

    /**
     * Create an instance of {@link FacturaElectronica.DetalleServicio.LineaDetalle }
     * 
     */
    public FacturaElectronica.DetalleServicio.LineaDetalle createFacturaElectronicaDetalleServicioLineaDetalle() {
        return new FacturaElectronica.DetalleServicio.LineaDetalle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronica", name = "Fax", scope = EmisorType.class)
    public JAXBElement<TelefonoType> createEmisorTypeFax(TelefonoType value) {
        return new JAXBElement<TelefonoType>(_EmisorTypeFax_QNAME, TelefonoType.class, EmisorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronica", name = "Telefono", scope = EmisorType.class)
    public JAXBElement<TelefonoType> createEmisorTypeTelefono(TelefonoType value) {
        return new JAXBElement<TelefonoType>(_EmisorTypeTelefono_QNAME, TelefonoType.class, EmisorType.class, value);
    }

}
