/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;

/**
 *
 * @author Luciana
 */
public class ReceitaComiteValorOrgaos implements Serializable {

    private String nome_comite;
    private double valor;
    private double quantidade_orgaos;

    public ReceitaComiteValorOrgaos() {
    }

    public ReceitaComiteValorOrgaos(String nome_comite, double valor, double quantidade_orgaos) {
        this.nome_comite = nome_comite;
        this.valor = valor;
        this.quantidade_orgaos = quantidade_orgaos;
    }

    public String getNome_comite() {
        return nome_comite;
    }

    public void setNome_comite(String nome_comite) {
        this.nome_comite = nome_comite;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade_orgaos() {
        return quantidade_orgaos;
    }

    public void setQuantidade_orgaos(double quantidade_orgaos) {
        this.quantidade_orgaos = quantidade_orgaos;
    }

    @Override
    public String toString() {
        return "ReceitaComiteValorOrgaos{" + "nome_comite=" + nome_comite + ", valor=" + valor + ", quantidade_orgaos=" + quantidade_orgaos + '}';
    }


    

    
}
