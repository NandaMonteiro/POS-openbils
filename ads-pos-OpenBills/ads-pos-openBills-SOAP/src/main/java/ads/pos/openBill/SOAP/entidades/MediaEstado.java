/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBill.SOAP.entidades;

import java.io.Serializable;

/**
 *
 * @author nanda
 */
public class MediaEstado implements Serializable{
    private String estado;
    private double receita ;

    public MediaEstado() {
    }

    public MediaEstado(String estado, double receita) {
        this.estado = estado;
        this.receita = receita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    @Override
    public String toString() {
        return "MediaEstado{" + "estado=" + estado + ", receita=" + receita + '}';
    }
            
    
    
}
