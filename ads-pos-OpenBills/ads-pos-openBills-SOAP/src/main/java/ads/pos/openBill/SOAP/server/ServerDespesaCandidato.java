/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.server;

import ads.pos.openBill.SOAP.entidades.QuantidadeDespesaCandidato;
import ads.pos.openBill.SOAP.entidades.QuantidadeDespesaCandidatoSoma;
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
public class ServerDespesaCandidato {

    @PersistenceContext
    private EntityManager entityManager;

    public List<QuantidadeDespesaCandidatoSoma> somaDespesasEstadoCandidato(int ano) {
        
        String sql;

        switch (ano) {
            //nao da pra somar tipo varing
//            case 2002:
//                String sql2002 = "SELECT  sg_uf AS estado, SUM(vr_despesa) AS soma FROM despesa_candidato2002 "
//                        + "GROUP BY  sg_uf ORDER BY soma DESC";
//                break;

            case 2004:
                sql = "SELECT  sg_uf AS estado, SUM(vr_despesa) AS soma FROM despesa_candidato2004 "
                        + "GROUP BY  sg_uf ORDER BY soma DESC";
                break;

            case 2006:
                 sql = "SELECT  unidade_eleitoral_candidato AS estado, SUM(valor_despesa) AS soma FROM despesa_candidato2006 "
                        + "GROUP BY  unidade_eleitoral_candidato ORDER BY soma DESC";
                break;

            case 2008:
                sql = "SELECT  sg_uf AS estado, SUM(vr_despesa) AS soma FROM despesa_candidato2008 "
                        + "GROUP BY  sg_uf ORDER BY soma DESC";
                break;

            default:
                return null;
        }

        Query query = entityManager.createNativeQuery(sql, "DespesaCandidato1");
        return query.getResultList();

    }

    public List<QuantidadeDespesaCandidato> quantidadeCandidato(int ano) {
        String sql;

        switch (ano) {
            case 2002:
                 sql = "select d.sg_part as siglaPartido, COUNT(distinct d.no_cand) as qtdeCandidato from "
                        + "despesa_candidato2002 d group by d.sg_part";

                break;

            case 2004:
                sql = "select d.sg_part as siglaPartido, COUNT(distinct d.no_cand) as qtdeCandidato from"
                        + " despesa_candidato2004 d group by d.sg_part";

                break;
            case 2006:

                sql = "select d.sigla_partido as siglaPartido, COUNT(distinct d.nome_candidato) as qtdeCandidato from " +
                        "despesa_candidato2006 d group by d.sigla_partido";

                break;
            case 2008:

                 sql = "select d.sg_part as siglaPartido, COUNT(distinct d.no_cand) as qtdeCandidato from " +
                        "despesa_candidato2008 d group by d.sg_part";

                break;
            default:
                return null;
        }
        
        Query query = entityManager.createNativeQuery(sql, "DespesaCandidato");
        return query.getResultList();

    }

    public List<QuantidadeDespesaCandidatoSoma> candidatosMaisGastaram(int ano) {
        String sql;

        switch (ano) {
            case 2002:
//                não é possível realizar consulta: tipo valor despesa continua varchar                
//                sql = "select distinct d.nome_candidato, d.descricao_cargo, SUM(d.valor_despesa) as valor\n"
//                        + "from despesa_candidato2002 d where d.unidade_eleitoral_candidato ilike 'pb'\n"
//                        + "group by d.nome_candidato, d.descricao_cargo order by valor desc\n"
//                        + "limit 10;";
//
//                break;

            case 2004:
                sql = "select distinct d.no_cand, d.ds_cargo, SUM(d.vr_despesa) as valor " +
                        "from despesa_candidato2004 d where sg_uf ilike 'pb' " +
                        "group by d.no_cand, d.ds_cargo order by valor desc " +
                        "limit 10;";

                break;
            case 2006:

                sql = "select distinct d.nome_candidato, d.descricao_cargo, SUM(d.valor_despesa) as valor "
                        + "from despesa_candidato2006 d where d.unidade_eleitoral_candidato ilike 'pb' "
                        + "group by d.nome_candidato, d.descricao_cargo order by valor desc "
                        + "limit 10;";

                break;
            case 2008:

                sql = "select distinct d.no_cand, d.ds_cargo, SUM(d.vr_despesa) as valor " +
                        "from despesa_candidato2008 d where sg_ue_superior ilike 'pb' " +
                        "group by d.no_cand, d.ds_cargo order by valor desc " +
                        "limit 10";

                break;
            default:
                return null;
        }

        Query query = entityManager.createNativeQuery(sql, "DespesaCandidato1");
        return query.getResultList();

    }

}
