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
    private String cargo;

    public QuantidadeDespesaCandidatoSoma() {
    }

    public QuantidadeDespesaCandidatoSoma(String estado, double soma, String cargo) {
        this.estado = estado;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "QuantidadeDespesaCandidatoSoma{" + "estado=" + estado + ", cargo=" + cargo + ", soma=" + soma + '}';
    }
    
    


}


