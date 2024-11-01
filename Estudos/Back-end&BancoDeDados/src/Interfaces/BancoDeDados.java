package Interfaces;
import beans.Pessoa;
import conexao.Conexao;
import dao.PessoaDAO;

public class BancoDeDados {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        p.setNome("Ricardo");
        p.setSexo("M");
        p.setIdioma("Português");
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
        
    
    }
}
