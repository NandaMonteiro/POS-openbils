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
import pos.openbills.ReceitaComiteValor;
import pos.openbills.ServerComite;
import pos.openbills.ServerComiteService;

/**
 *
 * @author Izabel Silva
 */

@Named
@SessionScoped
public class ServiceSomaTotalReceitaPorEstado implements Serializable {
    private int ano = 2002;
    private JsonArray arraySomaTotalReceitaPorEstado;
    private List<ReceitaComiteValor> listaSomaTotalReceitaPorEstado;
    
    private List<ReceitaComiteValor> listReceitaComiteValor(){
        ServerComiteService serverComiteService = new ServerComiteService();
        ServerComite sc = serverComiteService.getServerComitePort();
        return sc.despesasTotalComite(this.ano);
    }
    
    private JsonArray getJsonList() {
        return (JsonArray) new Gson().toJsonTree(listReceitaComiteValor(),
                new TypeToken<List<ReceitaComiteValor>>() {
                }.getType());
    }
    
    @PostConstruct
    public void init(){
        listaSomaTotalReceitaPorEstado = listReceitaComiteValor();
        arraySomaTotalReceitaPorEstado = getJsonList();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public JsonArray getArraySomaTotalReceitaPorEstado() {
        return arraySomaTotalReceitaPorEstado;
    }

    public void setArraySomaTotalReceitaPorEstado(JsonArray arraySomaTotalReceitaPorEstado) {
        this.arraySomaTotalReceitaPorEstado = arraySomaTotalReceitaPorEstado;
    }

    public List<ReceitaComiteValor> getListaSomaTotalReceitaPorEstado() {
        return listaSomaTotalReceitaPorEstado;
    }

    public void setListaSomaTotalReceitaPorEstado(List<ReceitaComiteValor> listaSomaTotalReceitaPorEstado) {
        this.listaSomaTotalReceitaPorEstado = listaSomaTotalReceitaPorEstado;
    }
    
    public String submeter() {
        //System.out.println(">>>> " + this.ano);
        this.listaSomaTotalReceitaPorEstado = listReceitaComiteValor();
        this.arraySomaTotalReceitaPorEstado = getJsonList();
        return null;
    }
    
    
}
