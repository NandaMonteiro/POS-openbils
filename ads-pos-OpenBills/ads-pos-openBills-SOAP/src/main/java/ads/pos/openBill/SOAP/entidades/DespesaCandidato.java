/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Luciana
 */
@Entity
@Table(name = "")
public class DespesaCandidato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String SG_UF;
    private String SG_PART;
    private String DS_CARGO;
    private String NO_CAND;
    private int NR_CAND;
    @Temporal(TemporalType.DATE)
    private Date DT_DESPESA;

    private String CD_CPF_CNPJ_FORNECEDOR;

    private String NO_FOR;
    private String VR_DESPESA;
    private String DS_TITULO;

    public DespesaCandidato() {
    }

    public DespesaCandidato(String SG_UF, String SG_PART, String DS_CARGO, String NO_CAND, int NR_CAND, Date DT_DESPESA, String CD_CPF_CNPJ_FORNECEDOR, String NO_FOR, String VR_DESPESA, String DS_TITULO) {
        this.SG_UF = SG_UF;
        this.SG_PART = SG_PART;
        this.DS_CARGO = DS_CARGO;
        this.NO_CAND = NO_CAND;
        this.NR_CAND = NR_CAND;
        this.DT_DESPESA = DT_DESPESA;
        this.CD_CPF_CNPJ_FORNECEDOR = CD_CPF_CNPJ_FORNECEDOR;
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

    public String getDS_CARGO() {
        return DS_CARGO;
    }

    public void setDS_CARGO(String DS_CARGO) {
        this.DS_CARGO = DS_CARGO;
    }

    public String getNO_CAND() {
        return NO_CAND;
    }

    public void setNO_CAND(String NO_CAND) {
        this.NO_CAND = NO_CAND;
    }

    public int getNR_CAND() {
        return NR_CAND;
    }

    public void setNR_CAND(int NR_CAND) {
        this.NR_CAND = NR_CAND;
    }

    public Date getDT_DESPESA() {
        return DT_DESPESA;
    }

    public void setDT_DESPESA(Date DT_DESPESA) {
        this.DT_DESPESA = DT_DESPESA;
    }

    public String getCD_CPF_CNPJ_FORNECEDOR() {
        return CD_CPF_CNPJ_FORNECEDOR;
    }

    public void setCD_CPF_CNPJ_FORNECEDOR(String CD_CPF_CNPJ_FORNECEDOR) {
        this.CD_CPF_CNPJ_FORNECEDOR = CD_CPF_CNPJ_FORNECEDOR;
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
