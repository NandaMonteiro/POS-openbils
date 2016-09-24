/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Luciana
 */
@Entity
public class DespesaComite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String SG_UF;
    private String SG_PART;
    private String DS_ORGAO;
    @Temporal(TemporalType.DATE)
    private Date DT_DOC_DESP;
    private String CD_CPF_CGC;

    private String NO_FOR;
    private String VR_DESPESA;
    private String DS_TITULO;

    public DespesaComite() {
    }

    public DespesaComite(String SG_UF, String SG_PART, String DS_ORGAO, Date DT_DOC_DESP, String CD_CPF_CGC, String NO_FOR, String VR_DESPESA, String DS_TITULO) {
        this.SG_UF = SG_UF;
        this.SG_PART = SG_PART;
        this.DS_ORGAO = DS_ORGAO;
        this.DT_DOC_DESP = DT_DOC_DESP;
        this.CD_CPF_CGC = CD_CPF_CGC;
        this.NO_FOR = NO_FOR;
        this.VR_DESPESA = VR_DESPESA;
        this.DS_TITULO = DS_TITULO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSG_UF() {
        return SG_UF;
    }

    public void setSG_UF(String SG_UF) {
        this.SG_UF = SG_UF;
    }

    public String getSG_PART() {
        return SG_PART;
    }

    public void setSG_PART(String SG_PART) {
        this.SG_PART = SG_PART;
    }

    public String getDS_ORGAO() {
        return DS_ORGAO;
    }

    public void setDS_ORGAO(String DS_ORGAO) {
        this.DS_ORGAO = DS_ORGAO;
    }

    public Date getDT_DOC_DESP() {
        return DT_DOC_DESP;
    }

    public void setDT_DOC_DESP(Date DT_DOC_DESP) {
        this.DT_DOC_DESP = DT_DOC_DESP;
    }

    public String getCD_CPF_CGC() {
        return CD_CPF_CGC;
    }

    public void setCD_CPF_CGC(String CD_CPF_CGC) {
        this.CD_CPF_CGC = CD_CPF_CGC;
    }

    public String getNO_FOR() {
        return NO_FOR;
    }

    public void setNO_FOR(String NO_FOR) {
        this.NO_FOR = NO_FOR;
    }

    public String getVR_DESPESA() {
        return VR_DESPESA;
    }

    public void setVR_DESPESA(String VR_DESPESA) {
        this.VR_DESPESA = VR_DESPESA;
    }

    public String getDS_TITULO() {
        return DS_TITULO;
    }

    public void setDS_TITULO(String DS_TITULO) {
        this.DS_TITULO = DS_TITULO;
    }
    
    
    
}
