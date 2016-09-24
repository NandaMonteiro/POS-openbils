/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.DespesaCandidato;
import ads.pos.openBill.SOAP.entidades.MediaEstado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author nanda
 */
@Stateless
public class ServerSoapCandidato {
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<MediaEstado> despesasCandidato(int ano){
        String sql = "select sg_uf AS estado, avg(vr_receita) as receita " + 
                        "from receitas_candidato2002 group by sg_uf";
        
        
       // String consulta2004 = "";
        
//        switch(ano){
//            case 2002:
//                //blablabla
//                break;
//            
//            case 2004:
//                break;
//                
//            default: return null;
//        }
        
        Query query = 
                entityManager.createNativeQuery(sql, "MediaEstadoMap");
    
        return query.getResultList();
       
    }
    
}
