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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciana
 */
public class Migrate {

    public static void main(String[] args) {

        try {
            
//            salvarNoBanco("DespesaCandidato_modificado", 1);
//            
     //       salvarNoBanco("ReceitaComite2004", 2);
//            salvarNoBanco("DespesaCandidato_modificado", 1);
            salvarNoBanco("DespesaCandidato_modificado", 1);
            
            
        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Migrate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void salvarNoBanco(String fileName, int tipo) throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
        // Caminhos dos arquivos de entrada e saida
        String csvFileInput = Main.PASTA_DOS_ARQUIVOS + fileName + ".csv";

        // Separador do arquivo CSV
        String csvSplitBy = ";";

        String line;
        int count = 0;

        // Arquivo de Leitura
        FileReader fileReader = new FileReader(csvFileInput);

        DAOManager dao = new DAOManager();

        // Ler arquivo de entrada
        try (BufferedReader br = new BufferedReader(fileReader)) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                // Exibir resultado
                System.out.println("Linha " + count++ + " - " + line);
                // Adicionar linha ao conteudo de saida
                if (tipo == 1) { // Salvar despesas
                    dao.salvarDespesaComite(line.split(csvSplitBy));
                } else if (tipo == 2) { // salvar receitas
                    dao.salvarReceitasComite(line.split(csvSplitBy));
                }
            }
            // Fechar arquivo
        }
        ConnectionFactory.getInstance().close();

    }

}
