/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luciana
 */
@XmlRootElement
public class QuantidadeDespesaCandidato implements Serializable{
    private String sigla_partido;
//    private double quantidade;
//    private String estado;
//    private double soma;
//    private String nome;
//    private String cargo;
//    private double valorDespesa;


    public QuantidadeDespesaCandidato() {
    }

    public QuantidadeDespesaCandidato(String sigla_partido) {
        this.sigla_partido = sigla_partido;
    }

    
//    public QuantidadeDespesaCandidato(String estado, double soma) {
//        this.estado = estado;
//        this.soma = soma;
//    }

    
//    public QuantidadeDespesaCandidato(String sigla_partido, double quantidade, String estado, double soma, String nome, String cargo, double valorDespesa) {
//        this.sigla_partido = sigla_partido;
//        this.quantidade = quantidade;
//        this.estado = estado;
//        this.soma = soma;
//        this.nome = nome;
//        this.cargo = cargo;
//        this.valorDespesa = valorDespesa;
//    }
 

    public String getSigla_partido() {
        return sigla_partido;
    }

    public void setSigla_partido(String sigla_partido) {
        this.sigla_partido = sigla_partido;
    }
//
//    public double getQuantidade() {
//        return quantidade;
//    }
//
//    public void setQuantidade(double quantidade) {
//        this.quantidade = quantidade;
//    }

//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }

//    public double getSoma() {
//        return soma;
//    }
//
//    public void setSoma(double soma) {
//        this.soma = soma;
//    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCargo() {
//        return cargo;
//    }
//
//    public void setCargo(String cargo) {
//        this.cargo = cargo;
//    }
//
//    public double getValorDespesa() {
//        return valorDespesa;
//    }
//
//    public void setValorDespesa(double valorDespesa) {
//        this.valorDespesa = valorDespesa;
//    }

    @Override
    public String toString() {
        return "QuantidadeDespesaCandidato{" + "sigla_partido=" + sigla_partido + '}';
    }

    
}


