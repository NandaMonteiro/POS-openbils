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
public class ServerDespesaComite {

    @PersistenceContext
    private EntityManager entityManager;

    public List<MediaComite> mediaDespesaComite(int ano) {
        switch (ano) {

            case 2002:
                String sql2002 = "select sg_uf as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2002 group by sg_uf";
                break;

            case 2004:
                String sql2004 = "select no_ue as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2004 group by no_ue";
                break;

            case 2006:
                String sql2006 = "select sg_ue as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2006 group by sg_ue";
                break;

            case 2008:
                String sql2008 = "select sg_ue_superior as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2008 group by sg_ue_superior";

            default:
                return null;
        }
        String sql2002 = "";
        String sql2004 = "";
        String sql2006 = "";
        String sql2008 = "";

        Query query
                = entityManager.createNativeQuery(sql2002, "DespesaComite");
        entityManager.createNativeQuery(sql2004, "DespesaComite");
        entityManager.createNativeQuery(sql2006, "DespesaComite");
        entityManager.createNativeQuery(sql2008, "DespesaComite");

        return query.getResultList();

    }
}
