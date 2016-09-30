/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.MediaComite;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Luciana
 */
@Stateless
public class ServerSoapDespesaComite {

    @PersistenceContext
    private EntityManager entityManager;

    public List<MediaComite> mediaDespesaComite(int ano) {
        String sql = "";
        
        switch (ano) {

            case 2002:
               sql = "select sg_uf as nomeEstado, avg(vr_despesa) as mediaDespesaComite "
                        + "from despesa_comite2002 group by sg_uf order by nomeEstado";
                break;

            case 2004:
                sql = "select no_ue as nomeEstado, avg(vr_despesa) as mediaDespesaComite "
                        + "from despesa_comite2004 group by no_ue order by nomeEstado";
                break;

            case 2006:
                sql = "select sg_ue as nomeEstado, avg(vr_despesa) as mediaDespesaComite "
                        + "from despesa_comite2006 group by sg_ue order by nomeEstado";
                break;

            case 2008:
                sql = "select sg_ue_superior as nomeEstado, avg(vr_despesa) as mediaDespesaComite "
                        + "from despesa_comite2008 group by sg_ue_superior order by nomeEstado";
                break;

            default:
                return null;
        }

        
        Query query = entityManager.createNativeQuery(sql, "DespesaComite");
        List<MediaComite> lista = query.getResultList();

        return query.getResultList();

    }
}
