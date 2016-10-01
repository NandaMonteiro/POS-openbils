/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Luciana
 */
@XmlRootElement
public class ReceitaComiteValorOrgaos implements Serializable {

    private String estado;
    private BigInteger quantidade_orgaos;
    private double valor_receita_estado;
    

    public ReceitaComiteValorOrgaos() {
    }

    public ReceitaComiteValorOrgaos(String estado, BigInteger quantidade_orgaos, double valor_receita_estado) {
        this.estado = estado;
        this.quantidade_orgaos = quantidade_orgaos;
        this.valor_receita_estado = valor_receita_estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigInteger getQuantidade_orgaos() {
        return quantidade_orgaos;
    }

    public void setQuantidade_orgaos(BigInteger quantidade_orgaos) {
        this.quantidade_orgaos = quantidade_orgaos;
    }

    public double getValor_receita_estado() {
        return valor_receita_estado;
    }

    public void setValor_receita_estado(double valor_receita_estado) {
        this.valor_receita_estado = valor_receita_estado;
    }

    
    
}
