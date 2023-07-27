//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.27 a las 10:18:58 AM CST 
//


package https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.tiqueteelectronico;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.tiqueteelectronico package. 
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

    private final static QName _EmisorTypeTelefono_QNAME = new QName("https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/tiqueteElectronico", "Telefono");
    private final static QName _EmisorTypeFax_QNAME = new QName("https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/tiqueteElectronico", "Fax");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.cdn_comprobanteselectronicos_go_cr.xml_schemas.v4_3.tiqueteelectronico
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TiqueteElectronico }
     * 
     */
    public TiqueteElectronico createTiqueteElectronico() {
        return new TiqueteElectronico();
    }

    /**
     * Create an instance of {@link TiqueteElectronico.Otros }
     * 
     */
    public TiqueteElectronico.Otros createTiqueteElectronicoOtros() {
        return new TiqueteElectronico.Otros();
    }

    /**
     * Create an instance of {@link TiqueteElectronico.DetalleServicio }
     * 
     */
    public TiqueteElectronico.DetalleServicio createTiqueteElectronicoDetalleServicio() {
        return new TiqueteElectronico.DetalleServicio();
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
     * Create an instance of {@link TiqueteElectronico.ResumenFactura }
     * 
     */
    public TiqueteElectronico.ResumenFactura createTiqueteElectronicoResumenFactura() {
        return new TiqueteElectronico.ResumenFactura();
    }

    /**
     * Create an instance of {@link TiqueteElectronico.InformacionReferencia }
     * 
     */
    public TiqueteElectronico.InformacionReferencia createTiqueteElectronicoInformacionReferencia() {
        return new TiqueteElectronico.InformacionReferencia();
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
     * Create an instance of {@link TiqueteElectronico.Otros.OtroTexto }
     * 
     */
    public TiqueteElectronico.Otros.OtroTexto createTiqueteElectronicoOtrosOtroTexto() {
        return new TiqueteElectronico.Otros.OtroTexto();
    }

    /**
     * Create an instance of {@link TiqueteElectronico.Otros.OtroContenido }
     * 
     */
    public TiqueteElectronico.Otros.OtroContenido createTiqueteElectronicoOtrosOtroContenido() {
        return new TiqueteElectronico.Otros.OtroContenido();
    }

    /**
     * Create an instance of {@link TiqueteElectronico.DetalleServicio.LineaDetalle }
     * 
     */
    public TiqueteElectronico.DetalleServicio.LineaDetalle createTiqueteElectronicoDetalleServicioLineaDetalle() {
        return new TiqueteElectronico.DetalleServicio.LineaDetalle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/tiqueteElectronico", name = "Telefono", scope = EmisorType.class)
    public JAXBElement<TelefonoType> createEmisorTypeTelefono(TelefonoType value) {
        return new JAXBElement<TelefonoType>(_EmisorTypeTelefono_QNAME, TelefonoType.class, EmisorType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/tiqueteElectronico", name = "Fax", scope = EmisorType.class)
    public JAXBElement<TelefonoType> createEmisorTypeFax(TelefonoType value) {
        return new JAXBElement<TelefonoType>(_EmisorTypeFax_QNAME, TelefonoType.class, EmisorType.class, value);
    }

}
