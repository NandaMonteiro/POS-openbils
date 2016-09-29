///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package pos.openbills.controlador;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.reflect.TypeToken;
//import java.io.Serializable;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Named;
//import pos.openbills.MediaComite;
//import pos.openbills.QuantidadeDespesaCandidato;
//import pos.openbills.QuantidadeDespesaCandidatoSoma;
//import pos.openbills.ReceitaComiteValor;
//import pos.openbills.ServerCandidato;
//import pos.openbills.ServerCandidatoService;
//
//
///**
// *
// * @author Izabel Silva
// */
//
//@Named
//@SessionScoped
//public class ControladorCandidato implements Serializable{
//    private int ano = 2002;
//    private JsonArray array;
//    private List<QuantidadeDespesaCandidatoSoma> lista;
//    
//    
////    private List<QuantidadeDespesaCandidatoSoma> list(){
////        ServerCandidatoService serverCandidatoService =  new ServerCandidatoService();
////        ServerCandidato sc = serverCandidatoService.getServerCandidatoPort();
////        return sc.quantidade(this.ano);           
////    }
//    
//    private JsonArray getJsonList() {
//        return (JsonArray) new Gson().toJsonTree(list(),
//                new TypeToken<List<QuantidadeDespesaCandidatoSoma>>() {
//                }.getType());
//    }
//    
//    @PostConstruct
//    public void init(){
//        lista = list();
//        array = getJsonList();
//    }
//
//    public int getAno() {
//        return ano;
//    }
//
//    public void setAno(int ano) {
//        this.ano = ano;
//    }
//
//    public JsonArray getArray() {
//        return array;
//    }
//
//    public void setArray(JsonArray array) {
//        this.array = array;
//    }
//
//    public List<QuantidadeDespesaCandidatoSoma> getLista() {
//        return lista;
//    }
//
//    public void setLista(List<QuantidadeDespesaCandidatoSoma> lista) {
//        this.lista = lista;
//    }
//
//    public String submeter() {
//        //System.out.println(">>>> " + this.ano);
//        this.lista = list();
//        this.array = getJsonList();
//        return null;
//    }
//
//
//
//
//
//}
//    
//    
//
//    
//
