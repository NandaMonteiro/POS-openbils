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
    private String estado;
    private double soma;


    public QuantidadeDespesaCandidatoSoma() {
    }

    public QuantidadeDespesaCandidatoSoma(String estado, double soma) {
        this.estado = estado;
        this.soma = soma;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    @Override
    public String toString() {
        return "QuantidadeDespesaCandidatoSoma{" + "estado=" + estado + ", soma=" + soma + '}';
    }


}


