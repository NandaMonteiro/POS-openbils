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
public class MediaComite implements Serializable{
    private String nomeEstado;
    private double mediaDespesaComite;

    public MediaComite() {
    }

    public MediaComite(String nomeEstado, double mediaDespesaComite) {
        this.nomeEstado = nomeEstado;
        this.mediaDespesaComite = mediaDespesaComite;
    }
    
    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public double getMediaDespesaComite() {
        return mediaDespesaComite;
    }

    public void setMediaDespesaComite(double mediaDespesaComite) {
        this.mediaDespesaComite = mediaDespesaComite;
    }

    @Override
    public String toString() {
        return "MediaComite{" + "nomeEstado=" + nomeEstado + ", mediaDespesaComite=" + mediaDespesaComite + '}';
    }


    
    
}

