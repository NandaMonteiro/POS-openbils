
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

    private final static QName _Despesas_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "despesas");
    private final static QName _MediaEstado_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "mediaEstado");
    private final static QName _DespesasResponse_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "despesasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pos.openbills
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DespesasResponse }
     * 
     */
    public DespesasResponse createDespesasResponse() {
        return new DespesasResponse();
    }

    /**
     * Create an instance of {@link Despesas }
     * 
     */
    public Despesas createDespesas() {
        return new Despesas();
    }

    /**
     * Create an instance of {@link MediaEstado }
     * 
     */
    public MediaEstado createMediaEstado() {
        return new MediaEstado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Despesas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "despesas")
    public JAXBElement<Despesas> createDespesas(Despesas value) {
        return new JAXBElement<Despesas>(_Despesas_QNAME, Despesas.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DespesasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.SOAP.openBill.pos.ads/", name = "despesasResponse")
    public JAXBElement<DespesasResponse> createDespesasResponse(DespesasResponse value) {
        return new JAXBElement<DespesasResponse>(_DespesasResponse_QNAME, DespesasResponse.class, null, value);
    }

}
