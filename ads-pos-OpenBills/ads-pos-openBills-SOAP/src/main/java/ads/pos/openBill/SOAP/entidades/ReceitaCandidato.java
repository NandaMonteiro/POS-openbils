/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Luciana
 */
@SqlResultSetMapping(
        name = "MediaEstadoMap",
        classes = @ConstructorResult(
                targetClass = MediaEstado.class,
                columns = {
                    @ColumnResult(name = "estado", type = String.class),
                    @ColumnResult(name = "receita", type = Double.class)
                }))


@Entity
public class ReceitaCandidato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String SG_UF;
    private String SG_PART;
    private String DS_CARGO;
    private String NO_CAND;
    private int NR_CAND;
    @Temporal(TemporalType.DATE)
    private Date DT_RECEITA;
    private String CD_CPF_CGC;
    private String NO_DOADOR;
    private float VR_RECEITA;
    @Enumerated(EnumType.STRING)
    private TipoDeRecursoENUM TP_RECURSO;

    public ReceitaCandidato() {
    }

    public ReceitaCandidato(String SG_UF, String SG_PART, String DS_CARGO, String NO_CAND, int NR_CAND, Date DT_RECEITA, String CD_CPF_CGC, String NO_DOADOR, float VR_RECEITA, TipoDeRecursoENUM TP_RECURSO) {

        this.SG_UF = SG_UF;
        this.SG_PART = SG_PART;
        this.DS_CARGO = DS_CARGO;
        this.NO_CAND = NO_CAND;
        this.NR_CAND = NR_CAND;
        this.DT_RECEITA = DT_RECEITA;
        this.CD_CPF_CGC = CD_CPF_CGC;

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

    public Date getDT_RECEITA() {
        return DT_RECEITA;
    }

    public void setDT_RECEITA(Date DT_RECEITA) {
        this.DT_RECEITA = DT_RECEITA;
    }

    public String getCD_CPF_CGC() {
        return CD_CPF_CGC;
    }

    public void setCD_CPF_CGC(String CD_CPF_CGC) {
        this.CD_CPF_CGC = CD_CPF_CGC;
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
