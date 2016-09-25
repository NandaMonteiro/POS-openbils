/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.QuantidadeDespesaCandidato;
import ads.pos.openBill.SOAP.entidades.ReceitaComiteValor;
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
public class ServerReceitaComite {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ReceitaComiteValor> valorReceita(int ano) {

        switch (ano) {
            case 2002:
                String sql2002 = "select r.ds_orgao as nome_comite, SUM(r.vr_receita) as valor_receita from"
                        + "receitas_comite2008 r group by r.ds_orgao";

                break;

            case 2004:
                String sql2004 = "select r.ds_orgao as nome_comite, SUM(r.vr_receita) as valor_receita from"
                        + "receitas_comite2008 r group by r.ds_orgao";

                break;
            case 2006:
                String sql2006 = "select r.ds_orgao as nome_comite, SUM(r.vr_receita) as valor_receita from"
                        + "receitas_comite2008 r group by r.ds_orgao";
                break;

            case 2008:
                String sql2008 = "select r.ds_orgao as nome_comite, SUM(r.vr_receita) as valor_receita from"
                        + "receitas_comite2008 r group by r.ds_orgao";

                break;

            default:
                return null;
        }
        String sql2002 = "";
        String sql2004 = "";
        String sql2006 = "";
        String sql2008 = "";

        Query query
                = entityManager.createNativeQuery(sql2002, "ReceitaComite");
        entityManager.createNativeQuery(sql2004, "ReceitaComite");
        entityManager.createNativeQuery(sql2006, "ReceitaComite");
        entityManager.createNativeQuery(sql2008, "ReceitaComite");

        return query.getResultList();

    }

    public List<ReceitaComiteValor> orgaosComiteEstado(int ano) {

        switch (ano) {
            case 2002:
                String sql2002 = "select d.sg_uf as estado, COUNT(distinct d.ds_orgao) as quantidade_orgaos, SUM(vr_receita) as valor_receita_estado\n"
                        + "from receitas_comite2002 d\n"
                        + "group by d.sg_uf";

                break;

            case 2004:
                String sql2004 = "select d.sg_uf as estado, COUNT(distinct d.ds_orgao) as quantidade_orgaos, SUM(vr_receita) as valor_receita_estado\n"
                        + "from receitas_comite2004 d\n"
                        + "group by d.sg_uf";

                break;
            case 2006:
                String sql2006 = "select d.sg_ue as estado, COUNT(distinct d.ds_orgao) as quantidade_orgaos, SUM(vr_receita) as valor_receita_estado\n"
                        + "from receitas_comite2006 d\n"
                        + "group by d.sg_ue";
                break;

            case 2008:
                String sql2008 = "select d.sg_ue_superior as estado, COUNT(distinct d.ds_orgao) as quantidade_orgaos, SUM(vr_receita) as valor_receita_estado\n"
                        + "from receitas_comite2008 d\n"
                        + "group by d.sg_ue_superior";

                break;

            default:
                return null;
        }
        String sql2002 = "";
        String sql2004 = "";
        String sql2006 = "";
        String sql2008 = "";

        Query query
                = entityManager.createNativeQuery(sql2002, "ReceitaComite");
        entityManager.createNativeQuery(sql2004, "ReceitaComite");
        entityManager.createNativeQuery(sql2006, "ReceitaComite");
        entityManager.createNativeQuery(sql2008, "ReceitaComite");

        return query.getResultList();
    }
}
