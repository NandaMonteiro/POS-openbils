/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.openbills.controlador;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import pos.openbills.ReceitaComiteValorOrgaos;
import pos.openbills.ServerComite;
import pos.openbills.ServerComiteService;

/**
 *
 * @author Izabel Silva
 */

@Named
@SessionScoped
public class ServiceOrgaosComiteEstado implements Serializable{
    private List<ReceitaComiteValorOrgaos> listaOrgaoComiteEstado;
    private JsonArray arrayOrgaoComiteEstado;
    private int ano = 2002;
    
    private List<ReceitaComiteValorOrgaos> listReceitaComiteEstado(){
        ServerComiteService serverComiteService = new ServerComiteService();
        ServerComite sc = serverComiteService.getServerComitePort();
        return sc.orgaosEstado(this.ano);
    }
    
    private JsonArray getJsonList() {
        return (JsonArray) new Gson().toJsonTree(listReceitaComiteEstado(),
                new TypeToken<List<ReceitaComiteValorOrgaos>>() {
                }.getType());
    }
    
    @PostConstruct
    public void init(){
        listaOrgaoComiteEstado = listReceitaComiteEstado();
        arrayOrgaoComiteEstado = getJsonList();
    }

    public List<ReceitaComiteValorOrgaos> getListaOrgaoComiteEstado() {
        return listaOrgaoComiteEstado;
    }

    public void setListaOrgaoComiteEstado(List<ReceitaComiteValorOrgaos> listaOrgaoComiteEstado) {
        this.listaOrgaoComiteEstado = listaOrgaoComiteEstado;
    }

    public JsonArray getArrayOrgaoComiteEstado() {
        return arrayOrgaoComiteEstado;
    }

    public void setArrayOrgaoComiteEstado(JsonArray arrayOrgaoComiteEstado) {
        this.arrayOrgaoComiteEstado = arrayOrgaoComiteEstado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String submeter() {
        //System.out.println(">>>> " + this.ano);
        this.listaOrgaoComiteEstado = listReceitaComiteEstado();
        this.arrayOrgaoComiteEstado = getJsonList();
        return null;
    }
}
