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
import pos.openbills.QuantidadeDespesaCandidato;
import pos.openbills.ServerCandidato;
import pos.openbills.ServerCandidatoService;

/**
 *
 * @author Izabel Silva
 */

@Named
@SessionScoped
public class ServiceCandidatoPorPartido implements Serializable{
    private int ano = 2002;
    private JsonArray arrayServiceCandidatoPorPartido;
    private List<QuantidadeDespesaCandidato> listaServiceCandidatoPorPartido;
    
    private List<QuantidadeDespesaCandidato> listServiceCandidatoPorPartido(){
        ServerCandidatoService serverComiteService = new ServerCandidatoService();
        ServerCandidato sc = serverComiteService.getServerCandidatoPort();
        return sc.quantidadeCandidato(this.ano);
    }
    
    private JsonArray getJsonList() {
        return (JsonArray) new Gson().toJsonTree(listServiceCandidatoPorPartido(),
                new TypeToken<List<QuantidadeDespesaCandidato>>() {
                }.getType());
    }
    
    @PostConstruct
    public void init(){
        listaServiceCandidatoPorPartido = listServiceCandidatoPorPartido();
        arrayServiceCandidatoPorPartido = getJsonList();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public JsonArray getArrayServiceCandidatoPorEstado() {
        return arrayServiceCandidatoPorPartido;
    }

    public void setArrayServiceCandidatoPorEstado(JsonArray arrayServiceCandidatoPorEstado) {
        this.arrayServiceCandidatoPorPartido = arrayServiceCandidatoPorEstado;
    }

    public List<QuantidadeDespesaCandidato> getListaServiceCandidatoPorPartido() {
        return listaServiceCandidatoPorPartido;
    }

    public void setListaServiceCandidatoPorPartido(List<QuantidadeDespesaCandidato> listaServiceCandidatoPorPartido) {
        this.listaServiceCandidatoPorPartido = listaServiceCandidatoPorPartido;
    }
    
    public String submeter() {
        //System.out.println(">>>> " + this.ano);
        this.listaServiceCandidatoPorPartido = listServiceCandidatoPorPartido();
        this.arrayServiceCandidatoPorPartido = getJsonList();
        return null;
    }
    
    
}

