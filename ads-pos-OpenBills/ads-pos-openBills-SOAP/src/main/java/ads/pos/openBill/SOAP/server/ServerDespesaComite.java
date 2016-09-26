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
        String sql;
        switch (ano) {

            case 2002:
               sql = "select sg_uf as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2002 group by sg_uf";
                break;

            case 2004:
                sql = "select no_ue as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2004 group by no_ue";
                break;

            case 2006:
                sql = "select sg_ue as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2006 group by sg_ue";
                break;

            case 2008:
                sql = "select sg_ue_superior as media_despesa, avg(vr_despesa) as mediaDespesaComite \n"
                        + "from despesa_comite2008 group by sg_ue_superior";
                break;

            default:
                return null;
        }
//        String sql2002 = "";
//        String sql2004 = "";
//        String sql2006 = "";
//        String sql2008 = "";

        Query query
                = entityManager.createNativeQuery(sql, "DespesaComite");
//        entityManager.createNativeQuery(sql2004, "DespesaComite");
//        entityManager.createNativeQuery(sql2006, "DespesaComite");
//        entityManager.createNativeQuery(sql2008, "DespesaComite");

        return query.getResultList();

    }
}
