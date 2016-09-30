/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.MediaEstado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author nanda
 */
@Stateless
public class ServerSoapCandidato {

    @PersistenceContext
    private EntityManager entityManager;

    public List<MediaEstado> despesasCandidato(int ano) {
        String sql = "";

        switch (ano) {
            case 2004:
                sql = "select sg_uf AS estado, avg(vr_receita) as receita "
                        + "from receitas_candidato2004 group by sg_uf order by estado ASC";
                break;
            case 2006:
                sql = "select unidade_eleitoral_candidato AS estado, avg(valor_receita) as receita "
                        + "from receitas_candidato2006 group by unidade_eleitoral_candidato order by estado ASC";
                break;
            case 2008:
                sql = "select sg_ue_superior AS estado, avg(vr_receita) as receita "
                        + "from receitas_candidato2008 group by sg_ue_superior order by estado ASC";
                break;
            default:;
        }

        Query query = entityManager.createNativeQuery(sql, "MediaEstadoMap");
        return query.getResultList();

    }

}
