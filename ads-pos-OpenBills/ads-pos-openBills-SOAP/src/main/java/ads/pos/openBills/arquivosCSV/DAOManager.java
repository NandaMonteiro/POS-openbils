/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBills.arquivosCSV;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Luciana
 */
public class DAOManager {
    
    public static final int SIZE_RECEITAS = 18;
    public static final int SIZE_RECEITASCOMITE = 15;
    public static final int SIZE_DESPESAS = 22;
    public static final int SIZE_DESPESASCOMITE = 18;
    
  //  public static final String TABELA_DESPESAS_CANDIDATOS = "tabeladespesacandidatos";
    public static final String TABELA_RECEITAS_CANDIDATOS_2004 = "receitas_comite2004";
    public static final String TABELA_DESPESA_CANDIDATOS_2004 = "despesa_candidato2004";
    public static final String TABELA_DESPESA_COMITE_2004 = "despesa_comite2004 ";
    
    
    
    public void salvarReceitas(String[] vector) throws SQLException, ClassNotFoundException {
        
        String sql = "INSERT INTO " + TABELA_RECEITAS_CANDIDATOS_2004 + "(NO_CAND,\n" +
"DS_CARGO,\n" +
"CD_CARGO ,\n" +
"NR_CAND ,\n" +
"SG_UE_SUP ,\n" +
"NO_UE ,\n" +
"SG_UE ,\n" +
"NR_PART ,\n" +
"SG_PART ,\n" +
"VR_RECEITA ,\n" +
"DT_RECEITA ,\n" +
"RTRIM ,\n" +
"CD_TITULO ,\n" +
"DECODE ,\n" +
"TP_RECURSO ,\n" +
"NO_DOADOR ,\n" +
"CD_CPF_CGC_DOA ,\n" +
"RV_MEANING)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pst = ConnectionFactory.getInstance().prepareStatement(sql);
        for (int i = 0; i < SIZE_RECEITAS; i++) {
            pst.setString(i + 1, vector[i].replace("\"", ""));
        }
        pst.execute();
        
    }
    
//    public void salvarDespesas(String[] vector) throws SQLException, ClassNotFoundException {
//        
//        String sql = "INSERT INTO " + TABELA_DESPESAS_CANDIDATOS + " (coluna1, coluna2, coluna3, coluna4, coluna5, coluna6, coluna7, coluna8, coluna9, coluna10, coluna11, coluna12, coluna13, coluna14, coluna15, coluna16, coluna17, coluna18, coluna19, coluna20, coluna21, coluna22) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        
//        PreparedStatement pst = ConnectionFactory.getInstance().prepareStatement(sql);
//        for (int i = 0; i < SIZE_DESPESAS; i++) {
//            pst.setString(i + 1, vector[i].replace("\"", ""));
//        }
//        pst.execute();
//        
//    }
    
    
        public void salvarReceitasComite(String[] vector) throws SQLException, ClassNotFoundException {
        
        String sql = "INSERT INTO " + TABELA_RECEITAS_CANDIDATOS_2004 + "(DS_ORGAO,\n" +
"NR_PART,\n" +
"SG_PART,\n" +
"SG_UE_SUP,\n" +
"NO_UE,\n" +
"SG_UE,\n" +
"VR_RECEITA,\n" +
"DT_RECEITA,\n" +
"DS_TITULO,\n" +
"RTRIM,\n" +
"CD_TITULO,\n" +
"TP_RECURSO,\n" +
"NO_DOADOR,\n" +
"CD_CPF_CGC_DOA,\n" +
"RV_MEANING)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pst = ConnectionFactory.getInstance().prepareStatement(sql);
        for (int i = 0; i < SIZE_RECEITASCOMITE; i++) {
            pst.setString(i + 1, vector[i].replace("\"", ""));
        }
        pst.execute();
        
    }
    
    
        public void salvarDespesaCandidato(String[] vector) throws SQLException, ClassNotFoundException {
        
        String sql = "INSERT INTO " + TABELA_DESPESA_CANDIDATOS_2004 + "(NO_CAND,\n" +
" DS_CARGO,\n" +
" CD_CARGO,\n" +
" NR_CAND,\n" +
" SG_UE_SUP,\n" +
" NO_UE,\n" +
" SG_UE,\n" +
" NR_PART,\n" +
" SG_PART,\n" +
" VR_DESPESA,\n" +
" DT_DOC_DESP,\n" +
" DS_TITULO,\n" +
" CD_TITULO,\n" +
" DECODE,\n" +
" TP_RECURSO,\n" +
" NR_DOC_DESP ,\n" +
" DS_TIPO_DOCUMENTO,\n" +
" CD_DOC,\n" +
" NO_FOR,\n" +
" CD_CPF_CGC,\n" +
" DS_MUNIC,\n" +
" RV_MEANING)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pst = ConnectionFactory.getInstance().prepareStatement(sql);
        for (int i = 0; i < SIZE_DESPESAS; i++) {
            pst.setString(i + 1, vector[i].replace("\"", ""));
        }
        pst.execute();
        
    }
    
        public void salvarDespesaComite(String[] vector) throws SQLException, ClassNotFoundException {
        
        String sql = "INSERT INTO " + TABELA_DESPESA_COMITE_2004 + "(DS_ORGAO,\n" +
"NR_PART,\n" +
"SG_PART,\n" +
"SG_UE_SUP,\n" +
"NO_UE,\n" +
"SG_UE,\n" +
"VR_DESPESA,\n" +
"DT_DOC_DESP, \n" +
"RTRIM,\n" +
"CD_TITULO,\n" +
"DECODE,\n" +
"TP_RECURSO,\n" +
"NR_DOC_DESP,\n" +
"DS_TIPO_DOCUMENTO,\n" +
"CD_DOC,\n" +
"NO_FOR, \n" +
"CD_CPF_CGC,\n" +
"RV_MEANING)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement pst = ConnectionFactory.getInstance().prepareStatement(sql);
        for (int i = 0; i < SIZE_DESPESASCOMITE; i++) {
            pst.setString(i + 1, vector[i].replace("\"", ""));
        }
        pst.execute();
        
    }
    
    
    
    
    
}
