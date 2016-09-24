/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class ReceitaComite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String SG_UF;
    private String SG_PART;
    private String DS_ORGAO;
    @Temporal(TemporalType.DATE)
    private Date DT_RECEITA;
    private String CD_CPF_CGC_DOA;
    private String NO_DOADOR;
    private float VR_RECEITA;
    @Enumerated(EnumType.STRING)
    private TipoDeRecursoENUM TP_RECURSO;

    public ReceitaComite() {
    }

    public ReceitaComite(String SG_UF, String SG_PART, String DS_ORGAO, Date DT_RECEITA, String CD_CPF_CGC_DOA, String NO_DOADOR, float VR_RECEITA, TipoDeRecursoENUM TP_RECURSO) {
        this.SG_UF = SG_UF;
        this.SG_PART = SG_PART;
        this.DS_ORGAO = DS_ORGAO;
        this.DT_RECEITA = DT_RECEITA;
        this.CD_CPF_CGC_DOA = CD_CPF_CGC_DOA;
        this.NO_DOADOR = NO_DOADOR;
        this.VR_RECEITA = VR_RECEITA;
        this.TP_RECURSO = TP_RECURSO;
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

    public Date getDT_RECEITA() {
        return DT_RECEITA;
    }

    public void setDT_RECEITA(Date DT_RECEITA) {
        this.DT_RECEITA = DT_RECEITA;
    }

    public String getCD_CPF_CGC_DOA() {
        return CD_CPF_CGC_DOA;
    }

    public void setCD_CPF_CGC_DOA(String CD_CPF_CGC_DOA) {
        this.CD_CPF_CGC_DOA = CD_CPF_CGC_DOA;
    }


    public String getNO_DOADOR() {
        return NO_DOADOR;
    }

    public void setNO_DOADOR(String NO_DOADOR) {
        this.NO_DOADOR = NO_DOADOR;
    }

    public float getVR_RECEITA() {
        return VR_RECEITA;
    }

    public void setVR_RECEITA(float VR_RECEITA) {
        this.VR_RECEITA = VR_RECEITA;
    }

    public TipoDeRecursoENUM getTP_RECURSO() {
        return TP_RECURSO;
    }

    public void setTP_RECURSO(TipoDeRecursoENUM TP_RECURSO) {
        this.TP_RECURSO = TP_RECURSO;
    }

    

}
