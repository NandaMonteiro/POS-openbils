
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

    private final static QName _DespesasYResponse_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "despesasYResponse");
    private final static QName _MediaEstado_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "mediaEstado");
    private final static QName _DespesasY_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "despesasY");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pos.openbills
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DespesasY }
     * 
     */
    public DespesasY createDespesasY() {
        return new DespesasY();
    }

    /**
     * Create an instance of {@link DespesasYResponse }
     * 
     */
    public DespesasYResponse createDespesasYResponse() {
        return new DespesasYResponse();
    }

    /**
     * Create an instance of {@link MediaEstado }
     * 
     */
    public MediaEstado createMediaEstado() {
        return new MediaEstado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespesasYResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "despesasYResponse")
    public JAXBElement<DespesasYResponse> createDespesasYResponse(DespesasYResponse value) {
        return new JAXBElement<DespesasYResponse>(_DespesasYResponse_QNAME, DespesasYResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "mediaEstado")
    public JAXBElement<MediaEstado> createMediaEstado(MediaEstado value) {
        return new JAXBElement<MediaEstado>(_MediaEstado_QNAME, MediaEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespesasY }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "despesasY")
    public JAXBElement<DespesasY> createDespesasY(DespesasY value) {
        return new JAXBElement<DespesasY>(_DespesasY_QNAME, DespesasY.class, null, value);
    }

}
