
package pos.openbills;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pos.openbills package. 
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

    private final static QName _MediaDespesasDoEstadoResponse_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "mediaDespesasDoEstadoResponse");
    private final static QName _MediaDespesasDoEstado_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "mediaDespesasDoEstado");
    private final static QName _MediaEstado_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "mediaEstado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pos.openbills
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MediaDespesasDoEstado }
     * 
     */
    public MediaDespesasDoEstado createMediaDespesasDoEstado() {
        return new MediaDespesasDoEstado();
    }

    /**
     * Create an instance of {@link MediaDespesasDoEstadoResponse }
     * 
     */
    public MediaDespesasDoEstadoResponse createMediaDespesasDoEstadoResponse() {
        return new MediaDespesasDoEstadoResponse();
    }

    /**
     * Create an instance of {@link MediaEstado }
     * 
     */
    public MediaEstado createMediaEstado() {
        return new MediaEstado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaDespesasDoEstadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "mediaDespesasDoEstadoResponse")
    public JAXBElement<MediaDespesasDoEstadoResponse> createMediaDespesasDoEstadoResponse(MediaDespesasDoEstadoResponse value) {
        return new JAXBElement<MediaDespesasDoEstadoResponse>(_MediaDespesasDoEstadoResponse_QNAME, MediaDespesasDoEstadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaDespesasDoEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "mediaDespesasDoEstado")
    public JAXBElement<MediaDespesasDoEstado> createMediaDespesasDoEstado(MediaDespesasDoEstado value) {
        return new JAXBElement<MediaDespesasDoEstado>(_MediaDespesasDoEstado_QNAME, MediaDespesasDoEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "mediaEstado")
    public JAXBElement<MediaEstado> createMediaEstado(MediaEstado value) {
        return new JAXBElement<MediaEstado>(_MediaEstado_QNAME, MediaEstado.class, null, value);
    }

}
