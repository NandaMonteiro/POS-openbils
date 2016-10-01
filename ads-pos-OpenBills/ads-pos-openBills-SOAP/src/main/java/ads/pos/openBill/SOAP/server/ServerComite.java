/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;


import ads.pos.openBill.SOAP.entidades.MediaComite;
import ads.pos.openBill.SOAP.entidades.ReceitaComiteValor;
import ads.pos.openBill.SOAP.entidades.ReceitaComiteValorOrgaos;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Luciana
 */
@WebService
public class ServerComite {

    @EJB
    ServerReceitaComite serverReceitaComite;

    @EJB
    ServerSoapDespesaComite serverDespesaComite;

    @WebMethod
    public List<ReceitaComiteValor> despesasTotalComite(@WebParam(name = "ano") int ano) {
        return serverReceitaComite.valorReceita(ano);

    }

    @WebMethod
    public List<MediaComite> mediaDespesaComite(@WebParam(name = "ano") int ano) {
        return serverDespesaComite.mediaDespesaComite(ano);

    }

    @WebMethod
    public List<ReceitaComiteValorOrgaos> orgaosEstado(@WebParam(name = "ano") int ano) {
        return serverReceitaComite.orgaosComiteEstado(ano);

    }
}
