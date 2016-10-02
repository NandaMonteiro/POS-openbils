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
public class QuantidadeDespesaCandidatoSoma implements Serializable{
    private String nome;
    private String cargo;
    private double valor;

    public QuantidadeDespesaCandidatoSoma() {
    }

    public QuantidadeDespesaCandidatoSoma(String cargo, String nome, double valor) {
        this.cargo = cargo;
        this.nome = nome;        
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "QuantidadeDespesaCandidatoSoma{" + "nome=" + nome + ", cargo=" + cargo + ", valor=" + valor + '}';
    }

    


}


