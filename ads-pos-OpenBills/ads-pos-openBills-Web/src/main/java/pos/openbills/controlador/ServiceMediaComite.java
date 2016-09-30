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
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import pos.openbills.MediaComite;
import pos.openbills.ServerComite;
import pos.openbills.ServerComiteService;

/**
 *
 * @author Izabel Silva
 */

@Named
@SessionScoped
public class ServiceMediaComite implements Serializable{
    private int ano = 2002;    
    private List<MediaComite> listaMediaComite;    
    private JsonArray arrayMediaComite;
    
    private List<MediaComite> listMediaComite(){
        ServerComiteService serverComiteService = new ServerComiteService();
        ServerComite sc = serverComiteService.getServerComitePort();
        return sc.mediaDespesaComite(this.ano);
    }
    
    private JsonArray getJsonList() {
        return (JsonArray) new Gson().toJsonTree(listMediaComite(),
                new TypeToken<List<MediaComite>>() {
                }.getType());
    }
    
    @PostConstruct
    public void init(){
        listaMediaComite = listMediaComite();
        arrayMediaComite = getJsonList();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public JsonArray getArray() {
        return arrayMediaComite;
    }

    public void setArray(JsonArray array) {
        this.arrayMediaComite = array;
    }

    public List<MediaComite> getListaMediaComite() {
        return listaMediaComite;
    }

    public void setListaMediaComite(List<MediaComite> listaMediaComite) {
        this.listaMediaComite = listaMediaComite;
    }
    
    public String submeter() {
        //System.out.println(">>>> " + this.ano);
        this.listaMediaComite = listMediaComite();
        this.arrayMediaComite = getJsonList();
        return null;
    }
}
