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
public class QuantidadeDespesaCandidato implements Serializable{
    private String siglaPartido;
    private BigInteger qtdeCandidato;


    public QuantidadeDespesaCandidato() {
    }

    public QuantidadeDespesaCandidato(BigInteger qtdeCandidato, String siglaPartido) {
        this.siglaPartido = siglaPartido;
        this.qtdeCandidato = qtdeCandidato;
    }

    public String getSiglaPartido() {
        return siglaPartido;
    }

    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }

    public BigInteger getQtdeCandidato() {
        return qtdeCandidato;
    }

    public void setQtdeCandidato(BigInteger qtdeCandidato) {
        this.qtdeCandidato = qtdeCandidato;
    }

    @Override
    public String toString() {
        return "QuantidadeDespesaCandidato{" + "siglaPartido=" + siglaPartido + ", qtdeCandidato=" + qtdeCandidato + '}';
    }

    
    
    
}


