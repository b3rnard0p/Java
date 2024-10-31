package dao;

import beans.Pessoa;
import java.sql.Connection;
import conexao.Conexao;
import java.util.List;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
    private Conexao conexao;
    private Connection conn;

    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir (Pessoa pessoa){
        try {
            String sql = "INSERT INTO pessoa(nome, sexo, idioma) VALUES (?,?,?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2,pessoa.getSexo());
            stmt.setString(3,pessoa.getIdioma());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir pessoa:"+ex.getMessage());
        }
    } 
    
    public Pessoa getPessoa(int id){
        
        try {
            String sql = "SELECT * FROM pessoa WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Pessoa p = new Pessoa();
            
            rs.first();
            p.setId(id);
            p.setNome(rs.getString("nome"));
            p.setSexo(rs.getString("sexo"));
            p.setIdioma(rs.getString("idioma"));
            return p;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar pessoa: "+ex.getMessage() );
            return null;
        }         
    }
    public void editar (Pessoa pessoa){
        try {
            String sql = "UPDATE pessoa set nome = ?, sexo = ?, idioma = ? WHERE id = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1,pessoa.getNome());
            stmt.setString(2,pessoa.getSexo());
            stmt.setString(3,pessoa.getIdioma());
            stmt.setInt(4, pessoa.getId());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar pessoa:"+ex.getMessage());
        }
    } 
    
      public void excluir (int id){
        try {
            String sql = "DELETE FROM pessoa WHERE id = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir pessoa:"+ex.getMessage());
        }
    } 

    public void excluir(Pessoa p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<Pessoa> getPessoas(){
        
        String sql = "SELECT * FROM pessoa;";
        try {    
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList();
            
            while(rs.next()){
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSexo(rs.getString("sexo"));
                p.setIdioma(rs.getString("idioma"));
                listaPessoas.add(p);      
            }
            return listaPessoas;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as pessoa:"+ex.getMessage());
            return null;
        } 
    }   
    
    public List<Pessoa> getPessoasNomeeSexo(String nome, String sexo){
        
        String sql = "SELECT * FROM pessoa WHERE nome LIKE ? and sexo LIKE ?";
        try {    
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            stmt.setString(1, "%"+nome+"%");
            stmt.setString(2, "%"+sexo+"%");
            ResultSet rs = stmt.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList();
            
            while(rs.next()){
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSexo(rs.getString("sexo"));
                p.setIdioma(rs.getString("idioma"));
                listaPessoas.add(p);      
            }
            return listaPessoas;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar todas as pessoa:"+ex.getMessage());
            return null;
        } 
    }   
}
