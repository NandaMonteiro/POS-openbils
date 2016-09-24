/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads.pos.openBills.arquivosCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luciana
 */
public class Main {
    
    public static final String PASTA_DOS_ARQUIVOS = "C:/teste/";
    public static final String[] NOME_DOS_ARQUIVOS = new String[] {
        "DespesaCandidato", "ReceitaCandidato2004" 
    };

    public static void main(String[] args) throws FileNotFoundException, IOException {

        for (String fileName : NOME_DOS_ARQUIVOS) {
            createFileOutput(fileName);
        }

    }
    
    public static void createFileOutput(String fileName) throws FileNotFoundException, IOException {
        // Caminhos dos arquivos de entrada e saida
        String csvFileInput = PASTA_DOS_ARQUIVOS + fileName + ".csv";
        String csvFileOutput = PASTA_DOS_ARQUIVOS + fileName + "_modificado.csv";
        
        // Separador do arquivo CSV
        String cvsSplitBy = ",";
        
        // Conteudo de saida apos a atualizacao
        String content = "";
        String line = "";
        int count = 0;

        // Arquivo de Leitura
        FileReader fileReader = new FileReader(csvFileInput);
        
        // Arquivo de escrita
        FileOutputStream fileOut = new FileOutputStream(csvFileOutput);

        // Ler arquivo de entrada e atualizar o conteudo
        BufferedReader br = new BufferedReader(fileReader);
        while ((line = br.readLine()) != null) {
            // Adicionar aspas ao inicio e ao fim da linha
            String lineUpdated = "\"" + line + "\"\n";
            // Exibir resultado
            System.out.println("Linha " + count++ + " - " + lineUpdated);
            // Adicionar linha ao conteudo de saida
            fileOut.write(lineUpdated.getBytes());
        }
        // Fechar arquivo
        br.close();
        
        // Fechar arquivo
        fileOut.flush();
        fileOut.close();
    }

}
