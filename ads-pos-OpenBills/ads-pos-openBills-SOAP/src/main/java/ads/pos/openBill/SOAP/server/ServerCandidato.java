/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.QuantidadeDespesaCandidato;
import ads.pos.openBill.SOAP.entidades.QuantidadeDespesaCandidatoSoma;
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
public class ServerCandidato {

    @EJB
    ServerDespesaCandidato serverSoap;

    @WebMethod
    public List<QuantidadeDespesaCandidatoSoma> despesas(@WebParam(name = "ano") int ano) {
        return serverSoap.somaDespesasEstadoCandidato(ano);

    }

    @WebMethod
    public List<QuantidadeDespesaCandidato> quantidadeCandidato(@WebParam(name = "ano") int ano) {
        return serverSoap.quantidadeCandidato(ano);

    }
    
    @WebMethod
    public List<QuantidadeDespesaCandidatoSoma> maisGastaram(@WebParam(name = "ano") int ano){
        return serverSoap.candidatosMaisGastaram(ano);
    }

}
