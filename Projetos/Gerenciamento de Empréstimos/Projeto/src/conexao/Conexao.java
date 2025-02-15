package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    public Connection getConexao() {
        Connection conn;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/<Nome_do_Banco>?userTimeZone=true&serverTimeZone=UTC",
                    "root", "<Senha_do_Banco>");
            System.out.println("Conexão efetuada!");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar no BD" + e.getMessage());
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

}
