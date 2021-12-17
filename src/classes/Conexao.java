package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao() {
        Connection conexao = null;
        String usuario = "root";
        String senha = "";
        //String caminho = "jdbc:mysql://localhost:3306/bdeleicoes";
        String caminho = "jdbc:mysql://localhost:3306/bdeleicoes"; // conector: mariadb-java-client-2.7.1.jar
        try {
            conexao = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Conexao efetuada com sucesso !!!");
        } catch (SQLException erro) {
            System.out.println("Erro efetuar conexão com o "
                    + "banco de dados: " + erro);
        }
        return conexao;
    }
}