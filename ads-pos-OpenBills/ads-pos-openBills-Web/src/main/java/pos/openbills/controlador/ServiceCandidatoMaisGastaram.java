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
import pos.openbills.QuantidadeDespesaCandidatoSoma;
import pos.openbills.ServerCandidato;
import pos.openbills.ServerCandidatoService;

/**
 *
 * @author Izabel Silva
 */

@Named
@SessionScoped
public class ServiceCandidatoMaisGastaram implements Serializable{
    private int ano = 2004;
    private List<QuantidadeDespesaCandidatoSoma> listaCandidatoMaisGastaram;
    private JsonArray arrayCandidatoMaisGastaram;
    
    private List<QuantidadeDespesaCandidatoSoma> listCandidatoMaisGastaram(){
         ServerCandidatoService serverCandidatiService  = new ServerCandidatoService();
         ServerCandidato sc = serverCandidatiService.getServerCandidatoPort();
         return sc.despesas(this.ano);
    }
    
    private JsonArray getJsonList() {
        return (JsonArray) new Gson().toJsonTree(listCandidatoMaisGastaram(),
                new TypeToken<List<QuantidadeDespesaCandidatoSoma>>() {
                }.getType());
    }
    
    @PostConstruct
    public void init(){
        listaCandidatoMaisGastaram = listCandidatoMaisGastaram();
        arrayCandidatoMaisGastaram = getJsonList();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<QuantidadeDespesaCandidatoSoma> getListaCandidatoMaisGastaram() {
        return listaCandidatoMaisGastaram;
    }

    public void setListaCandidatoMaisGastaram(List<QuantidadeDespesaCandidatoSoma> listaCandidatoMaisGastaram) {
        this.listaCandidatoMaisGastaram = listaCandidatoMaisGastaram;
    }

    public JsonArray getArrayCandidatoMaisGastaram() {
        return arrayCandidatoMaisGastaram;
    }

    public void setArrayCandidatoMaisGastaram(JsonArray arrayCandidatoMaisGastaram) {
        this.arrayCandidatoMaisGastaram = arrayCandidatoMaisGastaram;
    }
    
    public String submeter() {
        //System.out.println(">>>> " + this.ano);
        this.listaCandidatoMaisGastaram = listCandidatoMaisGastaram();
        this.arrayCandidatoMaisGastaram = getJsonList();
        return null;
    }
    
}
