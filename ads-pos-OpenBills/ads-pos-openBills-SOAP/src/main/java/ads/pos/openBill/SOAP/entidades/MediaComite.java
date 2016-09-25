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
public class MediaComite implements Serializable{
    private String nome_estado;
    private String mediaDespesaComite;

    public MediaComite() {
    }

    public MediaComite(String nome_estado, String media_despesa) {
        this.nome_estado = nome_estado;
        this.mediaDespesaComite = media_despesa;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getMedia_despesa() {
        return mediaDespesaComite;
    }

    public void setMedia_despesa(String media_despesa) {
        this.mediaDespesaComite = media_despesa;
    }

    @Override
    public String toString() {
        return "MediaComite{" + "nome_estado=" + nome_estado + ", mediaDespesaComite=" + mediaDespesaComite + '}';
    }
    
    
}

