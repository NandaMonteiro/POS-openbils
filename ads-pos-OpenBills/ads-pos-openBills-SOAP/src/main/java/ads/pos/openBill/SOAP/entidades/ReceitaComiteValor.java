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
public class ReceitaComiteValor implements Serializable {

    private String nome_comite;
    private double valor;

    public ReceitaComiteValor() {
    }

    public ReceitaComiteValor(String nome_comite, double valor) {
        this.nome_comite = nome_comite;
        this.valor = valor;
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

    @Override
    public String toString() {
        return "ReceitaComiteValor{" + "nome_comite=" + nome_comite + ", valor=" + valor +'}';
    }

    

    
}
