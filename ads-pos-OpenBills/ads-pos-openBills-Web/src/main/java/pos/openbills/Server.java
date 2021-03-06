
package pos.openbills;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Server", targetNamespace = "http://server.SOAP.openBill.pos.ads/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Server {


    /**
     * 
     * @param ano
     * @return
     *     returns java.util.List<pos.openbills.MediaEstado>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mediaDespesasDoEstado", targetNamespace = "http://server.SOAP.openBill.pos.ads/", className = "pos.openbills.MediaDespesasDoEstado")
    @ResponseWrapper(localName = "mediaDespesasDoEstadoResponse", targetNamespace = "http://server.SOAP.openBill.pos.ads/", className = "pos.openbills.MediaDespesasDoEstadoResponse")
    public List<MediaEstado> mediaDespesasDoEstado(
        @WebParam(name = "ano", targetNamespace = "")
        int ano);

}
