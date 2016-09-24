package ads.pos.openBills.arquivosCSV;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String driver = "org.postgresql.Driver",
            banco = "jdbc:postgresql://localhost:5432/openbills",
            login = "postgres", 
            senha = "123";
    private static Connection conexao = null;

    public ConnectionFactory() {
    }

    public static Connection getInstance() throws ClassNotFoundException, SQLException {
        if (ConnectionFactory.conexao == null) {
            Class.forName(ConnectionFactory.driver);
            ConnectionFactory.conexao = DriverManager.getConnection(ConnectionFactory.banco, ConnectionFactory.login, ConnectionFactory.senha);
        }
        return ConnectionFactory.conexao;
    }

    public void close() throws SQLException {
        ConnectionFactory.conexao.close();
    }
}