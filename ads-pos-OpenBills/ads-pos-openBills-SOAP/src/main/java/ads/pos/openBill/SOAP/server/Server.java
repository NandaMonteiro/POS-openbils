/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.DespesaCandidato;
import ads.pos.openBill.SOAP.entidades.MediaEstado;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author nanda
 */
@WebService
public class Server {
    
    @EJB
    ServerSoapCandidato serverSoap;
    
    @WebMethod
    public List<MediaEstado> despesas(@WebParam (name = "ano") int ano){
        return serverSoap.despesasCandidato(ano);
            
    }
}
