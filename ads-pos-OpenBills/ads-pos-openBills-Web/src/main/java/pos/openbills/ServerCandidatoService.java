
package pos.openbills;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ServerCandidatoService", targetNamespace = "http://server.SOAP.openBill.pos.ads/", wsdlLocation = "http://localhost:8080/ads-pos-openBills-SOAP/ServerCandidatoService?WSDL")
public class ServerCandidatoService
    extends Service
{

    private final static URL SERVERCANDIDATOSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERCANDIDATOSERVICE_EXCEPTION;
    private final static QName SERVERCANDIDATOSERVICE_QNAME = new QName("http://server.SOAP.openBill.pos.ads/", "ServerCandidatoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ads-pos-openBills-SOAP/ServerCandidatoService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERCANDIDATOSERVICE_WSDL_LOCATION = url;
        SERVERCANDIDATOSERVICE_EXCEPTION = e;
    }

    public ServerCandidatoService() {
        super(__getWsdlLocation(), SERVERCANDIDATOSERVICE_QNAME);
    }

    public ServerCandidatoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ServerCandidato
     */
    @WebEndpoint(name = "ServerCandidatoPort")
    public ServerCandidato getServerCandidatoPort() {
        return super.getPort(new QName("http://server.SOAP.openBill.pos.ads/", "ServerCandidatoPort"), ServerCandidato.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerCandidato
     */
    @WebEndpoint(name = "ServerCandidatoPort")
    public ServerCandidato getServerCandidatoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.SOAP.openBill.pos.ads/", "ServerCandidatoPort"), ServerCandidato.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERCANDIDATOSERVICE_EXCEPTION!= null) {
            throw SERVERCANDIDATOSERVICE_EXCEPTION;
        }
        return SERVERCANDIDATOSERVICE_WSDL_LOCATION;
    }

}
