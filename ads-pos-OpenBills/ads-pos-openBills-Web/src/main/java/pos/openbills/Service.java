/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.openbills;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import com.google.gson.JsonArray;
/**
 *
 * @author nanda
 */

@Named
@RequestScoped
public class Service {
    
    private List<MediaEstado> lista;
    
    private JsonArray array;
    
    private List<MediaEstado> list(){
        ServerService serverService = new ServerService();
        Server s = serverService.getServerPort();
        return s.despesas(2002);
        
    }
    
    private JsonArray getJsonList(){
        return (JsonArray) new Gson().toJsonTree(list(),
            new TypeToken<List<MediaEstado>>() {
            }.getType());
    }
    
    
    @PostConstruct
    private void init(){
        lista = list();
        array = getJsonList();
    }

    public List<MediaEstado> getLista() {
        return lista;
    }

    public void setLista(List<MediaEstado> lista) {
        this.lista = lista;
    }

    public JsonArray getArray() {
        return array;
    }

    public void setArray(JsonArray array) {
        this.array = array;
    }
    
    
    
    
}
